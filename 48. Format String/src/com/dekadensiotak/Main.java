package com.dekadensiotak;

import java.util.Formatter;

public class Main {

    public static void main(String[] args) {

        String nama = "Dodoy";
        int umur = 32;

        // output: Nama saya adalah Udin, umur saya adalah 32"
        System.out.println("Nama saya adalah " + nama + ", umur saya adalah " + umur);

        // cara lainnya adalah dengan format string
        System.out.printf("Nama saya adalah %s, umur saya adalah %d",nama,umur);

        // conversion :
        // s = string
        // d = decimal
        // f = float
        // d = integer
        // c = character
        // b = boolean

        // struktur: %[argumenIndex$][flags][width][.precision]converion
        // kalau mau nampilin %, tulis dua kali (%%). biar ga eror

        // [argumenIndex$]
        System.out.println("\n\n[argumenIndex$]");
        // hei Dodoy yang nomor urut 17, kamu mau kemana atuh Dodoy. Kamu kan udah 17 tahun
        System.out.printf("hei %1$s yang nomor urut %2$d, kamu mau kemana atuh %1$s.\nKamu kan udah %2$d tahun",nama, umur);

        // [flags]
        System.out.println("\n\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d",int1,int2,hasil);

        // [width]
        System.out.println("\n\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3); // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n",int3); // flags akan mengambil slot di dalam format
        System.out.printf("%+-5d\n",int3); // flags bisa digabungkan
        System.out.printf("%10d\n",int3);
        System.out.printf("% 10d\n",int3);
        System.out.printf("%010d\n",int3); // flags = "0", menambahkan leading "0" di depan
        System.out.printf("%+010d\n",int3);
        int int4 = 1000000000;
        System.out.printf("%-,15d\n",int4); // flags = ",", menandakan delimeter per seribu

        System.out.println("\nFLOATING POINT");
        // otomatis sudah mengambil width 6 decimal di belakang koma
        float float1 = 1.543F;
        System.out.printf("%f\n",float1);
        System.out.printf("%5f\n",float1);
        System.out.printf("%+9f",float1);

        // [.precision]
        System.out.println("\n\n[.precision]");
        float float2 = 15.678F;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2); // gabungkan dengan width
        System.out.printf("%+08.2f\n",float2); // gabungkan dengan width dan flag

        // contoh
        String nama2 = "Oded";
        float IPK = 3.785F;
        // struktur: %[argumenIndex$][flags][width][.precision]converion
        System.out.printf("\nIPK %1$s berapa?\n%1$s: saya dapet %2$+5.2f\n",nama2,IPK);

        // KESIMPULAN
        // save format ini dalam variabel string
        String infoBiasa = "nama: " + nama2 + ", IPK = " + IPK;
        System.out.println("biasa ---> " + infoBiasa);

        String infoFormat = String.format("nama = %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string format ---> " + infoFormat);

        // save format ini dalam string builder
        StringBuilder builderInfo = new StringBuilder();
        Formatter formatBuilder = new Formatter(builderInfo);

        formatBuilder.format("nama = %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string builder format ---> " + builderInfo);

    }
}
