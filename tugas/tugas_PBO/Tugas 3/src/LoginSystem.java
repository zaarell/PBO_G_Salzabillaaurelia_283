import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih jenis login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String namaAdmin = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nimAdmin = scanner.nextLine();
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    Admin admin = new Admin(namaAdmin, nimAdmin, username, password);
                    if (admin.login(username, password)) {
                        admin.displayInfo();
                    } else {
                        System.out.println("Login Admin gagal!");
                    }
                    break;
                case 2:
                    System.out.print("Nama: ");
                    String namaMhs = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nimMhs = scanner.nextLine();

                    Mahasiswa mahasiswa = new Mahasiswa(namaMhs, nimMhs);
                    if (mahasiswa.login(namaMhs, nimMhs)) {
                        mahasiswa.displayInfo();
                    } else {
                        System.out.println("Login Mahasiswa gagal!");
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}