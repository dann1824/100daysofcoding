import java.util.Scanner;
public class Hari72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n1. cetak angka (1-50)\n2. selesai");
            System.out.print("pilih: ");
            pilih = in.nextInt();
            if (pilih == 1) {
                for (int i = 1; i <= 50; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } while (pilih != 2);
        System.out.println("slesai.");
        in.close();
    }
}
