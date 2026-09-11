public class DayTen {
    public static void main(String[] args) {
        
        System.out.println("=== BATAS MINIMAL & MAKSIMAL TIPE DATA JAVA ===");

        // 1. KELOMPOK BILANGAN BULAT
        System.out.println("Byte   Min: " + Byte.MIN_VALUE);
        System.out.println("Byte   Max: " + Byte.MAX_VALUE);
        System.out.println("-----------------------><><>------------------");

        System.out.println("Short  Min: " + Short.MIN_VALUE);
        System.out.println("Short  Max: " + Short.MAX_VALUE);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><><");

        System.out.println("Int    Min: " + Integer.MIN_VALUE);
        System.out.println("Int    Max: " + Integer.MAX_VALUE);
        System.out.println("---------------------------------------------");

        System.out.println("Long   Min: " + Long.MIN_VALUE);
        System.out.println("Long   Max: " + Long.MAX_VALUE);
        System.out.println("---------------------------------------------");

        // 2. KELOMPOK BILANGAN PECAHAN
        System.out.println("Float  Min: " + Float.MIN_VALUE + " (Positif terkecil mendekati 0)");
        System.out.println("Float  Max: " + Float.MAX_VALUE);
        System.out.println("---------------------------------------------");

        System.out.println("Double Min: " + Double.MIN_VALUE + " (Positif terkecil mendekati 0)");
        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("---------------------------------------------");

        // 3. KELOMPOK KARAKTER
        // Di-cast ke (int) agar muncul angka Unicode-nya (0 sampai 65535)
        System.out.println("Char   Min: " + (int) Character.MIN_VALUE);
        System.out.println("Char   Max: " + (int) Character.MAX_VALUE);
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
        
        // Catatan: Boolean tidak memiliki MIN_VALUE/MAX_VALUE karena hanya true/false
        System.out.println("Boolean   : hanya " + Boolean.FALSE + " atau " + Boolean.TRUE);
    }
}
