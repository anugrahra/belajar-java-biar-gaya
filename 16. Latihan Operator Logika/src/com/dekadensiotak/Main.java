package com.dekadensiotak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // membuat object untuk nangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.println("masukan nilai tebakan anda");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and / or)
        System.out.println("masukan nilai antara 4 dan 9");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("tebakan anda: " + statusTebakan);
    }
}
