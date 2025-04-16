import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna.

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari konsol.
        Admin admin = new Admin("admin", "admin283"); // Membuat objek Admin dengan username dan password default.
        Mahasiswa mahasiswa = new Mahasiswa("Salzabilla Aurelia", "202410370110283"); // Membuat objek Mahasiswa dengan nama dan NIM default.

        while (true) { // Loop tak terbatas untuk menampilkan menu login berulang kali.
            System.out.println("Pilih jenis login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");

            int pilihan = scanner.nextInt(); // Membaca pilihan pengguna sebagai integer.
            scanner.nextLine(); // Membuang karakter newline yang tersisa setelah membaca integer.

            switch (pilihan) { // Struktur switch untuk menangani pilihan pengguna.
                case 1:
                    System.out.print("Username: "); // Meminta username admin.
                    String username = scanner.nextLine(); // Membaca username admin.
                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    if (admin.login(username, password)) { // Memanggil metode login pada objek Admin.
                        System.out.println("Login Admin berhasil!"); // Menampilkan pesan sukses jika login berhasil.
                    } else {
                        System.out.println("Login Admin gagal!"); // Menampilkan pesan gagal jika login gagal.
                    }
                    break;
                case 2:
                    System.out.print("Nama: "); // Meminta nama mahasiswa.
                    String nama = scanner.nextLine(); // Membaca nama mahasiswa.
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();

                    if (mahasiswa.login(nama, nim)) { // Memanggil metode login pada objek Mahasiswa.
                        System.out.println("Login Mahasiswa berhasil!"); // Menampilkan pesan sukses jika login berhasil.
                        mahasiswa.displayInfo(); // Memanggil metode displayInfo untuk menampilkan informasi mahasiswa.
                    } else {
                        System.out.println("Login Mahasiswa gagal!"); // Menampilkan pesan gagal jika login gagal.
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    scanner.close(); // Menutup objek Scanner.
                    return; // Keluar dari metode main dan mengakhiri program.
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}