package com.dekadensiotak;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("MENGHITUNG PERSEGI");

        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);

        tampilkanLuasDanKeliling(inputPanjang, inputLebar);

    }

    private static void tampilkanLuasDanKeliling(int panjang, int lebar) {
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Keliling = "  + keliling(panjang, lebar));
    }

    private static int keliling(int panjang, int lebar) {
        int keliling = (panjang + lebar) * 2;
        return keliling;
    }

    private static int luas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("*   ");
            }
            System.out.print("\n");
        }
    }
}
