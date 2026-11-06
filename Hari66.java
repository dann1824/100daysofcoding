import java.util.Scanner;
public class Hari66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();
        String pola = "#O";
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                char karakter = pola.charAt((i + j) % 2);
                System.out.print(karakter + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
