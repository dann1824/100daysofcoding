import java.util.Scanner;
public class Hari55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.print("MASUKKAN ANGKA:  ");
     //   int a = in.nextInt();
        
        /**
         * PENGGUNAAN BREAK / BERHENTI
         
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Loop dihentikan secara paksa oleh break pada i = " + i);
                break; 
            }
            System.out.println("Angka: " + i);
        }
        System.out.println("Kode setelah perulangan selesai.");
    */
        
        
       /** PENGGUNAAN CONTINUE ATAU SKIP
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Angka " + i + " dilewati (skip).");
                continue; // Langsung lompat ke iterasi i = 4, kode di bawahnya diabaikan
            }
            System.out.println("Angka: " + i);
        } */
        

        System.out.print("Masukkan umur Anda:   ");
int umur = in.nextInt();
        if (umur < 17) {
            System.out.println("Maaf, film ini khusus 17 tahun ke atas!");
            return; 
        }
        System.out.println("Silahkan masuk, selamat menonton film!");
    }
}

        
    
        
        

