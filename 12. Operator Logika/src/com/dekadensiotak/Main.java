package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {
	// operator logika cuman bisa dipakai untuk tipe data boolean
        // AND, OR, XOR (Exclusive OR), NOT (flipping)
        // hasilnya bakal boolean juga

        // TRUE = 1
        // FALSE = 0

        // AND
        // Jika salah satu bernilai false maka hasilnya akan false
        //   a   b   result
        // +---+---+-------+
        // | 0 | 0 |   0   |
        // | 0 | 1 |   0   |
        // | 1 | 0 |   0   |
        // | 1 | 1 |   1   |
        // +---+---+-------+

        // OR
        // Jika salah satu bernilai true maka hasilnya akan true
        //   a   b   result
        // +---+---+-------+
        // | 0 | 0 |   0   |
        // | 0 | 1 |   1   |
        // | 1 | 0 |   1   |
        // | 1 | 1 |   1   |
        // +---+---+-------+

        // XOR (Exclusive OR)
        // Jika nilainya berbeda maka hasilnya akan true
        //   a   b   result
        // +---+---+-------+
        // | 0 | 0 |   0   |
        // | 0 | 1 |   1   |
        // | 1 | 0 |   1   |
        // | 1 | 1 |   0   |
        // +---+---+-------+

        // NOT (flipping)
        // kebalikannya
        //   a   result
        // +---+-------+
        // | 0 |   1   |
        // | 1 |   0   |
        // +---+---+---+

        // LET ME CODE

        boolean a,b,c;

        // AND - &&
        System.out.println("===== AND (&&) =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        // OR - ||
        System.out.println("===== OR (||) =====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        // XOR - ^ (hati-hati di beberapa bahasa jadi pangkat)
        System.out.println("===== XOR (^) =====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT - !
        System.out.println("===== NOT (!) =====");
        a = false;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
        a = true;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
    }
}
