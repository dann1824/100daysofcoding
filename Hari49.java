import java.util.Scanner;
public class Hari49 {
    public static void main(String[] args){ 
    Scanner in = new Scanner(System.in);
       System.out.println("coba masukkan angka nya: "); 
        int a = in.nextInt();
        
        // operator ternarinya
        String menentukan = (a % 2 == 0 ) ? "besar" : "kecil";
        System.out.println("penentuan: " + a + " ialah: " + menentukan);
        
        
        
    }
    
}
