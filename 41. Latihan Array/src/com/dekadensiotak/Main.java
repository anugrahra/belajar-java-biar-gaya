package com.dekadensiotak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arrayAngka1 = {1,2,6,7,5,4,6,9,4,5,6,8,6};
        int[] arrayAngka2 = {6,4,6,7,5,7,3,9,4,5,9,8,0};

        // penjumlahan antara dua array
        System.out.println("===== PENJUMLAHAN DUA ARRAY =====");
        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);

        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil1, "hasil 1");

        // menggabungkan dua array
        System.out.println("\n===== MENGGABUNGKAN DUA ARRAY =====");
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }

        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "hasil 2");

        // Reverse sort
        System.out.println("\n===== REVERSE SORT =====");
        printArray(arrayAngka1, "array 1");
        Arrays.sort(arrayAngka1);
        printArray(arrayAngka1, "sorted ");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "reversed");
        System.out.println("----------");
        printArray(arrayAngka2, "array 2");
        Arrays.sort(arrayAngka2);
        printArray(arrayAngka2, "sorted ");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "reversed");
    }

    private static void reverse(int[] dataArray) {
        Arrays.sort(dataArray);

        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - i) - 1];
        }
    }

    private static void reverse2(int[] dataArray) {
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length / 2; i++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - i) - 1];
            dataArray[(dataArray.length - i) - 1] = buffer;
        }
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] arrayHasil = new int[arrayInt1.length];

        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }

        return arrayHasil;
    }

    private static void printArray(int[] dataArray, String message) {
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}
