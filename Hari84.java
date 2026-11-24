import java.util.Scanner;

public class Hari84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("jmlah elemen: ");
        int n = in.nextInt();
        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Isi " + i + ": ");
            angka[i] = in.nextInt();
        }
        int maks = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] > maks) {
                maks = angka[i];
            }
        }
        System.out.println("Angka maks: " + maks);
    }
}
