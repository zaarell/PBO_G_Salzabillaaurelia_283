public class KarakterGame {
    // Kelas ini mendefinisikan blueprint dasar untuk karakter dalam game.
    // Setiap karakter akan memiliki nama dan tingkat kesehatan.
    private String nama;
    // Variabel instance 'nama' menyimpan nama karakter.
    // Akses ke variabel ini dibatasi untuk anggota kelas ini (private).
    private int kesehatan;

    // Variabel instance 'kesehatan' menyimpan tingkat kesehatan karakter.
    public KarakterGame(String nama, int kesehatan) {
        // Konstruktor kelas KarakterGame.
        // Dipanggil saat objek KarakterGame baru dibuat.
        // Menerima dua parameter: nama awal dan kesehatan awal karakter.
        this.nama = nama;  // Menginisialisasi variabel instance 'nama' dengan nilai parameter 'nama'.
        this.kesehatan = kesehatan;  // Menginisialisasi variabel instance 'kesehatan' dengan nilai parameter 'kesehatan'.
    }

    public String getNama() {
        // Metode getter untuk mendapatkan nilai dari variabel instance 'nama'.
        // Metode ini memungkinkan akses terkontrol ke nilai 'nama' dari luar kelas.
        return nama;  // Mengembalikan nilai dari variabel instance 'nama'.
    }

    public void setNama(String nama) {
        // Metode setter untuk mengatur nilai dari variabel instance 'nama'.
        // Metode ini memungkinkan modifikasi terkontrol terhadap nilai 'nama' dari luar kelas.
        this.nama = nama;  // Mengatur nilai variabel instance 'nama' dengan nilai parameter 'nama'.
    }

    public int getKesehatan() {
        // Metode getter untuk mendapatkan nilai dari variabel instance 'kesehatan'.
        // Metode ini memungkinkan akses terkontrol ke nilai 'kesehatan' dari luar kelas.
        return kesehatan;  // Mengembalikan nilai dari variabel instance 'kesehatan'
    }

    public void setKesehatan(int kesehatan) {
        // Metode setter untuk mengatur nilai dari variabel instance 'kesehatan'.
        // Metode ini memungkinkan modifikasi terkontrol terhadap nilai 'kesehatan' dari luar kelas.
        this.kesehatan = kesehatan; // Mengatur nilai variabel instance 'kesehatan' dengan nilai
        // parameter 'kesehatan'.
    }

    public void serang(KarakterGame target) {
        // Metode 'serang' ini mendefinisikan aksi menyerang karakter lain.
    }
}