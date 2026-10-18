import java.util.Scanner;
public class Hari47 {
    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
System.out.println("=== MENENTUKAN HARI ===");
System.out.println("Masukkan nomor hari (1-7)");        
   int a = in.nextInt();
String namaHari;
switch (a){
    case 1:
    namaHari = "Senin";
    break;
    case 2:
    namaHari = "selasa";
    break;
    case 3: 
    namaHari = "rabu";
    break;
    case 4:
    namaHari = "kamis";
    break;
    case 5:
    namaHari = "jumat";
    break;
    case 6:
    namaHari = "sabtu";
    break;
    case 7:
    namaHari = "minggu";
    break;
    default:
    namaHari = "masukkan nomor yg sesuai";
    break;
}
   System.out.println("Hari: " + namaHari);     
    }
    
  }
