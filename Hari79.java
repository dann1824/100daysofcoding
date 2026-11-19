import java.util.Scanner;
public class Hari79 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        String [] tekno = {"mobil", "motor", "pesawat", "tank", "sepeda", "MIE AYAMM"};
        System.out.println("masukkan indeks (0-5): ");
        int i = in.nextInt();
        System.out.print("pilihannya " +  i + ": " + tekno[i]);
        
    }
    
}
