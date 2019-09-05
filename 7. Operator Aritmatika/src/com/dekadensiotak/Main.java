package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // Operasi Aritmatika

        // deklarasiin dulu bray
        int variable1 = 9;
        int variable2 = 3;

        int hasil;

        System.out.println("Pake tipe data integer");

        // 1. penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // integer semua kan nih ye, bisa pake printf nih
        // ini nih dokumentasi untuk formatter biar kagak bingung: https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax

        // 2. pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n", variable1, variable2, hasil);

        // 3. perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n", variable1, variable2, hasil);

        // 4. pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);

        // 5. modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n\n", variable1, variable2, hasil);

        System.out.println("pake tipe data float");

        float a = 5;
        float b = 3;
        float hasilFloat;

        hasilFloat = a / b;
        System.out.printf("%f / %f = %f \n", a, b, hasilFloat);

        hasilFloat = a % b;
        System.out.printf("%f %% %f = %f \n", a, b, hasilFloat);
    }
}
