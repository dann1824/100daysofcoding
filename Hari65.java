import java.util.Scanner;
public class Hari65 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("MASUKKAN SIMBOL YANG INGIN DI BUAT POLA VERTIKAL: ");
        char a = in.next().charAt(0);
        int tinggi = 10;
        for (int f = 1; f <= tinggi; f++){
            System.out.println(a);
        }
    }
} 
