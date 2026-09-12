import java.util.Scanner;

public class DayXI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * cara menjalankan scanner itu pada terminal atau bagian running pada laptop
         * scanner itu seperti kita chatan di wa kita ngetik a di balas b
         * cara menjalankan nya yaitu dengan ketik nomor yang kita input kemudian pencet enter
         * klik ruang kosong pada bagian awal running 
         * di bagian pojok kanan nya klik di situ kemudian isi angka
         * contoh begini >>PROGRAM INPUT 9 TIPE DATA<<
         * > contoh hasil kode > masukkan data string (fhardan) >...< nah di pojok kanan ini ketik angka yang sesuai di input
         * pojok kanan itu maksudnya layar kosong atau layar hitam pas di samping kode nya
         * contoh nya di sini byte itu nomor 2 nah pada terminal ketik angka 2 (isi angka 2 pas di samping kode pertama)
         * kemudian klik enter 
         * otomatis terminal akan menjawab nya 
         * jadi setelah di running itu semua kode tidak akan langsung muncul secara bersamaan
         * akan tetapi kita yang jalankan dengan cara manual 
         * semoga dapat di mengerti 
         * sama hal nya di hp juga begitu
         */

        System.out.println("->> PROGRAM INPUT 9 TIPE DATA <<-");

        // 1. String (Teks) - Ditaruh pertama agar Scanner tidak error membaca spasi
        System.out.print("1. Masukkan data String (fhardan): ");

        String dataString = input.nextLine();

        // 2. byte (Angka bulat sangat kecil: -128 s/d 127)
        System.out.print("2. 50: ");
        byte dataByte = input.nextByte();

        // 3. short (Angka bulat kecil: -32,768 s/d 32,767)
        System.out.print("3. 30000: ");
        short dataShort = input.nextShort();

        // 4. int (Angka bulat standar)
        System.out.print("4. 18: ");
        int dataInt = input.nextInt();

        // 5. long (Angka bulat sangat besar)
        System.out.print("5. 98273103: ");
        long dataLong = input.nextLong();

        // 6. float (Angka pecahan/desimal)
        System.out.print("6. 167.7: ");
        float dataFloat = input.nextFloat();

        // 7. double (Angka pecahan presisi tinggi)
        System.out.print("7. 12.1821: ");
        double dataDouble = input.nextDouble();

        // 8. char 
        System.out.print("8. B: ");
        char dataChar = input.next().charAt(0);

        // 9. boolean 
        System.out.print("9. True: ");
        boolean dataBoolean = input.nextBoolean();


        // -=-==-=-=-=-=-=-=-= BAGIAN MENAMPILKAN HASIL -=-=-=-=--=-=-=-=-=-=
        System.out.println("\n");
        System.out.println("       HASIL INPUT SCANNER TANTANGAN          ");
        System.out.println("-=--=-=-=--=-=-=-=-=--=--=-=-=-=-=--=-=--=-=-=-=-");
        System.out.println("1. String  : " + dataString);
        System.out.println("2. byte    : " + dataByte);
        System.out.println("3. short   : " + dataShort);
        System.out.println("4. int     : " + dataInt);
        System.out.println("5. long    : " + dataLong);
        System.out.println("6. float   : " + dataFloat);
        System.out.println("7. double  : " + dataDouble);
        System.out.println("8. char    : " + dataChar);
        System.out.println("9. boolean : " + dataBoolean);

        input.close(); // Menutup scanner
    }
}
