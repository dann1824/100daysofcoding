import java.util.Scanner;

public class Hari62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total hari kerkom: ");
        int K = input.nextInt();
        System.out.print("Masukkan jumlah matkul per hari: ");
        int M = input.nextInt();
        
        System.out.println("\n--- GUNUNG TUGAS IFORMATIKA---\n");

        // 4. Proses Nested Loop
        for (int N = 1; N <= K; N++) {
            System.out.println("hri ke-" + N );

            for (int tugas = 1; tugas <= M; tugas++) {
                System.out.println(" nugas terus-" + tugas);
            }
            
            System.out.println(); 
        }
    }
}
