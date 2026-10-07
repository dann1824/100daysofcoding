import java.util.Scanner; 

public class Hari36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angkanya: ");
        int angka = input.nextInt(); 
        
        if (angka % 2 == 0) {
            System.out.println(angka + " bil.genap.");
        } else {
            System.out.println(angka + " bil.ganjil.");
        }
        
        input.close();
    }
}
