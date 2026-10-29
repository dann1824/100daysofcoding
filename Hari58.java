import java.util.Scanner;

public class Hari58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai m: ");
        int m = in.nextInt();
        
        System.out.print("Masukkan nilai n: ");
        int n = in.nextInt();
        
        System.out.println("Bil.kelipatan " + m + " dari 1 sampai " + n + " yaitu:\n");
        
        for (int i = 1; i <= n; i++){
            if (i % m == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        in.close();
    }
    }
