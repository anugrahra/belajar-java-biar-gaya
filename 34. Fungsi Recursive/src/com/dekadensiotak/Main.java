package com.dekadensiotak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // RECURSIVE FUNCTION

        // mereturn fungsi itu sendiri
        // menggunakan memory allocation

        // fungsi (parameter) {
        //      some calculation;
        //      some calculation;
        //      return fungsi (parameter)
        // }

        // CONTOH BOS

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);
        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil faktorial = " + faktorial);
    }

    // fungsi rekursif sederhana

    private static int jumlahNilai(int parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static int hitungFaktorial(int parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 1) {
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println("nilai = " + parameter);

        // dikondisikan biar gak eror
        if (parameter == 0) {
            return;
        }

        parameter--;

        printNilai(parameter);
    }
}
