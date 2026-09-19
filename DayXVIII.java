public class DayXVIII {
    public static void main(String[] args) {
        
        
   System.out.println("-!-!-!-!- KONVERSI OTOMATIS TIPE DATA -!-!-!-!-!+");    
    //mengonversi atau mengubah dari 9 tipe data itu secara otomatis
        
        // 1. byte ke short 
        byte dataByte = 12;
        short byteKeShort = dataByte; 

        // 2. short ke int 
        short dataShort = 120;
        int shortKeInt = dataShort;

        // 3. char ke int - Mengambil nilai ASCII/Unicode
        char dataChar = 'A';
        int charKeInt = dataChar; // Menghasilkan nilai 65

        // 4. int ke long
        int dataInt = 70000;
        long intKeLong = dataInt;

        // 5. long ke float  - Mengubah bilangan bulat ke desimal
        long dataLong = 28912345L;
        float longKeFloat = dataLong;

        // 6. float ke double 
        float dataFloat = 5.75f;
        double floatKeDouble = dataFloat;

        // --- TIPE DATA YANG TIDAK BISA KONVERSI OTOMATIS ---
        
        // 7. boolean (Hanya true/false, tidak bisa dikonversi ke angka)
        boolean dataBoolean = true; 

        // 8. String tipe data nda bisa otomatis ke numerik
        String dataString = "100"; 
        
        // 9. int ke double (Contoh tambahan lompatan jauh: dari int langsung ke double)
        int dataInt2 = 35;
        double intKeDouble = dataInt2; // Menghasilkan 35.0

        // Menampilkan Hasil Konversi
        System.out.println("1. byte ke short   : " + byteKeShort);
        System.out.println("2. short ke int    : " + shortKeInt);
        System.out.println("3. char ke int     : " + charKeInt + " (Nilai ASCII dari 'A')");
        System.out.println("4. int ke long     : " + intKeLong);
        System.out.println("5. long ke float   : " + longKeFloat);
        System.out.println("6. float ke double : " + floatKeDouble);
        System.out.println("7. boolean nilai   : " + dataBoolean);
        System.out.println("8. String nilai    : " + dataString);
        System.out.println("9. int ke double   : " + intKeDouble);
    }
          }
