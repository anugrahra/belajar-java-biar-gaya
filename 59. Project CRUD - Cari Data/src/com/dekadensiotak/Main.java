package com.dekadensiotak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
                    // tambah data
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    // ubah data
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    // hapus data
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih (1-5)");
            }

            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan (y/n)? ");
        }

    } // akhir main

    private static void cariData() throws IOException {
        // membaca database ada atau tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        // mengambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();

        String[] keywords = cariString.split("\\s+");

        // cek keyword di database
        cekBukuDiDatabase(keywords);

    } // akhir cari data

    private static void cekBukuDiDatabase(String[] keywords) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist;
        int nomorData = 0;

        System.out.println("\n| NO |\tTAHUN |\tPENULIS                |\tPENERBIT               |\tJUDUL BUKU");
        System.out.println("------------------------------------------------------------------------------------------------------");

        while(data != null) {

            // cek keywords di dalam baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keywordnya cocok maka tampilkan

            if(isExist) {
                nomorData++;
                StringTokenizer stringToken = new StringTokenizer(data, ",");

                stringToken.nextToken();
                System.out.printf("| %2d ", nomorData);
                System.out.printf("|\t%4s  ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%s   ", stringToken.nextToken());
                System.out.print("\n");
            }

            data = bufferInput.readLine();
        }

        System.out.println("------------------------------------------------------------------------------------------------------");
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

    } // akhir tampilkanData

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
    } // akhir getYesOrNo

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
    } // akhir clearScreen
}
