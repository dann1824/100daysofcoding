import java.util.Scanner;

public class Hari45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PENGGUNAAN SWITCH CASE ===");
        System.out.println("== TOP PTN IMPIAN ANDA ==");
        System.out.print("Masukkan nomor kampus impian (1-7): ");
        int nomorKampus = input.nextInt();
        String KampusImpian;

        switch (nomorKampus) {
            case 1:
                KampusImpian = "Universitas Indonesia";
                break;
            case 2:
                KampusImpian = "Institut Teknologi Bandung";
                break;
            case 3:
                KampusImpian = "Harvard University";
                break;
            case 4:
                KampusImpian = "Universitas Negeri Makassar";
                break;
            case 5:
                KampusImpian = "Stanford University";
                break;
            case 6:
                KampusImpian = "Unair Surabaya";
                break;
            case 7:
                KampusImpian = "UGM majene";
                break;
            default:
                KampusImpian = "tidak valid";
        }

        System.out.println("Impian: " + KampusImpian);
    }
    }
