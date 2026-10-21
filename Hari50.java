import java.util.Scanner;
public class Hari50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== MENENTUKAN GANJIL GENAP ===");
        System.out.println("=== MASUKKAN ANGKA NYA BEBAS ===");
        System.out.println("====================================");
        System.out.println();
        int f = in.nextInt();
        String penentuan = (f % 2 == 0) ? "GENAP" : "GANJIL";
        System.out.println("Bilangan: " + f + " \nAdalah Jenis Bilangan : " + penentuan);
        System.out.println();
        System.out.println("==================================");
    }
    
          }
