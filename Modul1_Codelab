package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama:");
        String nama = scanner.nextLine();

        System.out.println("Tanggal lahir (yyyy-mm-dd):");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        System.out.println("Jenis Kelamin (P/L):");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("L")) ? "Laki-Laki" : "Perempuan";

        // Menghitung umur
        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, sekarang);

        // Output
        System.out.println("\nOutput:");
        System.out.println("Nama Anda:" + nama);
        System.out.println("Umur Anda:" + selisih.getYears() + " tahun " + selisih.getMonths() + " bulan " + selisih.getDays() + " hari");
        System.out.println("Jenis Kelamin:" + jenisKelamin);


        scanner.close();
    }
}
