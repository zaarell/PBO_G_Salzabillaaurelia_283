package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new NonFiksi("Manusia Indonesia", "Mochtar Lubis", "Sosial & Politik");
        Buku buku2 = new Fiksi("Perahu Kertas", "Dee Lestari", "Romansa");

        // Menampilkan info buku
        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Aurelie", "B283");
        Anggota anggota2 = new Anggota("Salzabilla", "A205");

        anggota1.displayInfo();
        anggota2.displayInfo();
        System.out.println();

        // Peminjaman
        anggota1.pinjamBuku("Manusia Indonesia");
        anggota2.pinjamBuku("Perahu Kertas", 7);
        System.out.println();

        // Pengembalian
        anggota1.kembalikanBuku("Manusia Indonesia");
        anggota2.kembalikanBuku("Perahu Kertas");
    }
}
