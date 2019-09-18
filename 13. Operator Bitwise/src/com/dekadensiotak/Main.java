package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {
	// pokoknya ini teh operasi yang dilakukan terhadap nilai bit

        // 1 byte = 8 bit
        // 00000000
        // membaca binary caranya adalah Math.pow(2, n) pada setiap bitnya
        // apabila si n nya 0 maka tidak dihitung
        // n adalah nilai pada bit. dibaca dari kanan ya bos
        // setelah didapat semua angka per bitnya, maka dijumlahkan

        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        // Operator SHIFT LEFT
        System.out.println("======= SHIFT LEFT");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator SHIFT RIGHT
        System.out.println("======= SHIFT RIGHT");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator bitwise OR
        System.out.println("======= Bitwise OR - |");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("---------------------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator bitwise AND
        System.out.println("======= Bitwise AND - &");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("---------------------AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator bitwise XOR
        // anying ternyata XOR mah emang bitwise ya euy dari sananya juga
        System.out.println("======= Bitwise XOR - ^");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("---------------------XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator Negasi / Not
        System.out.println("======= Bitwise NOT - ~");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n", b_bits, b);

        // Ini semua dipakai ketika mau mengoperasikannya dalam level bit.
        // misal, punya tipe data boolean. yaudah dijadiin bit aja
    }
}
