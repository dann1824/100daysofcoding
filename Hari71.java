import java.util.Scanner;
public class Hari71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        System.out.println("Masukkan angka negatif biar langsung berhenti:");
        for (int angka = in.nextInt(); angka >= 0; angka = in.nextInt()) {
            total += angka;
        }
        System.out.println("Total penjumlahan nya itu: " + total);
    }
}
