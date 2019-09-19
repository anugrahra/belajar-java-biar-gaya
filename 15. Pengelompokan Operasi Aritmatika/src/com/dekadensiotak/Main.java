package com.dekadensiotak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // perkalian dan pembagian akan dieksekusi terlebih dahulu kecuali dikurungan
        // laaaah ini mah pelajaran matematika dasar lah ini maaaah

        int hasil = 10 / 2 + 2 * 5 - 3;
        System.out.println(hasil);
        int hasil2 = (5 + 2) * 5;
        System.out.println(hasil2);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m, x, c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();

        // bagusnya mah dikurungan juga biarpun sudah pasti dulian dieksekusi
        // biar orang yang baca gampil
        int y = (m * x * x) + c;

        System.out.println("nilai y = " + y);
    }


}
