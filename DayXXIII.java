import java.util.Scanner;

public class DayXXIII {
    public static void main(String[] args) {
        // 1. Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Program Hitung Luas Persegi ===");
        
        // 2. Meminta pengguna memasukkan panjang sisi
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();
        
        // 3. Menghitung luas persegi (sisi * sisi)
        int luas = sisi * sisi;
        
        // 4. Menampilkan hasil perhitungan
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luas + "cm");
        
        // 5. Menutup Scanner untuk menghemat memori
        input.close();
    }
}
