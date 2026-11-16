public class Hari76 {
    public static void main(String[] args) {
        String teks = " cihuyy nama saya Fardhan";
        String bersih = teks.trim();

        System.out.println("Panjang awal: " + teks.length());
        System.out.println("Panjang sdh trim: " + bersih.length());
        System.out.println("Setelah trim: " + bersih);
        System.out.println();
        System.out.println("KAPITAL: " + bersih.toUpperCase());
        System.out.println("Huruf kecil: " + bersih.toLowerCase());
        System.out.println("ADA Fardhan? " + bersih.contains("Fardhan"));
        System.out.println();
        System.out.println("equals (teks awal): " + teks.equals("cihuyy nama saya Fardhan"));
        System.out.println("equals (setelah trim): " + bersih.equals("cihuyy nama saya Fardhan"));
        System.out.println("equalsIgnoreCase: " + bersih.equalsIgnoreCase("CIHUYY NAMA SAYA FARDHAN"));
        System.out.println();
        System.out.println("Kosong? " + teks.isEmpty());
        System.out.println("Replace: " + bersih.replace("cihuyy", "halo"));
        System.out.println("Nama saja: " + bersih.substring(17));
        System.out.println("Kata pertama: " + bersih.substring(0, 6));
    }
}
