public class Animal {   // Atribut-atribut kelas Animal
    String nama; // Nama animal
    String jenis; //Jenis animal
    String suara; //SUara yang dihasilkan animal

    // Konstruktor kelas Animal
    // Konstruktor ini digunakan untuk membuat objek Animal baru dengan nilai awal untuk atribut-atributnya
    public Animal(String nama, String jenis, String suara) {
        this.nama = nama; // Menginisialisasi atribut nama dengan nilai yang diberikan
        this.jenis = jenis; // Menginisialisasi atribut jenis dengan nilai yang diberikan
        this.suara = suara;  // Menginisialisasi atribut suara dengan nilai yang diberikan

    }

    public void tampilkanInfo() {  // Metode untuk menampilkan informasi hewan
        System.out.println("Nama: " + nama); //Menampilkan nama animal
        System.out.println("Jenis: " + jenis); //Menampilkan jenis animal
        System.out.println("Suara: " + suara); //Menampilkan suara animal

        System.out.println();  // Metode untuk menampilkan informasi hewan
    }
}