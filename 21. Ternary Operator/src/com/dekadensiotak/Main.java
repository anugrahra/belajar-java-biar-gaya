package com.dekadensiotak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ternary operator

        // variable x = ekspresi ? statement_true : statement_false

        // jika ekspresi bernilai true, statement_true dieksekusi
        // jika ekspresi bernilai false, statement_false dieksekusi

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputUser.nextInt();

        x = (input == 10) ? (input * input) : (input / 2);

        System.out.println("hasilnya " + x);

    }
}
