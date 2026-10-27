import java.util.Scanner;
public class Hari56 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("MASUKKAN ANGKA N: ");
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++){
            if( i % 2 != 0) {
                System.out.print(i + " " );
            }
        }
        
      System.out.println();
        
        for (int i = 1; i <= n; i++){
            if ( i % 2 == 0) {
                System.out.print( + i + " " );
            }
        }  
    }
    
    }
