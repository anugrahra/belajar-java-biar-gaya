package com.dekadensiotak;

public class Main {

    // string[] args adalah input yang bisa dimasukin saat mengeksekusi java
    // [] --> array / kumpulan data tea gening. contoh: [0,1,2,3, ... ] atau [Ujang, Juned, Edod, ...]
    // masukin datanya di console bos!
    // fyi: aing pake windows ya
    // path si class javanya tea gening: out/production/4. Memahami String[] args
    // cara masukinnya gini bos: java com.dekadensiotak.main Ujang <- nah si ujang ini nih datanya teh
    // kalau kagak dimasukin datanya, bakal eror bos, soalnya indexnya kagak ada, out of bound tea gening
    public static void main(String[] args){
        System.out.println("Hei " + args[0] + "!");
        System.out.println("Bangsat kau " + args[1] + "!");
    }
}
