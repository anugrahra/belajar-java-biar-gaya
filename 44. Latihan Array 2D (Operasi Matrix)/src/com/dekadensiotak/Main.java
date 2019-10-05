package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {
        System.out.println("OPERASI MATRIX");

        // MATRIX

        // penjumlahan
        // a = |1 2 3|  b = |11 12 13| c = a+b = |1 2 3|   |11 12 13| = |12 14 16|
        //     |4 5 6|      |14 15 16|           |4 5 6| + |14 15 16|   |18 20 22|
        //     |7 8 9|      |17 18 19|           |7 8 9|   |17 18 19|   |24 26 28|

        int[][] matrix_a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix_b = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };

        printArray(matrix_a);
        printArray(matrix_b);

        System.out.println("Hasil Penjumlahan");

        int[][] hasilTambah = tambah(matrix_a, matrix_b);

        printArray(hasilTambah);

        // perkalian
        // a = |1 2|  b = |11 12| c = a * b = |(1*11)+(2*13) (2*12)+(2*14)| = |37 40|
        //     |3 4|      |13 14|             |(3*11)+(4*13) (3*12)+(4*14)|   |85 92|

        int[][] matrix_c = {
                {1,2},
                {3,4}
        };

        int[][] matrix_d = {
                {11,12},
                {13,14}
        };

        System.out.println("Hasil Perkalian");

        int[][] hasilKali = kali(matrix_c, matrix_d);

        printArray(hasilKali);
    }

    private static int[][] tambah(int[][] matrix_1, int[][] matrix_2) {
        int baris_1 = matrix_1.length;
        int kolom_1 = matrix_1[0].length;

        int baris_2 = matrix_2.length;
        int kolom_2 = matrix_2[0].length;

        int[][] hasil = new int[baris_1][kolom_1];

        if (baris_1 == baris_2 && kolom_1 == kolom_2) {
            for (int i = 0; i < baris_1; i++) {
                for (int j = 0; j < kolom_1; j++) {
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        } else {
            System.out.println("jumlah baris atau kolom tidak sama");
        }
        return hasil;
    }

    private static int[][] kali(int[][] matrix_1, int[][] matrix_2) {
        int baris_1 = matrix_1.length;
        int kolom_1 = matrix_1[0].length;

        int baris_2 = matrix_2.length;
        int kolom_2 = matrix_2[0].length;

        // jika a * b maka jumlah baris akan mengikuti matrix a
        // dan kolom akan mengikuti kolom b
        int[][] hasil = new int[baris_1][kolom_2];

        if (kolom_1 == baris_2) {
            int buffer;
            for (int i = 0; i < baris_1; i++) {
                for (int j = 0; j < kolom_2; j++) {
                    buffer = 0;
                    for (int k = 0; k < kolom_1; k++) {
                        buffer += matrix_1[i][k] * matrix_2[k][j];
                    }
                    hasil[i][j] = buffer;
                }
            }
        } else {
            System.out.println("jumlah baris matrix 1 dan kolom matrix 2 tidak sama");
        }

        return hasil;
    }

    private static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);

                if (j < kolom - 1) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
