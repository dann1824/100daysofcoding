import java.util.Scanner;

public class Hari42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Gaji Pokok: ");
        double gapok = in.nextDouble();
        System.out.print("Tunjangan : ");
        double tunjangan = in.nextDouble();

        double kotor = gapok + tunjangan;
        double tarifPajak = 0.0;

        // Kondisi IF untuk menentukan persentase pajak
        if (kotor > 5000000) {
            tarifPajak = 0.15; // 15% jika gaji kotor di atas 5 juta
        } else {
            tarifPajak = 0.05; // 5% jika gaji kotor 5 juta atau kurang
        }

        double pajak = tarifPajak * kotor;
        double bersih = kotor - pajak;

        System.out.println("Gaji Kotor : Rp " + kotor);
        System.out.println("Pajak (" + (tarifPajak * 100) + "%): Rp " + pajak);
        System.out.println("Gaji Bersih: Rp " + bersih);
    }
}
