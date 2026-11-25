import java.util.Scanner;

public class Hari85{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== ANGKA MINIMAL ===");
        System.out.print("jmlah elemen: ");
        int n = in.nextInt();
        int[] angka = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Isi " + i + ": ");
            angka[i] = in.nextInt();
        }
        int min = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
System.out.println();
        System.out.println("Angka min: " + min);
    }
}
