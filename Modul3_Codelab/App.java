import java.util.Scanner;
 public class App {
     public static void main(String[]args) throws Exception{
         Scanner scanner = new Scanner(System.in);
         Balok balok = new Balok ("balok");
         Kubus kubus = new Kubus("kubus");
         Tabung tabung = new Tabung("tabung");

         int pilihan;

         do {
             System.out.println("Pilih bangun ruang:");
             System.out.println("1. balok");
             System.out.println("2. kubus");
             System.out.println("3. tabung");
             System.out.println("4. Keluar");
             System.out.println("Masukkan pilihan");
             pilihan = scanner.nextInt();

             switch (pilihan){
                 case 1:
                     balok.inputNilai();
                     balok.luasPermukaan();
                     balok.volume();
                     break;

                 case 2:
                     kubus.inputNilai();
                     kubus.luasPermukaan();
                     kubus.volume();
                     break;

                 case 3:
                     tabung.inputNilai();
                     tabung.luasPermukaan();
                     tabung.volume();
                     break;
             }
         }
     }
}