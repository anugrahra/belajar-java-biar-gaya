package com.dekadensiotak;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // kelebihan character stream adalah ketika pake karakter huruf lain seperti jepang korea atau cina
        // jadi kagak kagok sama 8 bit karakter biasa

        // membuka file
        // byte stream -> FileInputStream
        // character -> FileReader
        FileInputStream byteFile = new FileInputStream("input.txt");
        FileReader charFile = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");

        // membaca file
        // kalau 8 bit ASCII mah sama aja coy
        // tapi kalau pake karakter lain jadi beda ASCII nya
//        System.out.println((char)byteFile.read());
//        System.out.println((char)charFile.read());
//        System.out.println((char)byteFile.read());
//        System.out.println((char)charFile.read());

        // byte file
        int buffer = byteFile.read();
        while(buffer != -1) {
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFile.read();
        }

        System.out.println("/n");

        // char file
        buffer = charFile.read();
        while(buffer != -1) {
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFile.read();
        }

        // menutup file
        byteFile.close();
        charFile.close();
        byteFileOutput.close();
        charFileOutput.close();

        // ini semua teh (char / byte stream) disebut sebagai
        // unbuffered I/O
        // file nya gak dimasukin ke memory. on the fly aja gitu
    }
}
