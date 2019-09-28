package com.dekadensiotak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // SESUATU YANG BERPOLA BISA DISELESAIKAN DENGAN LOOP

        // deret fibonacci
        // deret ke : 0 1 2 3 4 5 6  7  8  9 10 ...
        // fibonacci: 0 1 1 2 3 5 8 13 21 34 55 ...

        // nilai fibonacci ke-n
        // Fn = Fn-1 + fn-2

        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

//        for (int i = 1; i <= n; i++) {
//            System.out.println("nilai ke - " + i + " adalah " + f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//        }

        // do while
//        int i = 1;
//        do {
//            System.out.println("nilai ke - " + i + " adalah " + f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            i++;
//        } while (i <= n);

        // while
        int i = 1;
        while (i <= n) {
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }
    }
}
