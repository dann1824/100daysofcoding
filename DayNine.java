
public class DayNine {
    

    // 1. DATA TINGKAT KORUPSI DI KONOHA 
    // Skor berskala KLO 0 - 100. Semakin rendah skor, semakin korup NYAA.
    public static final int SKOR_INDEKS_PERSEPSI_KORUPSI = 34; 
    public static final int PERINGKAT_KORUPSI_TERUS_DUNIAAA = 109;

    // 2. DATA LAPANGAN PEKERJAAN YANG KATANYA 19JT
    // Target penciptaan lapangan kerja baru
    public static final long TARGET_LAPANGAN_PEKERJAAN = 19_000_000; 

    // 3. DATA LINGKUNGAN RUSAK KARENA PEMERINTAH (Penggundulan Hutan & Perkebunan Sawit)
    public static final double LUAS_DEFORESTASI_TAHUNAN_HA = 121103.5; 
    // total luas NYA perkebunan kelapa SAWIT di Indonesia (Hektar)
    public static final double TOTAL_LAHAN_SAWIT_HA = 16800000.0; 

    public static void main(String[] args) {
        System.out.println("==DATA MIRIS DAN PARAH INDONESIA==");
        
        System.out.println("\n[Sektor Hukum & Tata Kelola]");
        System.out.println("Skor Indeks Persepsi Korupsi (IPK) : " + SKOR_INDEKS_PERSEPSI_KORUPSI + "/100");
        System.out.println("Peringkat Korupsi Global           : " + PERINGKAT_KORUPSI_TERUS_DUNIAAA);

        System.out.println("\n[Sektor Ketenagakerjaan]");
        System.out.println("Target Lapangan Kerja Baru         : " + TARGET_LAPANGAN_PEKERJAAN + " lowongan");

        System.out.println("\n[Sektor Lingkungan]");
        System.out.println("Luas Deforestasi Hutan             : " + LUAS_DEFORESTASI_TAHUNAN_HA + " Hektar");
        System.out.println("Total Luas Perkebunan Sawit        : " + TOTAL_LAHAN_SAWIT_HA + " Hektar");
        
        System.out.println("\n->->->->->->->->->->->->->->->");
        System.out.println("Catatan: Semua variabel di atas bersifat 'final' dan nilainya tidak bisa diubah.");
        
    }


    }

                           
