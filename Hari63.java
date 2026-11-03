import java.util.Scanner;

public class Hari63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /**  System.out.print("Masukkan bilangan m: ");
        int m = input.nextInt();
        System.out.print("Masukkan bilangan : ");
        int n = input.nextInt();
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * m; 
        }
        System.out.println("Hasil dari " + m + " pangkat " + n + " adalah: " + hasil);
       */
        System.out.print("Masukkan nilai M: ");
        int m = input.nextInt();
        System.out.print("Masukkan pangkat n: ");
        int n = input.nextInt();
        System.out.println("\n--- Hasil Pangkat---\n");
        long hasil = 1;
    for (int i = 1; i <= n; i++) {
      hasil = hasil* m;
    }
    
    System.out.print("hasilnya: ");
    for (int i = 1; i <= n; i++) {
      if (i < n) System.out.print(m + " x ");
      else System.out.print(m + " = " + hasil);
            }
            
            System.out.println(); 
        }
    }

