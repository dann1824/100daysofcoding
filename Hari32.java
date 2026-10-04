public class Hari32 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean x = true, y = false;

        System.out.println("+== GABUNGAN OPERATOR ==+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+ ");
        System.out.println();
        // Increment & Decrement
        System.out.println("a++ = " + a++ + ", ++a = " + ++a);
        System.out.println("b-- = " + b-- + ", --b = " + --b);

        // Relasional & Logika
        System.out.println("a > b && x : " + (a > b && x)); // AND
        System.out.println("a < b || y : " + (a < b || y)); // OR
        System.out.println("!x : " + !x); // NOT

        // Gabungan semua
        boolean lulus = (a >= 10 && b <= 5) || !y;
        System.out.println("Lulus? " + lulus);
        System.out.println();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+ ");
    }
          }
