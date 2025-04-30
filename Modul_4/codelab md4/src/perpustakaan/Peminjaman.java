package perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judul);
    void pinjamBuku(String judul, int hari); // Overloading
    void kembalikanBuku(String judul);
}
