package com.dekadensiotak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // STRING
        // tipe data yang sebenarnya tipe data high-level
        // "" -> String
        // '' -> Char

        // STRING
        String kataString = "Anjing Bangsat Kau!";
        System.out.println(kataString);

        // CHAR
        // kalau char, ribet anying. kudu dieja satu-satu
        char[] kataChar = {'A','n','j','i','n','g','!'};
        System.out.println(Arrays.toString(kataChar));

        // MENGAKSES KOMPONEN
        System.out.println("Komponen pertama dari char[] = " + kataChar[0]);
        // karena sebenarnya di dalam string itu ada char juga, jadi bisa dipanggil begini
        System.out.println("Komponen pertama dari String = " + kataString.charAt(0));

        // MERUBAH KOMPONEN
        // char
        kataChar[0] = 'U';
        System.out.println(Arrays.toString(kataChar));
        // string
        // GAK BISA DONG BANGSAT
        // kataString[0] = "U"; <-------- ini gak bisa
        // kataString.charAt(0) = "U"; <-------- ini juga gak bisa ya anjing
        // String di Java itu IMMUTABLE
        // kenapa? biar multi-trading itu lebih save dengan string
        // buat parallel computation juga
        // tapi bisa di rubah, ada triknya coy

        // ini teh yang kelimanya gak diambil
        System.out.println(kataString.substring(1,5));

        printAddress("kataString", kataString);

        // mari saya rubah
        kataString = "U" + kataString.substring(1,6);
        System.out.println(kataString);

        // kita lihat addressnya
        // jadi berubah coy
        // jadi sebenernya ini teh gak berubah
        // tapi membikin data array baru
        // jadi ini teh kata string yang beda dari yang belum dirubah
        printAddress("kataString", kataString);

        // tapi kalau sama isinya, addressnya bakal sama
        // anjing ini keren sih anjing
        // berarti ini teh bagus, reusable
        // String pool (slot memory khusus untuk String)
        String str_1 = "test";
        String str_2 = "test";
        String str_3 = "Anjing Bangsat Kau!";

        // tapi kalau ini beda nih
        // jadi ini gak masuk String pool yang udah ada
        // jadi bikin pool sendiri
        // karena pake substring
        String str_4 = "Unjing";

        printAddress("str_1", str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);
        printAddress("str_4", str_4);

        // String yang berada di String Pool akan reusable
        // jadi memorinya lebih efisien
        // membuat string dengan method baru, akan disimpan di memori lain (bukan di string pool)

        // take a closer look
        // ini akan ditaruh di memory heap
        // bukan di string pool
        // jadi alamatnya beda
        String a = new String("test");
        printAddress("a", a);
    }

    private static void printAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + " || address = " + Integer.toHexString(address));
    }
}
