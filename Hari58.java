import java.util.Scanner; 

public class Hari58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt(); 
        
        System.out.println("Bilangan dari n sampai " + "(n - 1)" + ":");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) { 
                System.out.println(i + " " + "bilangan genap");
            }else{
           System.out.println(i + " " + "bilangan ganjil"); 
        }
        }
        input.close(); 
    }
}
