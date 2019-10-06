package com.dekadensiotak;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // string literal. memasukan nilainya dengan ditulis begini
        // disimpen di string pool
        String kalimat = "sia goblog pisan";

        // mengambil komponen String
        System.out.println(kalimat.charAt(8));

        // substring
        String kata = kalimat.substring(4,10);
        System.out.println(kata);

        // concatenation (concat)
        String kalimat2 = kata + " maneh";
        System.out.println(kalimat2);

        kata = "mantan " + kata;
        System.out.println(kata);

        // concat dengan non string
        // ini teh semua dirubah dulu jadi string
        // sejatinya println itu untuk string
        int jumlah = 1;
        String kalimat3 = kata + " ada " + jumlah;
        System.out.println(kalimat3);
        System.out.println(kata + " ada " + jumlah);

        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("pisan", "anjing");
        System.out.println(kalimat4);

        // equality (persamaan)
        String kataInput = "anjing"; // ini ada string pool
        String kataTest = "anjing"; // ini juga ada di string pool
        String kataInput2 = new String("anjing"); // ini tidak ada di string pool, karena bukan literal

        // persamaan pada lokasi string pool
        // string itu yang dicek addressnya
        if (kataInput == kataTest) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.println("\nBilang dong");
        kataInput = userInput.next();
        System.out.println("lalu kamu bilang: " + kataInput);

        if (kataInput == kataTest) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        // kalau mau ngecek valuenya, gini nih
        if (kataInput.equals(kataTest)) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        // compare
        // membandingkan berdasarkan urutan alfabetik
        String mantan1 = "Karina";
        String mantan2 = "Vania";
        System.out.println(mantan1.compareTo(mantan2));
        System.out.println(mantan2.compareTo(mantan1));
        // alfabetiknya kayak kamus boy
        // jadi kalau huruf pertama sama. lanjut ke huruf selanjutnya
        String cinta1 = "Cinta";
        String cinta2 = "Cayang";
        System.out.println(cinta1.compareTo(cinta2));
    }
}
