package com.dekadensiotak;

public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("oi");
        printData(builder);

        // CONCAT membuat memory baru
        // APPEND mah kagak
        // kapasitasnya udah disediain
        // kalau ngelebihin baru nambah
        // tapi addressnya tetep sama
        // jadi pemakaiannya lebih efisien
        builder.append(" whatsup");
        printData(builder);

        builder.append(" kau bajingan");
        printData(builder);

        // INSERT
        builder.insert(14, " mantan");
        printData(builder);

        // DELETE
        builder.delete(3, 11);
        printData(builder);

        // RUBAH CHARACTER PADA INDEX TERTENTU
        builder.setCharAt(1, 'y');
        printData(builder);

        // REPLACE
        builder.replace(14, 22, "sialan");
        printData(builder);

        // CASTING MENJADI STRING
        // barulah ini di simpen di memori terpisah
        // dan bisa dilakukan operasi-operasi string
        String kalimat = builder.toString();
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
    }

    private static void printData(StringBuilder dataBuilder) {
        System.out.println("data = " + dataBuilder);
        System.out.println("length / panjang = " + dataBuilder.length());

        // kapasitas default StringBuilder = 16
        System.out.println("capacity / kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
        System.out.print("\n");
    }
}
