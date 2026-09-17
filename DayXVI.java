import java.util.Scanner;
public class DayXVI {
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        
       System.out.println("masukkan jumlah kelereng yang di miliki kak Rasya: ");
int JumlahKelereng = in.nextInt();
      
    //  System.out.println("Sisa Kelereng Kak Rasya sekarang: ");
   //   int SisaKelereng = in.nextInt();
      
     // int TotalManggis = kotakManggis * jumlahManggis;
      int SisaKelerengNyaKakRasya = JumlahKelereng % 10;
      
      System.out.println("->> \033[1mHASIL PERHITUNGAN NYA  <<-");
      System.out.println( "Kelereng Kak Rasya saat ini: " + SisaKelerengNyaKakRasya + "\nbutir");
        //System.out.println("sekarang kak rasya punya kelereng cuman: " + SisaKelereng + "\nbutir");
        
        
        
    }
    
}
