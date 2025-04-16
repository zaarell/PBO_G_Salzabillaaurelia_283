import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String username, password, nama, nim;

        System.out.println("Pilihan Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            username = input.nextLine();
            System.out.print("Masukkan Password: ");
            password = input.nextLine();

            String validUsername = "Admin283";
            String validPassword = "Password283";

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {

            System.out.print("Masukkan Nama: ");
            nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = input.nextLine();

            String validNama = "Salzabilla Aurelia Maheswari";
            String validNIM = "202410370110283";

            if (nama.equals(validNama) && nim.equals(validNIM)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}