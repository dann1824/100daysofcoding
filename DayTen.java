
public class DayTen {
    
    public static void main(String[] args) {
        // 1. Menampilkan batas minimal dan maksimal dari Wrapper Class
        System.out.println("Batas Integer: " + Integer.MIN_VALUE + " sampai " + Integer.MAX_VALUE);
        System.out.println("Batas Byte: " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE);
        
        // 2. Contoh deklarasi variabel nya yang valid 
        byte umur = 25; 
        int jumlahPendudukWonoKiraKira = 280000000;
        
        // Untuk tipe long, tambahkan huruf 'L' di akhir angka kalo melebihi batasnya int
        long jarakKiraKira = 9876543210L; 
        
        // Untuk tipe float ini, wajib hukum nya tambahkan huruf 'f' atau 'F' di akhir angka
        float ipk_ku_sekarang = 4.00f;                 
        double koordinat = -2.2088 * 306.9456; 

        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk_ku_sekarang);
    }


    }

          
