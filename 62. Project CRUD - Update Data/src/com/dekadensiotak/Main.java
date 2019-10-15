package com.dekadensiotak;

import java.io.*;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    // tampilkan data
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    tambahData();
                    tampilkanData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    hapusData();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih (1-5)");
            }

            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan (y/n)? ");
        }

    }

    private static void updateData() throws IOException {
        // ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan diupdate: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin diupdate
        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null) {
            entryCounts++;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan entryCounts == updateNum
            if (updateNum == entryCounts) {
                System.out.println("\nData yang ingin anda update adalah: ");
                System.out.println("---------------------------------------");
                System.out.println("Referensi           : " + st.nextToken());
                System.out.println("Tahun               : " + st.nextToken());
                System.out.println("Penulis             : " + st.nextToken());
                System.out.println("Penerbit            : " + st.nextToken());
                System.out.println("Judul               : " + st.nextToken());

                // update data

                // mengambil input dari user
                String[] fieldData = {"tahun", "penulis", "penerbit", "judul"};
                String[] tempData = new String[4];

                // refresh token
                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();

                for (int i = 0; i < fieldData.length; i++) {
                    boolean isUpdate = getYesOrNo("Apakah anda ingin merubah " + fieldData[i] + " (y/n)? ");
                    originalData = st.nextToken();
                    if (isUpdate) {
                        // user input
                        if (fieldData[i].equalsIgnoreCase("tahun")) {
                            System.out.print("Masukan tahun terbit (YYYY): ");
                            tempData[i] = ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine();
                        }

                    } else {
                        tempData[i] = originalData;
                    }
                }
                // tampilkan data baru ke layar
                st = new StringTokenizer(data,",");
                st.nextToken();
                System.out.println("\nData baru anda adalah: ");
                System.out.println("---------------------------------------");
                System.out.println("Tahun               : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis             : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit            : " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul               : " + st.nextToken() + " --> " + tempData[3]);

                boolean isUpdate = getYesOrNo("apakah anda yakin akan merubah data itu (y/n)?");

                if (isUpdate) {
                    // cek data baru di database
                    boolean isExist = cekBukuDiDatabase(tempData,false);

                    if (isExist) {
                        System.err.println("Data buku sudah ada di database. Proses update dibatalkan.");
                        System.err.println("Silahkan hapus data yang bersangkutan");
                        bufferedOutput.write(data);
                    } else {
                        // format data baru ke dalam database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        // membuat primary key
                        long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

                        String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
                        String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                        // tulis data ke database
                        bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                    }
                } else {
                    // copy data
                    bufferedOutput.write(data);
                }
            } else {
                // copy data
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }
        // menulis data ke file
        bufferedOutput.flush();

        // delete original database
        database.delete();
        // rename file tempDB ke database
        tempDB.renameTo(database);
    }

    private static void hapusData() throws IOException {
        // ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // membuat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // ambil user input untuk hapus data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n\nMasukan nomor buku yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk baca tiap data baris dan skip data yang akan dihapus
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null) {
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data,",");
            // tampilkan data yang ingin dihapus
            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("------------------------------------");
                System.out.println("Referensi         :" + st.nextToken());
                System.out.println("Tahun             :" + st.nextToken());
                System.out.println("Penulis           :" + st.nextToken());
                System.out.println("Penerbit          :" + st.nextToken());
                System.out.println("Judul             :" + st.nextToken());

                isDelete = getYesOrNo("Apakah anda yakin akan menghapus data ini (y/n)?");
            }
            if (isDelete) {
                // skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // pindahkan data original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        // menulis data ke file tempDB.txt
        bufferedOutput.flush();
        // delete database original
        database.delete();
        // rename tempDB menjadi database
        tempDB.renameTo(database);
    }

    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        System.out.println("\n| NO |\tTAHUN |\tPENULIS                |\tPENERBIT               |\tJUDUL BUKU");
        System.out.println("------------------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data != null) {
            nomorData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%s   ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println("------------------------------------------------------------------------------------------------------");

    }

    private static void cariData() throws IOException {
        // membaca database ada atau tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        // mengambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();

        String[] keywords = cariString.split("\\s+");

        // cek keyword di database
        cekBukuDiDatabase(keywords, true);

    }

    private static void tambahData() throws IOException {

        FileWriter fileOutput = new FileWriter("database.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan tahun terbit (YYYY): ");
        tahun = ambilTahun();

        // cek buku di database
        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};

        boolean isExist = cekBukuDiDatabase(keywords, false);

        // menulis buku di database
        if(!isExist){
            // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

            String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
            String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah:");
            System.out.println("-------------------------------------");
            System.out.println("Primary Key  : " + primaryKey);
            System.out.println("Tahun terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Judul        : " + judul);
            System.out.println("Penerbit     : " + penerbit);

            boolean isTambah = getYesOrNo("Apakah anda ingin menambahkan data tersebut (y/n)?");

            if(isTambah) {
                bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        } else {
            System.out.println("Buku yang anda akan masukan sudah tersedia di database dengan data berikut: ");
            cekBukuDiDatabase(keywords, true);
        }

        bufferOutput.close();
    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while(data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+","");
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();
            }

            data = bufferInput.readLine();
        }

        return entry;
    }

    private static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if(isDisplay) {
            System.out.println("\n| NO |\tTAHUN |\tPENULIS                |\tPENERBIT               |\tJUDUL BUKU");
            System.out.println("------------------------------------------------------------------------------------------------------");
        }

        while(data != null) {

            // cek keywords di dalam baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keywordnya cocok maka tampilkan

            if(isExist) {
                if(isDisplay) {
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    stringToken.nextToken();
                    System.out.printf("| %2d ", nomorData);
                    System.out.printf("|\t%4s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%s   ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }

            data = bufferInput.readLine();
        }

        if(isDisplay) {
            System.out.println("------------------------------------------------------------------------------------------------------");
        }

        return isExist;
    }

    private static String ambilTahun() throws IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        while(!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e) {
                System.out.println("Format tahun salah");
                System.out.print("Masukan tahun terbit lagi (YYYY): ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }

        return tahunInput;
    }

    private static boolean getYesOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message);
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message);
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\022\143");
            }
        } catch (Exception ex) {
            System.out.println("tidak bisa clear screen");
        }
    }
}
