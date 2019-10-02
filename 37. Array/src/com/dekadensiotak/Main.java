package com.dekadensiotak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ARRAY
        // merupakan salah satu data collection
        // adalah kumpulan data primitif
        // tipe datanya harus sama

        // tipeData[] namaArray = {komponen, komponen, komponen, ...}

        int[] arrayAngka = {2, 3, 4};

        // indexnya dimulai dari 0

        arrayAngka[1] = 10;
        // syntax di atas akan merubah komponen array menjadi {2, 10, 4}

        // String[] di atas juga merupakan array

        System.out.println("ASSIGNMENT ARRAY");
        int[] arrayInteger = {1,2,3,4};
        // mencetak addressnya
        // yang merupakan alokasi memori (stack)
        // array adalah memory heap. jadi tidak berurutan nyimpennya
        System.out.println(arrayInteger);
        // kalau mau liat nilainya harus ditulis indexnya
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println("DEKLARASI ARRAY");
        // Array di Java merupakan sebuah objek
        // jadi harus diperlakukan sebagai objek
        // tipeData[] nama = new tipeData[jumlahArray];

        float[] arrayFloat = new float[5];

        // merubah komponen array
        arrayFloat[3] = 11.6F;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        // daripada manggil index satu-satu, bisa juga begini
        // ngambil dari java.util.Arrays
        System.out.println(Arrays.toString(arrayFloat));
    }
}
