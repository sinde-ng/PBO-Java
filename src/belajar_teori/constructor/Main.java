package belajar_teori.constructor;

class PlastikKresek {
    String kegunaan;
    String namaBarang;
    int banyakBarang;

    // ini disebut constructor
    PlastikKresek(String guna, String nama, int banyak) {
        kegunaan = guna;
        namaBarang = nama;
        banyakBarang = banyak;

        System.out.println("\n" + guna + "\n" + namaBarang + "\n" + banyakBarang);
    }
}

public class Main {

    public static void main(String[] args) {
        // Constructor digunakan agar tidak membuat object secara manual

        PlastikKresek gorengan = new PlastikKresek("Menyimpan Gorengan", "Tahu", 5);

        PlastikKresek sayuran = new PlastikKresek("Menyimpan Sayuran", "Wortel", 12);

    }
}
