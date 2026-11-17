import java.util.Scanner;

public class Hari77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("username: ");
        String UsnAsli = in.nextLine();
        System.out.print("Buat password: ");
        String PwAsli = in.nextLine();
        for (;;) {                                 
            System.out.print("Login username: ");
            String user = in.nextLine();
            System.out.print("Login password: ");
            String pass = in.nextLine();

            if (user.equals(UsnAsli) && pass.equals(PwAsli)) {
                System.out.println("Login berhasil!");
                break;                             
            } else {
                System.out.println("Salah, coba lagi.");
            }
        }
    }
}
