package com.dekadensiotak;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // byte stream itu cuman baca per byte
        // secepat apapun HDD kita, masih cepat memory

        FileInputStream byteInput = new FileInputStream("input.txt");
        // melihat ada berapa karakter dalam objek byteInput
        System.out.println(byteInput.available());

        // meghitung waktu pembacaan
        long waktuStart, waktuFinish;

        // membaca dari file
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        // membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream((byteInput2));

        bufferedInput.mark(200);

        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferedInput.close();
        byteInput2.close();

        // menulis dengan buffered output
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // write data berupa byte
        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();


    }
}
