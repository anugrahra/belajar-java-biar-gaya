package com.dekadensiotak;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[][] array2D = {
                {1,2,3},
                {4,5,6}
        };

        // melihat addressnya
        // jadi memori itu ada kontennya yang berada di address tertentu

        // di java mah array itu diperlakukan sebagai objek

        // array1D = {1,2,3};
        // |1|\
        // |2|-> A001 --> Addressnya
        // |3|/

        // array2D = {{1,2,3},
        //            {4,5,6}};
        // |A002|\ ---------------->|1|\
        // -------> A001            |2|-> A002
        // |A001|/ ------->|4|\     |3|/
        //                 |5|-> A003
        //                 |6|/

        // itu lah kenapa di java array multideminesi komponennya bisa beda jumlahnya

        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(array2D[0]);
        System.out.println(array2D[1]);
        System.out.println(Arrays.deepToString(array2D));

        System.out.println("\n");

        char[] arrayChar1 = {'a','b','c'};
        char[] arrayChar2 = {'d','e'};

        char[][] arrayChar2D = {
                arrayChar1,
                arrayChar2
        };

        System.out.println(arrayChar2D);
        // kalau char langsung dikeluarin kontennya
        System.out.println(arrayChar1);
        System.out.println(arrayChar2);
        // kalau mau liat addressnya kayak gini nih
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2)));
        //
        System.out.println(Arrays.toString(arrayChar2D));
        System.out.println(Arrays.deepToString(arrayChar2D));

        // I@ = integer
        // C@ = char

        // array multidimensi harus sama tipe datanya
        // kalau enggak nanti error bos
    }
}
