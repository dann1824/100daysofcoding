import java.util.Scanner;
public class Hari86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("15, 40, 8, 25, 33");
        int[] angka = {15, 40, 8, 25, 33};
        System.out.print("Cari angka: ");
        int cari = in.nextInt();
        boolean ketemu = false;
        int posisi = -1;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ketemu = true;
                posisi = i;
                break;
            }
        }
        if (ketemu) {
            System.out.println(cari + " ditemukan di indeks " + posisi);
        } else {
            System.out.println(cari + " tidak ditemukan");
        }
    }
}
