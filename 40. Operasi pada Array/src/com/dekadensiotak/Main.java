package com.dekadensiotak;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // OPERASI PADA ARRAY

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\nMerubah Array jadi String\n========================");
        printArray(arrayAngka1);

        // copy array menjadi
        System.out.println("\nCopy Array jadi String\n========================");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\ncopy dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\ncopy dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\ncopy dengan copyOfRange");
        // index yang belakang ga diambil coy
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nFill Array\n========================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\nKomparasi Array\n========================");
        int[] arrayAngka6 = {6,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,8,5};

        // kagak bisa pake begini ya
        // bakal false
        if (arrayAngka6 == arrayAngka7) {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        // tapi pake ini
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        if (Arrays.equals(arrayAngka6, arrayAngka7)) {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        System.out.println("\ncek array yang lebih besar");
        // hasil = 0 maka sama besar
        // hasil = 1 arrayPertama lebih besar
        // hasil = -1 arrayKedua lebih besar
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        System.out.println("\ncek mana index yang berbeda");
        // tapi cuman satu index doang
        // index yang terawal ketemu beda
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        // sort array
        System.out.println("\nSort Array\n========================");
        int[] arrayAngka8 = {4,5,3,8,9,10,13,7};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // search array
        System.out.println("\nKomparasi Array\n========================");
        int angka = 10;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("Angka " + angka + " ada di index " + posisi);
    }

    private static void printArray(int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
