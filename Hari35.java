public class Hari35 {
    public static void main(String[] args) {
        int umur = 20;
        boolean punyaTiket = true;

        // Pengecekan kondisi luar
        if (umur >= 18) {
            System.out.println("Usia kamu sudah mencukupi.");
            
            // Pengecekan kondisi dalam (nested if)
            if (punyaTiket) {
                System.out.println("Silakan masuk ke dunia kejam yang sebenarnya");
            } else {
                System.out.println("cukup umur, tapi belum punya tiket.");
            }
            
        } else {
            System.out.println("Maaf ya, usia kamu belum cukup untuk masuk.");
        }
    }
}
