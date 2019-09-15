package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // program untuk konversi data
        int nilaiInt = 450; // 32 bit
        System.out.println("nilai int = " + nilaiInt);

        // memperluas rentang ke tipe data yang lebih besar
        // konversi data ke tipe data lebih besar akan dieksekusi otomatis
        // karena nilai maximumnya masih bisa menampung nilai tipe data sebelumnya yang lebih kecil
        long nilaiLong = nilaiInt; // 64 bit
        System.out.println("nilai long = " + nilaiLong);

        // memperkecil rentang ke tipe data yang lebih kecil
        // memakai casting operator
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        // hasil di atas akan menunjukkan angka -62
        // why? because nilai max dari byte itu 127 sedangkan nilai kita teh 450. nah, jadinya muter tuh. offside bro
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai max byte = " + Byte.MIN_VALUE);
        // tapi kalau tipe data sebelumnya masih masuk dalam rentang tipe data yang akan dikonversi, itu gak masalah

        // byte < short < integer < long

        // casting pembagian
        // salah satu aja yang diganti
        // misal, data awalnya seperti berikut:
        // int a = 10;
        // int b = 4;

        // lalu diganti menjadi seperti:
        float a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f\n",a,b,c);

        // bisa juga seperti ini kalau ga mau ngerubah
        // lebih aman, karena datanya gak diubah
        int x = 10;
        int y = 4;

        // pakai casting operator coy
        float z = (float)x/y;
        // jadi itu teh si x nya yang dicasting jadi float
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
