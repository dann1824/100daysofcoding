public class DayXIX {
    public static void main(String[] args) {
        // --- 1. STRING ke CHAR (Konversi nya itu manual Objek ke Primitif) ---
        String teksInisial = "A";
        char dataChar = teksInisial.charAt(0); 

        // --- 2. DOUBLE ke FLOAT (dri yg awal desimal Besar ke Desimal Kecil) ---
        double nilaiDoubleBesar = 3.1415926535d;
        float dataFloat = (float) nilaiDoubleBesar; // Dipaksa pangkas presisinya

        // --- 3. FLOAT ke LONG (Desimal ke Angka Bulat Besar) ---
        float nilaiFloatAwal = 7800000.75f;
        long dataLong = (long) nilaiFloatAwal; // Dipaksa buang angka di belakang koma (.75)

        // --- 4. LONG ke INT (Angka Bulat Besar ke Standar) ---
        long nilaiLongBesar = 2147483648L; // Di atas batas maksimal int (2147483647)
        int dataInt = (int) nilaiLongBesar; // Hasilnya akan melingkar/negatif karena overflow

        // --- 5. INT ke SHORT (tipe angka Bulat Standar ke Kecil) ---
        int nilaiIntAwal = 72000; // Di atas batas maksimal short (32767)
        short dataShort = (short) nilaiIntAwal; // Dipaksa masuk, nilai berubah

        // --- 6. SHORT ke BYTE (Angka Bulat Kecil ke Sangat Kecil) ---
        short nilaiShortAwal = 130; // Di atas batas maksimal byte itu sampe (127)
        byte dataByte = (byte) nilaiShortAwal; // Nilai melingkar menjadi negatif
       
       boolean statusKonversi = true; 
        String pesanSelesai = "jangan di paksa jika memang tidak cocok bersatu, seperti hal nya dia";

        // --- MENAMPILKAN HASIL KONVERSI PAKSA ---
        System.out.println("--> HASIL KONVERSI MANUAL / PAKSA <<-");
        System.out.println("1. String ke Char   : " + teksInisial + " -> " + dataChar);
        System.out.println("2. Double ke Float  : " + nilaiDoubleBesar + " -> " + dataFloat);
        System.out.println("3. Float ke Long    : " + nilaiFloatAwal + " -> " + dataLong);
        System.out.println("4. Long ke Int      : " + nilaiLongBesar + " -> " + dataInt + " (Terjadi Overflow)");
        System.out.println("5. Int ke Short     : " + nilaiIntAwal + " -> " + dataShort + " (Nilai Berubah)");
        System.out.println("6. Short ke Byte    : " + nilaiShortAwal + " -> " + dataByte + " (Nilai Melingkar)");
        System.out.println("7. Boolean Status   : " + statusKonversi);
        System.out.println("8. Pesan String     : " + pesanSelesai);
    }
}
