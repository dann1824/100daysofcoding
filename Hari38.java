import java.util.Scanner;
public class Hari38{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        
        System.out.println("== MENU MAKANAN TOP ==");
        System.out.println("1. MIE AYAMM");
        System.out.println("2. Bakso Biasa");
        System.out.println("3. Nasreng Goreng");
        System.out.println("4. Coto Makassar");
        
        System.out.println("Silahkan pilih menu nya (1-4): ");
        int pilihan = f.nextInt();
        
        if (pilihan == 1){
            System.out.println("Mie Ayam MAKANAN TER THE BEST");
        } else if (pilihan == 2){
          System.out.println("beliau memilih bakso"); 
        } else if (pilihan == 3){
            System.out.println("Anda memilih Nasgor goreng");
        } else if (pilihan == 4){
            System.out.println("coto makassar memang enak");
        }else{
            System.out.println("menu nya habis");
        }
    }
          }
