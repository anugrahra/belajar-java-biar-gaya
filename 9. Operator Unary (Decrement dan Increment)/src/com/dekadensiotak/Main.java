package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // unary adalah operasi yang dilakukan pada satu variable

        // unary + dan -
        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);

        // unary decrement dan increment
        // ini mengubah nilai variable
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        // dibawah ini hasilnya akan sama
        // a++;
        // ++a;
        // kecuali dijadikan seperti ini

        // prefix akan dieksekusi sebelum ditampilkan
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);

        int b = 5;
        // postfix akn ditampilkan dulu baru dieksekusi
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++); // ini belum dieksekusi
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b); // barulah muncul nilai yang baru ketika dipanggil lagi karena telah dieksekusi

        // unary boolean dengan ! untuk negasi

        boolean mantan = true;
        System.out.println("nilai boolean = " + mantan);
        System.out.println("nilai boolean = " + !mantan);
    }
}
