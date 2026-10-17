import java.util.Scanner;

public class Hari46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===    MENU MAKANAN TOP   ===");
        System.out.println("=== PILIH SELERA FAV ANDA ===");
        System.out.println("    1. MIE AYAMM");
        System.out.println("    2. Bakso Komplit");
        System.out.println("    3. Nasgor Nasi Goreng");
        System.out.println("    4. Coto Majene");
        System.out.println("    5. Ayam Smackdown");
        
        
        System.out.print("Masukkan nomor menu (1-5): ");
        int nomorMenu = input.nextInt();
        String PilihanAnda;

        switch (nomorMenu) {
            case 1:
                PilihanAnda = "MIE AYAMM";
                break;
            case 2:
                PilihanAnda = "Bakso Komplit";
                break;
            case 3:
                PilihanAnda = "Nasgor Nasi Goreng";
                break;
            case 4:
                PilihanAnda = "Coto Majene";
                break;
            case 5:
                PilihanAnda = "Ayam Smackdown";
                break;
            default:
           System.out.println(); 
                PilihanAnda = "menuHabis";
        }

        System.out.println("Menu: " + PilihanAnda);
        System.out.println();
       System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|"); 
    }
          }
