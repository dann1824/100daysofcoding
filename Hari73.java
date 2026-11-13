
import java.util.Scanner;
public class Hari73 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("coba masukkan kalimat apapun: ");
        String teks = in.nextLine();
        int panjangTeks = teks.length();
        System.out.println("Panjang teks: " + panjangTeks);
        System.out.println();
        String hurufBesar = teks.toUpperCase();
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println();
        String hurufKecil = teks.toLowerCase();
        System.out.println("Huruf Kecil: " + hurufKecil);
    }
}
