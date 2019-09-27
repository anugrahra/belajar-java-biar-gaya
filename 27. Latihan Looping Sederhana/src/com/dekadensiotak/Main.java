package com.dekadensiotak;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // KASUS
        // nilai awal = 1
        // nilai akhir = 10
        // total = 1 + 2 + 3 + 4 + 5 + 6 + 7+ 8 + 9 + 10 = 55

        // total(0) = 0
        // total(1) = total(0) + 1
        // total(2) = total(1) + 2
        // dst

        // total sekarang = total sebelumnya + nilai awal sekarang
        // nilai awal selanjutnya = nilai awal sekarang + 1

        // PROGRAM MENJUMLAHKAN ANGKA DENGAN RENTANG

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        // total adalah variable bergerak (dummy variable)
        // karena nilainya akan berubah-ubah ketika looping
        total = 0;

        // WHILE LOOP
        System.out.println("WHILE LOOP");
        while (nilaiAwal <= nilaiAkhir) {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

        // DO WHILE LOOP
//        System.out.println("DO WHILE");
//        do {
//            total = total + nilaiAwal;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//            nilaiAwal++;
//        } while (nilaiAwal <= nilaiAkhir);

        // FOR LOOP
//        System.out.println("FOR LOOP");
//        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
//            total = total + nilaiAwal;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//        }
    }
}
