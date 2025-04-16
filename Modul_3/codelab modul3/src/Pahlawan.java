public class Pahlawan extends KarakterGame {
    //Mendefinisikan perilaku spesifik untuk karakter pahlawan
    public Pahlawan(String nama, int kesehatan) {
        // Konstruktor untuk kelas Pahlawan.
        // Menerima dua parameter: nama dan kesehatan awal pahlawan.
        super(nama, kesehatan);
        // Memanggil konstruktor dari superclass (KarakterGame) untuk menginisialisasi
        // atribut nama dan kesehatan yang diwarisi.
    }

    @Override
    // Anotasi @Override menunjukkan bahwa metode ini mengganti (override)
    // metode serang yang didefinisikan di superclass (KarakterGame).
    public void serang(KarakterGame target) {
        // Mengurangi 20 poin kesehatan dari target
        target.setKesehatan(target.getKesehatan() - 20);
        // Mengurangi 20 poin kesehatan dari target.
        // Memanggil metode setKesehatan pada objek target untuk mengubah nilai kesehatannya.
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        //mencetak informasi kesehatan target setelah serangan.
    }
}