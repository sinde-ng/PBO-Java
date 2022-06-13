package belajar_teori.class_dan_object;

// ini disebut class sebagai pembukus
class Mahasiswa {
    String NIM;
    String Nama;
    String Jurusan;
    String Kelas;
    double IPK;
}

class Main {

    public static void main(String[] args) {
        // Membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        // Mencetak sekaligus memasukkan value
        System.out.print("\nNIM : ");
        System.out.print(mahasiswa1.NIM = "001" + "\n");

        System.out.print("Nama : ");
        System.out.print(mahasiswa1.Nama = "Terry" + "\n");

        System.out.print("Jurusan : ");
        System.out.print(mahasiswa1.Jurusan = "Teknik untuk Mencintaimu" + "\n");

        System.out.print("Kelas : ");
        System.out.print(mahasiswa1.Kelas = "a1" + "\n");

        System.out.print("IPK : ");
        System.out.print(mahasiswa1.IPK = 3.4);

        System.out.println("\n");

        // Membuat object ke 2
        Mahasiswa mahasiswa2 = new Mahasiswa();
        // Mencetak sekaligus memasukkan value
        System.out.print("NIM : ");
        System.out.print(mahasiswa2.NIM = "027" + "\n");

        System.out.print("Nama : ");
        System.out.print(mahasiswa2.Nama = "Sholeh" + "\n");

        System.out.print("Jurusan : ");
        System.out.print(mahasiswa2.Jurusan = "Teknik untuk Bersyukur" + "\n");

        System.out.print("Kelas : ");
        System.out.print(mahasiswa2.Kelas = "a7" + "\n");

        System.out.print("IPK : ");
        System.out.print(mahasiswa2.IPK = 4.0);

    }

}