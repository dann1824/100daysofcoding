import java.util.Scanner;
public class DayXXV {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);   
        
     /**
      * Math PI itu konstanta bawaan dari java yang berarti Pi(π)
      * agar perhitungan nya lebih akurat maka perlu -
      * menggunakan Math.PI dalam program
      * printf di gunakan agar dapat sesuai dengan soal
      * kita dapat menentukan sendiri mau berapa angka -
      * di belakang koma,
      * menggunakan double agar menghasilkan bilangan desimal
      * maksud dari diameter / 2 adalah 14 ÷ 2 maka hasilnya 7
      */
        System.out.println("=== PROGRAM MENGHITUNG LUAS KOLAM ===");
        System.out.println("Masukkan Diameter Kolam (Meter): ");
        double diameter = in.nextDouble();
        double jarijari = diameter / 2;
        double luas = Math.PI * jarijari * jarijari;
        
        System.out.println();
        System.out.println("===========================");
        System.out.println("+++ HASIL PERHITUNGAN +++");
        System.out.println();
        System.out.printf("Diameter   : %.1f m\n", diameter);
        System.out.printf("Jari Jari  : %.1f m\n", jarijari);
        System.out.printf("Luas       : %.2f m2\n", luas);
        System.out.println("===========================");
        
        in.close();
        
        
        
    }
    
}
