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
        System.out.print("Masukkan nilai m: ");
        int m = input.nextInt();
        System.out.print("Masukkan pangkat n: ");
        int n = input.nextInt();
        System.out.println("\n--- Proses Pangkat ---");
        long hasil = 1;
        for (int i = 1; i <= n; i++) {          
            long smntara = 0;
            for (int f = 1; f <= m; f++) {      
                smntara = smntara + hasil;
            }
            hasil = smntara;
            System.out.println("Langkah " + i + ": " + hasil);
        }
        System.out.println("\nHasil dari " + m + " pangkat " + n + " adalah: " + hasil);
    }
}
