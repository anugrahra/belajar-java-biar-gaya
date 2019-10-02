package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {
	    // array juga bisa kayak gini dong
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        // looping standard
        // 10 teh ngikutin banyaknya komponen array yang hanya 9
        System.out.println("LOOPING STANDARD");
        for (int i = 0; i < 10; i++) {
            System.out.println("index ke - " + i + " adalah = " + arrayAngka[i]);
        }

        // looping dengan property array
        System.out.println("LOOPING DENGAN PROPERT ARRAY");
        System.out.println(arrayAngka.length); // mengetahui panjang array
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("index ke - " + i + " adalah = " + arrayAngka[i]);
        }

        // looping khusus untuk collection <- array
        System.out.println("looping for each");
        // for (tipeData namaKomponen : namaArray)
        // dipakai pada saat tidak menggunakan index
        for (int angka : arrayAngka) {
            System.out.println("angka pada looping ini = " + angka);
        }
    }
}
