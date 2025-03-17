import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca input untuk rekening1
        System.out.print("Nomor rekening: ");
        String nomorRekening1 = input.nextLine();

        System.out.print("Nama pemilik: ");
        String namaPemilik1 = input.nextLine();

        System.out.print("Saldo: ");
        double saldoAwal1 = input.nextDouble();

        input.nextLine(); // Membersihkan newline

        // Membaca input untuk rekening2
        System.out.print("Nomor rekening: ");
        String nomorRekening2 = input.nextLine();

        System.out.print("Nama pemilik: ");
        String namaPemilik2 = input.nextLine();

        System.out.print("Saldo: ");
        double saldoAwal2 = input.nextDouble();

        // Membuat objek RekeningBank dengan input pengguna
        RekeningBank rekening1 = new RekeningBank(nomorRekening1, namaPemilik1, saldoAwal1);
        RekeningBank rekening2 = new RekeningBank(nomorRekening2, namaPemilik2, saldoAwal2);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Membaca input untuk transaksi
        System.out.print("Masukkan jumlah setoran rekening 1: ");
        double setoran1 = input.nextDouble();
        rekening1.setorUang(setoran1);

        System.out.print("Masukkan jumlah setoran rekening 2: ");
        double setoran2 = input.nextDouble();
        rekening2.setorUang(setoran2);

        System.out.print("Masukkan jumlah penarikan rekening 1: ");
        double penarikan1 = input.nextDouble();
        rekening1.tarikUang(penarikan1);

        System.out.print("Masukkan jumlah penarikan rekening 2: ");
        double penarikan2 = input.nextDouble();
        rekening2.tarikUang(penarikan2);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        input.close(); // Menutup objek Scanner setelah selesai digunakan
    }
}