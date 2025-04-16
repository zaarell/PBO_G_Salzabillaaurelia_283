public class Main {
    public static void main(String[] args) {
        // Membuat tiga objek:
        // 1. KarakterGame bernama "Karakter Umum" dengan 100 kesehatan
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);

        // 2. Pahlawan bernama "Brimstone" dengan 150 kesehatan
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);

        // 3. Musuh bernama "Viper" dengan 200 kesehatan
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal kesehatan Pahlawan dan Musuh
        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        // Mensimulasikan pertarungan:
        // 1. Brimstone menyerang Viper menggunakan Orbital Strike
        System.out.println(brimstone.getNama() + " menyerang " + viper.getNama() + " menggunakan Orbital Strike!");
        brimstone.serang(viper);

        // 2. Viper menyerang Brimstone menggunakan Snake Bite
        System.out.println(viper.getNama() + " menyerang " + brimstone.getNama() + " menggunakan Snake Bite!");
        viper.serang(brimstone);
    }
}