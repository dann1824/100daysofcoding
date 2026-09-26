import java.util.Scanner;
public class SisiSisi {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        
       System.out.println(">>> PROGRAM MENGHITUNG LUAS TAMAM <<<"); 
        System.out.println("Masukkan Panjang Taman: " );
        double panjang = in.nextDouble();
        
        System.out.println("Masukkan Lebar Taman: " );
        double lebar = in.nextDouble();
        
        double luas = panjang * lebar;
        
        System.out.println("|| HASIL PERHITUNGAN ||");
        System.out.println("Panjang Tamannya\t: " + panjang + " m");
        System.out.println("Lebar Tamannya\t: " + lebar + " m");
        System.out.println("Luas Tamannya\t: " + (panjang * lebar)+ " m2");
        
        
        
        
    }
    
   }
