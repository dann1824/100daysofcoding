public class Hari31 {
    public static void main(String[] args) {
        
        System.out.println("===×===×===×===×===×===×===×===×===×===×");
        System.out.println("+!+!+!+ LOGIKA JAVA +!+!+!+");
        System.out.println();
        // 1. AND (&&)  Harus dua-duanya BENAR
        boolean punyaLaptop = true;
        boolean punyaInternet = false;
        
        boolean bisaIkutKelas = punyaLaptop && punyaInternet;
        System.out.println("Bisa ikut ngoding : " + bisaIkutKelas); // Hasil: false

        // 2. OR (||) Salah satu BENAR sudah cukup
        boolean belumHujan = true;
        boolean sangatPanas = false;
        
        boolean kondisi = belumHujan || sangatPanas;
        System.out.println("Kondisi: " + kondisi); // Hasil: true

        // 3. NOT (!) -> Kebalikan nilai
        boolean hariHujan = true;
        
        boolean hariCerah = !hariHujan;
        System.out.println("Hari cerah: " + hariCerah); // Hasil: false
        System.out.println();
       System.out.println("===×===×===×===×===×===×===×===×===×===×"); 
    }
          }
