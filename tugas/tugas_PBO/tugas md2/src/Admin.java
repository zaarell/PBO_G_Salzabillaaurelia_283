import java.util.Scanner;
public class Admin {
    String username = "Admin282";
    String password = "Password283";

    void login(String userInput, String passInput) {
        if ((userInput.equals(username)) && (passInput.equals(password))) {
            System.out.println("Login admin berhasil");
        } else {
            System.out.println("Login admin gagal, username atau nim salah");

        }
    }
}