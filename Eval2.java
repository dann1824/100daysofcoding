import java.util.Scanner;
public class Eval2 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int paket = f.nextInt();
        int kupon = f.nextInt();
        int harga = 0;
        
        // Pengecekan kondisi luar
        if ( paket == 1) {
            harga = 25000;
            // Pengecekan kondisi dalam (nested if)
            if (kupon == 1) {
                harga -= 5000;
            }
        } else {
            harga = 40000;
            if (kupon == 1){
            harga -= 10000;
            }
        } System.out.println(harga);
               
    }
    }
