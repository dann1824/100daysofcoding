import java. util.Scanner;
public class DayXXX {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=== ANTARA TRUE & FALSE ===");
        System.out.println("----------");
        int nilai1 = input.nextInt();
        int nilai2 = input.nextInt();
        boolean hasilnya = nilai1 > nilai2;
        System.out.println("hasilnya adalah: " + hasilnya);
        System.out.println("---------");
       
    }
}
    
