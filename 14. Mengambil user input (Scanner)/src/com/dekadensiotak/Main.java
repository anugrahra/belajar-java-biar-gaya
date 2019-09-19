package com.dekadensiotak;
// import di bawah teh konsepnya sama kayak package di atas
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java itu sangat mendukung OOP. jadi bisa panggil library

        // mengambil input dari user
        // Scanner teh class coy

        // di bawah ini teh bertugas untuk membuat object userInput
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // Menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);
    }
}
