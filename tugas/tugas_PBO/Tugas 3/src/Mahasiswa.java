public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim); // Memanggil constructor User
    }

    @Override
    public boolean login(String nama, String nim) {
        return getNama().equals(nama) && getNim().equals(nim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        super.displayInfo();
    }
}