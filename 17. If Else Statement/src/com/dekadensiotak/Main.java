package com.dekadensiotak;

public class Main {

    public static void main(String[] args){

        //  if (ekspresi) {
        //      eksekusi aksi;
        //  } else {
        //      aksi default;
        //  }

        // mainstream
        int data = 5;
        System.out.println("nilai = " + data);

        // sidestream
        if (data == 6){
            System.out.println("ini adalah jalur true");
        } else {
            System.out.println("ini adalah jalur false");
        }

        System.out.println("selesai");
    }
}
