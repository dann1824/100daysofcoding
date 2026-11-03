import java.util.Scanner;

public class Hari63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan m: ");
        int m = input.nextInt();
        System.out.print("Masukkan bilangan : ");
        int n = input.nextInt();
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * m; 
        }
        System.out.println("Hasil dari " + m + " pangkat " + n + " adalah: " + hasil);
        input.close();
    }
}
