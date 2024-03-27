import java.util.Scanner;
class LibrarySystem {
    private final String adminUsername = "admin3";
    private final String adminPassword = "admin5";
    private final String mahasiswaNIM = "202310370311347";
    public boolean loginAdmin(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }
    public boolean loginMahasiswa(String nim) {
        return nim.length() == 15 && nim.equals(mahasiswaNIM);
    }
}
public class LoginSystem {
    public static void main(String[] args) {


    }
    private static void loginAdmin(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Masukkan username: ");
        String adminUsername = scanner.next();
        System.out.print("Masukkan password: ");
        String adminPassword = scanner.next();

        if (librarySystem.loginAdmin(adminUsername, adminPassword)) {
            System.out.println("Login berhasil sebagai admin");
        } else {
            System.out.println("Login gagal");
        }
    }
    private static void loginMahasiswa(LibrarySystem librarySystem, Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        if (librarySystem.loginMahasiswa(nim)) {
            System.out.println("Login berhasil sebagai mahasiswa");
        } else {
            System.out.println("Login gagal");
        }
    }
}
