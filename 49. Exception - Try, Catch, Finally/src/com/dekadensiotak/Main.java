package com.dekadensiotak;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // EXCEPTION
        // memberi tahu ada error tapi bukan dari syntax
        // tapi dari runtime
        // jadi pada saat running, bukan compiling

        // misal:
        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();
        // System.out.printf("index ke-%d, adalah %d",index, array[index]);

        // bila terjadi exception (seperti manggil index di luar array itu),
        // maka syntax di bawahnya tidak akan dieksekusi

        // exception handling (try, catch, finally)
        System.out.println("===== HANDLING OUT OF BOUND =====");
        try {
            System.out.printf("index ke-%d, adalah %d",index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }

        // runtime error jika file tidak ada
        System.out.println("===== HANDLING IO NOT FOUND =====");
        // FileInputStream fileInput = new FileInputStream("input.txt"); <-- ini bakal eror kalau filenya ga ada
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            System.err.println(e);
        }

        // menggabungkan 2 exception
        System.out.println("===== MENGGABUNGKAN 2 EXCEPTION =====");
        try {
            System.out.printf("index ke-%d, adalah %d\n",index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("indexnya ga ada, goblok!");
        } catch (IOException e) {
            System.err.println("ga ada filenya, goblok!");
        }

        // finally
        // close session
        System.out.println("===== MENAMBAHKAN FINALLY =====");
        try {
            System.out.printf("index ke-%d, adalah %d\n",index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("indexnya ga ada, goblok!");
        } finally {
            System.out.println("finally");
        }

        System.out.println("akhir dari program");
    }
}
