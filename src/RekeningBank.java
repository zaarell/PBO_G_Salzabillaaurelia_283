public class RekeningBank {
    // Atribut-atribut kelas RekeningBank
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;
    private int jumlahTransaksi;

    // Konstruktor kelas RekeningBank
    // Konstruktor ini digunakan untuk membuat objek RekeningBank baru dengan nilai awal untuk atribut-atributnya
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening; // Menginisialisasi atribut nomorRekening dengan nilai yang diberikan
        this.namaPemilik = namaPemilik; // Menginisialisasi atribut namaPemilik dengan nilai yang diberikan
        this.saldo = saldo; // Menginisialisasi atribut saldo dengan nilai yang diberikan
        this.jumlahTransaksi = 0; // Menginisialisasi atribut jumlahTransaksi dengan 0

    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening); //Menampilkan nomor rekening
        System.out.println("Nama Pemilik: " + namaPemilik); //Menampilkan nama pemilik rekening
        System.out.println("Saldo: Rp" + saldo); //Menampilkan saldo rekening
        System.out.println(); // Menambahkan baris kosong untuk pemisah
    }

    // Metode untuk melakukan setoran uang
    public void setorUang(double jumlah) {
        saldo += jumlah;  // Menambahkan jumlah setoran ke saldo
        jumlahTransaksi++; // Menambah jumlah transaksi
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo); // Menampilkan informasi setoran
        System.out.println();   // Menambahkan baris kosong untuk pemisah
    }

    // Metode untuk melakukan penarikan uang
    public void tarikUang(double jumlah) {
        // Memeriksa apakah saldo mencukupi untuk penarikan
        if (saldo >= jumlah) {
            saldo -= jumlah;  // Mengurangi jumlah penarikan dari saldo
            jumlahTransaksi++; // Menambah jumlah transaksi
            // Menampilkan informasi penarikan berhasil
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            // Menampilkan informasi penarikan gagal karena saldo tidak mencukupi
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
        System.out.println(); // Menambahkan baris kosong untuk pemisah
    }

    public double getSaldo() { // Metode untuk mendapatkan saldo rekening
        return saldo; // Mengembalikan nilai saldo
    }
}