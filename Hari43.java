import java.util.Scanner;
public class Hari43 {
    public static void main(String[] args) {
     Scanner f = new Scanner(System.in);
        
System.out.println("=== MENENTUKAN NILAI ===");
System.out.println("masukkan angka nya : ");
        
        int x = f.nextInt();
        
        if (x % 3 == 0 && x % 5 == 0 ){
            System.out.println(x + " kelipatan 3 dan 5");
        }else if ( x % 3 == 0){
            System.out.println(x + " kelipatan 3");
        }else if (x % 5 == 0){
            System.out.println(x + " kelipatan 5");
        }else{
            System.out.println("bukan kelipatan 3 atau 5");
        }
        
        
        f.close();
    }
    
        }
