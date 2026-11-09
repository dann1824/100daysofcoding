import java.util.Scanner;
public class Hari69 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan nilai agar membentuk pola segitiga siku: ");
        int a = in.nextInt();
        System.out.println();
        
        System.out.print("masukkan simbol sesuai keinginan: ");
        char b = in.next().charAt(0);
        System.out.println();
        
        for (int i = 1; i <= a; i++){
        for (int j = 1; j <= i; j++){
        System.out.print(b + " ");
        
    }
       System.out.println();     
        }
    }        
}
