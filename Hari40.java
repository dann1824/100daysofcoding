import java.util.Scanner; 

public class Hari40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan temperatur ruangan (°C): ");
        double temperatur = input.nextDouble(); 
        
        if (temperatur < 20.0) {
            System.out.println("Status Ruangan: Dingin");
        } 
        else if (temperatur >= 20.0 && temperatur <= 27.0) {
            System.out.println("Status Ruangan: Normal/Nyaman  ");
        } 
        else {
            System.out.println("Status Ruangan: Panas ");
        }
        
        input.close(); 
    }
}
