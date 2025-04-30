package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String id;

    public Anggota(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Anggota: " + nama + " (ID: " + id + ")");
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
    }

    @Override
    public void pinjamBuku(String judul, int hari) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + hari + " hari.");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
    }
}
