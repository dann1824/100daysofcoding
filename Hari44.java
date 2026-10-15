import java.util.Scanner;
public class Hari44 {
    public static void main(String[] args) {
     Scanner fax = new Scanner(System.in);
System.out.println("=== PREDIKAT NILAI MAHASISWA ===");
System.out.println("masukkan ipk nya: ");
        double y = fax.nextDouble();
        
        if (y == 4.00){
            System.out.println(y + " Predikat A+");
        }else if (y == 3.00){
            System.out.println(y  + " Predikat B");
        }else if (y == 2.00){
            System.out.println(y + " Predikat C");
        }else if (y == 1.90){
            System.out.println(y + " Predikat D");
        }else{
            System.out.println(y + " Predikat E-");
        }
        
        
        
        
        
    }
    
}
