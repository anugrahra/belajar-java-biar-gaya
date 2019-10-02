package com.dekadensiotak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arrayAngka1 = {1, 2, 3, 4, 5};
	    // array kosong dengan 5 index
	    int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        // ini teh tidak me-copy
        // tapi arrayAngka2 teh addressing ke arrayAngka1
	    arrayAngka2 = arrayAngka1;

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("Data Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Data Array 2 -> " + Arrays.toString(arrayAngka2));
    }

    // method yang argumennya adalah reference, bukan nilainya. pass by reference
    // bukan pass by value seperti method biasa
    private static void ubahArray(int[] dataArray) {
        // ini juga addressing ke data array yang sebagey parameternya
        dataArray[0] = 125;
        for (int data: dataArray) {
            System.out.println("for dataArray " + data);
        }
    }
}
