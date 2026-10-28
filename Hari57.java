import java.util.Scanner; 

public class Hari57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt(); 

        System.out.println("\nBilangan Ganjil dari 1 sampai " + (n - 1) + ":");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan Genap dari 1 sampai " + (n - 1) + ":");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }

        input.close(); 
    }
          }
