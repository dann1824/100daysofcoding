public class updateData {
    public static void main(String[] args) {
        

//deklarasi menambahkan tipe data tanpa variabel atau nilai
int umur;
float tinggi;

//inisialisasi menambahkan nilai pada tipe
umur = 18;
tinggi = 165.5f;

System.out.println("=-=-=-=-=-NILAI AWALNYA-=-==---=-=");
System.out.println("umurku : " + umur);
System.out.println("tinggiku: " + tinggi);

//ubah nilai tipe data
umur = 25;
tinggi = tinggi + 170.5f;

System.out.println("-=-=-==---=UPDATE DATA-=-=-=-=-=-");
System.out.println("Umur\tBaru: " + umur);
System.out.println("Tinggi\tBaru: " + tinggi + "cm");
    }
}
