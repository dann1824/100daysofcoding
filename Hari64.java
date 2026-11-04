import java.util.Scanner;

public class Hari64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        long faktorial = 1;
        for (int i = 1; i <= angka; i++) {
            faktorial *= i; 
        }
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
        input.close();
    }
}
