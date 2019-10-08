package com.dekadensiotak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arrayData = {1,2,3};
        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke: ");
        int indexInput = userInput.nextInt();

        // exception biasa
        System.out.println("EXCEPTION BIASA");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n",indexInput,arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        }

        // exception di dalam fungsi
        System.out.println("EXCEPTION DALAM FUNGSI");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n",indexInput,data);

        // exception throws by method
        System.out.println("EXCEPTION THROWS BY METHOD");
        int data2 = 0;
        try {
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {
            System.err.print(e);
        }
        System.out.printf("\ndata dari array ke-%d adalah %d\n",indexInput,data2);

        // akhir program
        System.out.println("\nAkhir Program");
    }

    private static int ambilDataDariArray(int[] array, int index) {
        int hasil = 0;

        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }

        return hasil;
    }

    private static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }


}
