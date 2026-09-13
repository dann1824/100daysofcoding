import java.util.Scanner;

public class DayXII {
    public static void main(String[] args) {
        // Membuat objek Scanner baru
        Scanner scanner = new Scanner(System.in);

        // Menyiapkan variabel
        String nama, alamat, hobby;
        int umur;
        float tinggi;

        // Meminta input dari pengguna
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();

        System.out.print("Masukkan Alamat: ");
        alamat = scanner.nextLine();

        System.out.print("Masukkan Umur: ");
        umur = scanner.nextInt();
        
        // Membersihkan newline buffer
        scanner.nextLine(); 

        System.out.print("Masukkan Hobby: ");
        hobby = scanner.nextLine();
        
        System.out.print("Tinggi ku: ");
        tinggi = scanner.nextFloat();
        

        // Menampilkan hasil biodata
        System.out.println("\n•∆•∆•∆• DATA BIODATA •∆•∆•∆•");
        System.out.println("Nama ku   : " + nama);
        System.out.println("Alamatku : " + alamat);
        System.out.println("Umur ku : " +  umur);
        System.out.println("Hobby ku  : " + hobby);
        System.out.println("Tinggi ku 165.5 : " + tinggi);
        scanner.close();
    }
}
