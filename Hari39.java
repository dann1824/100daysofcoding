import java.util.Scanner;

public class Hari39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("angka yg mau di coba operasikan: ");
        int a = input.nextInt();

        System.out.println("Operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("hasilnya yaitu: ");
        int b = input.nextInt();

        
        if (op == '+') System.out.println("Hasil: " + (a + b));
        else if (op == '-') System.out.println("Hasil: " + (a - b));
        else if (op == '*') System.out.println("Hasil: " + (a * b));
        else if (op == '/') System.out.println("Hasil: " + (a / b));
        else System.out.println("Operator salah BOSS!");

        input.close();
    }
}
