import java.util.Scanner;
public class Hari67 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("masukkan nilai/simbol: ");
        int a = 10;
        char b = in.next().charAt(0);
        
        for (int i = 1; i <= a; i++){
            
            for (int j = 1; j <= a; j++){
            System.out.print(" " + b);
        }
     System.out.println();   
    }
    }  
}
