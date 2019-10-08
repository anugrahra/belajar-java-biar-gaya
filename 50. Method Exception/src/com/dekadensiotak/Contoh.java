package com.dekadensiotak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Contoh {
    // ini yang ngehandle exceptionnya si JVM (java virtual machine)
    public static void main(String[] args) throws IOException {

        FileInputStream inputFile = new FileInputStream("input.txt");
        System.out.println(inputFile.read());
        System.out.println((char)inputFile.read());

        // kekurangan throws ini adalah ketika terjadi eror maka syntax dalam fungsi ini tidak akan dieksekusi
        // dianggap eror aja gitu
        System.out.println("akhir dari program");
    }
}
