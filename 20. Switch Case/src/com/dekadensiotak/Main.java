package com.dekadensiotak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // switch case
        // ekspresinya berupa satuan (int, long, byte, short), String, atau enum

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // break untuk menghentikan program ketika suatu case bernilai true

        switch(input){
            case "otong":
                System.out.println("otong kelontoooooong!");
                break;
            case "mahmuy":
                System.out.println("mamamamamahmuuuuuy!");
                break;
            case "ucup":
                System.out.println("ucup kuncup cup cup cup");
            default:
                System.out.println(input + " sape anjing?");
        }

        System.out.println("selesai program");
    }
}
