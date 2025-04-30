import java.util.Scanner;  // Mengimpor kelas Scanner untuk input pengguna

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari konsol

        // Input untuk animal1
        System.out.println("Nama:"); // Menampilkan pesan untuk meminta input nama hewan 1
        String nama1 = input.nextLine(); // Membaca input nama hewan 1 dari pengguna
        System.out.println("Jenis:"); //Menampilkan pesan untuk meminta input jenis hewan 1
        String jenis1 = input.nextLine();
        System.out.println("Suara:");
        String suara1 = input.nextLine();

        // Membuat objek animal1
        Animal animal1 = new Animal(nama1, jenis1, suara1); // Membuat objek Animal dengan data yang diinput

        // Input untuk animal2
        System.out.println("\nNama:"); // Menampilkan pesan untuk meminta input nama hewan 2 (dengan baris baru)
        String nama2 = input.nextLine(); // Membaca input nama hewan 2 dari pengguna
        System.out.println("Jenis:"); // Menampilkan pesan untuk meminta input jenis hewan 2
        String jenis2 = input.nextLine();
        System.out.println("Suara:");
        String suara2 = input.nextLine();


        Animal animal2 = new Animal(nama2, jenis2, suara2); // Membuat objek Animal dengan data yang diinput

        animal1.tampilkanInfo(); // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan 1
        animal2.tampilkanInfo(); // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan 2

        input.close(); // Menutup objek Scanner untuk melepaskan sumber daya
    }
}