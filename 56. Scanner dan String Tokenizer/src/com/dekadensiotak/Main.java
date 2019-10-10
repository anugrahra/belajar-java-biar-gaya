package com.dekadensiotak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // kalau ini kan cuman ngambil satu kata doang
//        Scanner inputUser = new Scanner(System.in);
//        String input = inputUser.next();
//        System.out.println(input);

        // kalau mau dua kata atau lebih kudu di inisialisasi lagi inputnya
//        input = inputUser.next();
//        System.out.println("kata kedua = " + input);

        // hal2 di atas bisa dilakukan pada file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
//        System.out.println((char)bufferedReader.read());
        Scanner scanner = new Scanner(bufferedReader);

        // ini untuk cek ada kata selanjutnya apa tidak
        System.out.println(scanner.hasNext()); // true

        // untuk membaca kata dengan delimiter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); // false

        // menggunakan delimiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // menggunakan string tokenizer
        // bisa untuk membaca data per baris
        bufferedReader.reset();
        // membaca stringnya dulu
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data,",");

        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        // baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");

        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }
    }
}
