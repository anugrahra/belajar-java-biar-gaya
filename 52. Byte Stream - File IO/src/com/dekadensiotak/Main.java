package com.dekadensiotak;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        System.out.println("FIle input bernilai = " + fileInput);
        fileInput = new FileInputStream("input.txt");
        System.out.println("FIle input bernilai = " + fileInput);

        // close dulu biar si fileInputnya kosong dulu
        // biar ga terjadi resource leak / memory leak
        fileInput.close();
        System.out.println("FIle input bernilai = " + fileInput);
        // barulah diisi dengan yg baru

        // membaca file
        fileInput = new FileInputStream("input2.txt");
        System.out.println("FIle input bernilai = " + fileInput);

        // input ini per karakter akan diambil sebagai byte
        System.out.println(fileInput.read()); // i
        System.out.println(fileInput.read()); // n
        System.out.println(fileInput.read()); // i

        // tah ieu byte stream teh
        // membaca file
        int data = fileInput.read();
        while(data != -1) {
            // byte -1 = kosong
            System.out.println((char)data);
            data = fileInput.read();
        }

        // menutup file
        fileInput.close();

        FileOutputStream fileOutput = null;

        // contoh skenario program pembukaan file
        try {
            // membuka file
            fileInput = new FileInputStream("input.txt");
            // langsung dibuat nih file output.txt nya
            fileOutput = new FileOutputStream("output.txt");

            // membaca file
            int buffer = fileInput.read();

            while (buffer != -1) {
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
        } finally {
            // sydah di throws, jadi gak perlu catch
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileOutput != null) {
                fileOutput.close();
            }
        }

        // kita hilangkan finallynya (try with resources)

        try (
                FileInputStream in = new FileInputStream("input2.txt");
                FileOutputStream out = new FileOutputStream("output2.txt");
        ) {
            int data2 = in.read();
            while(data2 != -1) {
                // byte -1 = kosong
                out.write((char)data2);
                data2 = in.read();
            }
        }
    }
}
