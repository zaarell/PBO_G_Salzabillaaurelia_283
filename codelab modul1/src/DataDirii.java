import java.time.LocalDate; // Mengimpor kelas LocalDate untuk mendapatkan tahun saat ini.
import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna.

public class DataDirii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input.

        System.out.print("Masukkan Nama: "); // Menampilkan pesan untuk meminta input nama.
        String nama = scanner.nextLine(); // Membaca input nama dari pengguna.

        System.out.print("Masukkan Jenis Kelamin (P/L): "); // Menampilkan pesan untuk meminta input jenis kelamin.
        String gender = scanner.nextLine(); // Membaca input jenis kelamin dari pengguna.

        System.out.print("Masukkan Tahun Lahir: "); // Menampilkan pesan untuk meminta input tahun lahir.
        int birthYear = scanner.nextInt(); // Membaca input tahun lahir dari pengguna.

        int currentYear = LocalDate.now().getYear(); // Mendapatkan tahun saat ini.
        int age = currentYear - birthYear; // Menghitung umur berdasarkan tahun lahir dan tahun saat ini.

        String genderString; // Mendeklarasikan variabel untuk menyimpan representasi string dari jenis kelamin.
        if (gender.equals("L")) { // Memeriksa apakah jenis kelamin adalah "L" (Laki-laki).
            genderString = "Laki-laki"; // Jika ya, menetapkan genderString menjadi "Laki-laki".
        } else if (gender.equals("P")) { // Memeriksa apakah jenis kelamin adalah "P" (Perempuan).
            genderString = "Perempuan"; // Jika ya, menetapkan genderString menjadi "Perempuan".
        } else { // Jika jenis kelamin bukan "L" atau "P".
            genderString = "Tidak diketahui"; // Menetapkan genderString menjadi "Tidak diketahui".
        }

        scanner.close(); // Menutup objek Scanner untuk mencegah kebocoran sumber daya.

        System.out.println("\nData Diri:"); // Menampilkan judul "Data Diri".
        System.out.println("Nama: " + nama); // Menampilkan nama yang dimasukkan.
        System.out.println("Jenis kelamin: " + genderString); // Menampilkan jenis kelamin yang telah dikonversi ke string.
        System.out.println("Umur: " + age); // Menampilkan umur yang telah dihitung.
    }
}