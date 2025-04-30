public class Musuh extends KarakterGame {  // Kelas Musuh adalah turunan dari kelas KarakterGame, mewarisi atribut dan metode dari KarakterGame.

    public Musuh(String nama, int kesehatan) {
        // Konstruktor untuk kelas Musuh.
        // Menerima dua parameter: nama dan kesehatan awal musuh.
        super(nama, kesehatan);
        // Memanggil konstruktor dari superclass (KarakterGame) untuk menginisialisasi
        // atribut nama dan kesehatan yang diwarisi.
    }

    @Override
    public void serang(KarakterGame target) {
        // Mengurangi 15 poin kesehatan dari target
        target.setKesehatan(target.getKesehatan() - 15);
        // Menampilkan kesehatan terbaru target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}