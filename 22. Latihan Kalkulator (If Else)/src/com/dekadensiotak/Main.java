package com.dekadensiotak;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // mengambil input dari user untuk a, operator, dan b
        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        // operator tersedia * / + -
        // pake tanda kutip satu biar dibacanya char bukan string
        if (operator == '+') {
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-') {
            // pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*') {
            // perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/') {
            // pembagian
            if (b == 0){
                System.out.println("infinity war bos!");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("gak tersedia operator begituan bos!");
        }
    }
}
