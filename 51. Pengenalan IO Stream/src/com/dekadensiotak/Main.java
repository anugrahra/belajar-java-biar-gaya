package com.dekadensiotak;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // inisialisasi objek FileInputStream dari class FileInputStream
        FileInputStream fileInput = new FileInputStream("input.txt");

        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());

        // ini kalau di run di console (cmd), eror nih kalau si filenya tidak selevel sama classnya
        // file sama aplikasinya harus ada dalam satu level gitu
    }
}
