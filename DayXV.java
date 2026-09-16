import java.util.Scanner;
public class DayXV {
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        
       System.out.println("masukkan jumlah kotak manggis yg dimiliki: ");
int kotakManggis = in.nextInt();
      
      System.out.println("masukkan jumlah manggis nya per kotak: ");
      int jumlahManggis = in.nextInt();
      
      System.out.println("jumlah tetangga nya berapa: ");
      int JumlahTetangga = in.nextInt();
      
      System.out.println();
      
      int TotalManggis = kotakManggis * jumlahManggis;
      int BagianTetangga = TotalManggis / JumlahTetangga;
      
      System.out.println("->> \033[1mHASIL PERHITUNGAN NYA  <<-");
      System.out.println( "total seluruh manggis kak adida : " + TotalManggis + "\nbuah");
        System.out.println("Manggis yang di bagikan ke tetangga kompleks: " + BagianTetangga + "\nbuah");
        
        
        
    }
    
        }
