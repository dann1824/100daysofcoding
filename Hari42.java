import java.util.Scanner;

public class Hari42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Gaji Pokok: ");
        double gapok = in.nextDouble();
        System.out.print("Tunjangan : ");
        double tunjangan = in.nextDouble();

        double kotor = gapok + tunjangan;
        double pajak = 0.10 * kotor; // ini pajk ny 10%
        double bersih = kotor - pajak;

        System.out.println("Gaji Kotor : Rp " + kotor);
        System.out.println("Pajak (10%): Rp " + pajak);
        System.out.println("Gaji Bersih: Rp " + bersih);
    }
  }
