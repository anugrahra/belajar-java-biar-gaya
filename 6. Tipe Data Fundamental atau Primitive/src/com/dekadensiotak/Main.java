package com.dekadensiotak;

public class Main {

    public static void main(String[] args){
        // tipe data di java
        // integer, byte, short, long, double, float, char, boolean

        // 1 byte = 8 bit
        // 4 byte = 32 bit

        // bit itu biner (0 dan 1)

        /*
         mencari nilai bit:
              2^n - 1
         dimana n adalah nilai bit yang ingin diketahui
        */

        // tanda minus (-) mengambil 1 bit dari memori

        // INTEGER
        int i = 10;
        System.out.println("======= INTEGER =======");
        System.out.println("Nilai integer i = " + i);
        System.out.println("Nilai Max = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");
        System.out.println("");

        // BYTE
        byte b = 10;
        System.out.println("======= BYTE =======");
        System.out.println("Nilai byte b = " + b);
        System.out.println("Nilai Max = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit");
        System.out.println("");

        // SHORT
        short s = 10;
        System.out.println("======= SHORT =======");
        System.out.println("Nilai short s = " + s);
        System.out.println("Nilai Max = " + Short.MAX_VALUE);
        System.out.println("Nilai Min = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short = " + Short.SIZE + " bit");
        System.out.println("");

        // LONG
        long l = 10L;
        System.out.println("======= LONG =======");
        System.out.println("Nilai long l = " + l);
        System.out.println("Nilai Max = " + Long.MAX_VALUE);
        System.out.println("Nilai Min = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long = " + Long.SIZE + " bit");
        System.out.println("");

        // DOUBLE (koma, bilangan real)
        double d = 10.5d;
        System.out.println("======= DOUBLE =======");
        System.out.println("Nilai double d = " + d);
        System.out.println("Nilai Max = " + Double.MAX_VALUE);
        System.out.println("Nilai Min = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit");
        System.out.println("");

        // FLOAT (koma, bilangan real)
        float f = 10.5f;
        System.out.println("======= FLOAT =======");
        System.out.println("Nilai float f = " + f);
        System.out.println("Nilai Max = " + Float.MAX_VALUE);
        System.out.println("Nilai Min = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit");
        System.out.println("");

        // CHAR (karakter, berdasarkan ASCII) - ini teh string sebenernya mah. tapi primitive-nya
        char c = 'c';
        System.out.println("======= CHAR =======");
        System.out.println("Nilai char c = " + c);
        System.out.println("Nilai Max = " + Character.MAX_VALUE);
        System.out.println("Nilai Min = " + Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + " bytes");
        System.out.println("Besar char = " + Character.SIZE + " bit");
        System.out.println("");

        // BOOLEAN (karakter, berdasarkan ASCII)
        boolean val = true;
        System.out.println("======= BOOLEAN =======");
        System.out.println("Nilai boolean val = " + val);
        System.out.println("Nilai Max = " + Boolean.TRUE);
        System.out.println("Nilai Min = " + Boolean.FALSE);
        System.out.println("");

        // Kalau string mah bukan primitive tapi sudah high-level karena ukurannya bisa berubah
        // tidak ada tipe data unsigned (itu teh yang ga ada nilai minus tea, makanya nilai maxnya teh dua kali lipat) di java
    }
}
