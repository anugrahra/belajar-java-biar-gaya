package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // Overload Method
        // mengambil argumen yang tidak tetap / berubah
        // satu nama method berulang-ulang tapi argumennya berubah

        // println() adalah salah satu contoh overload method

        // FLOAT + INTEGER = FLOAT

        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);

        hasilInteger = tambah(4,5,7);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(44.5F, 4);
        printAngka(hasilFloat);

        hasilFloat = tambah(30,50.6F);
        printAngka(hasilFloat);

        printAngka(30);
        printAngka(30.5F);
        printAngka(30.6D);
    }

    private static float tambah(float angkaFloat1, int angkaInt2) {
        return angkaFloat1 + angkaInt2;
    }

    private static float tambah(int angkaInt1, float angkaFloat2) {
        return angkaInt1 + angkaFloat2;
    }

    private static int tambah(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }

    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3) {
        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static void printAngka(double angkaDouble) {
        System.out.println("angka ini adalah double dengan nilai = " + angkaDouble);
    }

    private static void printAngka(float angkaFloat) {
        System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
    }

    private static void printAngka(int angkaInteger) {
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);
    }
}
