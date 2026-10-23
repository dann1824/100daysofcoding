import java.util.Scanner;
public class Hari52{
 public static void main(String [] args){   
Scanner f = new Scanner (System.in);
System.out.println("masukkan angka bebas");
     System.out.println("jangan kaget jika unlimited");
     Long i = f.nextLong();
while (i <= 100) {
    System.out.println("Ini akan berjalan selamanya: " + i);
}
 }
}

/** public static void main(String[] args) {
        int i = 1; // isikan variavel nya

        while (i <= 5) { // Kondisi perulangan
            System.out.println("Angka ke-" + i);
            i++; // Increment (penambahan nilai agar tidak terjadi infinite loop)
        }
    }
}
*/
