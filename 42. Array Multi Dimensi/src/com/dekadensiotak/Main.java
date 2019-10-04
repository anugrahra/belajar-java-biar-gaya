package com.dekadensiotak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // ARRAY MULTIDIMENSI
        // banyak array dalam satu array. kumaha tah?

        //     |      | ---------- 1 dimensi --------
        // 1 dimensi  | {komponen, komponen, komponen}
        //     |      | {komponen, komponen, komponen}

        // di atas itu array 2 dimensi
        // tambah layer lagi, jadi 3 dimensi

        // ARRAY 1 DIMENSI
        int[] array1D = {1,2,3,4,5};

        // ARRAY 2 DIMENSI
        // dengan assignment
        int[][] array2D = {{1,2,3,4,5} , {6,7,8,9,10}};
        // bisa juga ditulis begini biar bacanya gampil
        int[][] arrayAnother2D = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        // meilhat addressnya
        System.out.println(Arrays.toString(array2D));
        // lihat isinya
        System.out.println(Arrays.deepToString(array2D));
        printArray2D(arrayAnother2D);

        // dengan deklarasi
        // int[baris][kolom]
        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);
        System.out.println(arrayAngka.length);

        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println(Arrays.toString(arrayAngka[i]));
        }
        System.out.println("===========");
        loopPrintArray2D(array2D);

        // looping lengkap secara manual
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayAngka[i].length; j++) {
                System.out.print(arrayAngka[i][j] + ",");
            }
            System.out.print("]\n");
        }

        // looping foreach
        for (int[] baris: arrayAngka) {
            for (int angka: baris) {
                System.out.print(angka + ",");
            }
            System.out.print("\n");
        }

        // RAGGED ARRAY\
        // di java mah bisa coy
        int[][] arrayRagged = {
                {1,2},
                {1,2,3},
                {1,2,3,4}
        };
        printArray2D(arrayRagged);
    }

    private static void printArray2D(int[][] dataArray) {
        System.out.println(Arrays.deepToString(dataArray));
    }

    private static void loopPrintArray2D(int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
