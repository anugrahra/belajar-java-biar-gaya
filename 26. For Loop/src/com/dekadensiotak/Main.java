package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // for (inisialisasi; kondisi; step nilai) {
        //      aksi;
        // }

        // kondisi harus true bila ingin menjalankan aksinya

        System.out.println("awal program");

        System.out.println("loop pertama");

        for (int nilai = 0; nilai <= 10; nilai++) {

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop kedua");

        for (int nilai = 5; nilai < 10; nilai++) {

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop ketiga");

        for (int nilai = 10; nilai >= 5; nilai--) {

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop keempat");
        int nilai = 0;
        for (; nilai <= 10 ;) {

            System.out.println("for loop ke-" + nilai);
            nilai++;
        }

        System.out.println("akhir program");
    }
}
