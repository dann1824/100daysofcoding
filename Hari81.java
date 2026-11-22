import java.util.Scanner;

public class Hari81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("jumlah semua elemen: ");
        int n = in.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("panjang " + i + ": ");
            angka[i] = in.nextInt();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("indeks " + i + ": " + angka[i]);
        }
    }
}
