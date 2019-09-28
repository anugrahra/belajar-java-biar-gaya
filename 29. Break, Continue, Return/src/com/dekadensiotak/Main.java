package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {

        // break, continue, return

        // BREAK
        // mengeluarkan dari looping
        // statement dibawahnya tidak akan dieksekusi

        // CONTINUE
        // skip the statements after it and restart the loop

        // RETURN
        // stop the method

        int a = 0;

        while (true) {
            a++;

            if (a == 10) {
                break;
            } else if (a == 5) {
                continue;
            } else if (a == 7) {
                return;
            }

            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari loop");
    }
}
