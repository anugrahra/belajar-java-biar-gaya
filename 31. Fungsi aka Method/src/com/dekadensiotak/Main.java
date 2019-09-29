package com.dekadensiotak;

public class Main {
    // Fungsi dalam Java disebut Method, karena berhubungan dengan Class

    // di bawah ini juga termasuk method
    public static void main(String[] args) {
        System.out.println("ini berada dalam method");

        // Fungsi aka Method berasal dari matematika (sianjing emang nih)
        // f(x)
        // kasih nilai tuh si x
        // terus jadinya bisa dipanggil berulang-ulang jika dibutuhkan

        // tah method hitung di bawah bisa dipake di sini
        int y,x;
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        // misal kalau mau ganti rumus, tinggal ganti di methodnya aja
    }

        /*
            visibility somethingLikeStatic tipeData namaFungsi(input) {
                statement;
                return; ---> nyambung dengan si tipeData
            }
        */

    // CONTOH NJING!
    // static teh penanda bahwa ini berlaku di level Class
    public static int hitung(int input){
        int hasil;

        hasil = (input + 2) * input;

        return hasil;
    }
}
