import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(this.nama) && inputNim.equals(this.nim);
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Aurelie", "10283");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Silakan login.");
        System.out.print("Masukkan nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String inputNim = scanner.nextLine();

        if (mahasiswa1.login(inputNama, inputNim)) {
            System.out.println("Login berhasil!");
            mahasiswa1.displayInfo();
        } else {
            System.out.println("Login gagal. Nama atau NIM salah.");
        }

        scanner.close();
    }
}
