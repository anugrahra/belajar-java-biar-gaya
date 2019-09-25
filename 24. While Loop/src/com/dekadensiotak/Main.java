package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // while loop teh adalah salah satu pengulangan
        // jika kondisi true, maka akan dilakukan aksi perulangannya

        // while (kondisi) {
        //     aksi;
        // }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 10) {
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");
    }
}
