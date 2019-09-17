package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // operator komparasi menghasilkan nilai dalam boolean

        int a, b;
        boolean hasilKomparasi;

        // persamaan (equal)
        System.out.println("----- PERSAMAAN -----");
        a = 10;
        b = 10;
        // pake kurung biar syantik
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);

        a = 10;
        b = 11;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);

        // pertidaksamaan (not equal)
        System.out.println("----- PERTIDAKSAMAAN -----");
        a = 10;
        b = 10;
        // pake kurung biar syantik
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a, b, hasilKomparasi);

        a = 10;
        b = 11;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a, b, hasilKomparasi);

        // kurang dari (less than)
        System.out.println("----- KURANG DARI -----");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a, b, hasilKomparasi);

        a = 10;
        b = 11;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a, b, hasilKomparasi);

        // lebih dari (greater than)
        System.out.println("----- LEBIH DARI -----");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 11;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        // kurang dari sama dengan (less than equal)
        System.out.println("----- KURANG SARI SAMA DENGAN -----");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 11;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a, b, hasilKomparasi);

        // lebih dari sama dengan (greater than equal)
        System.out.println("----- LEBIH DARI SAMA DENGAN -----");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 11;
        hasilKomparasi = (a >= b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        System.out.println("---------- \n GAMPIL ANYING LAH!!");
    }
}
