import java.util.Scanner;

public class Hari83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah elemen: ");
        int n = in.nextInt();
        int[] angka = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Isi " + i + ": ");
            angka[i] = in.nextInt();
            total += angka[i];
        }

        System.out.println("Total: " + total);
    }
}
