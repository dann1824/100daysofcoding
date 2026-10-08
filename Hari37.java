import java.util.Scanner;

public class Hari37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        if (angka > 0) {
            System.out.println(angka + " adalah Bilangan Positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah Bilangan Negatif.");
        } else {
            System.out.println("Angka tersebut adalah Nol (0).");
        }
        
        input.close();
    }
       }
