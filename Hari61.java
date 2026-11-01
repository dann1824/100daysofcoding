import java.util.Scanner;

public class Hari61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        long n = in.nextLong();
        long total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
    System.out.print(i);
    if (i < n) {
        System.out.print(" * ");
    }
}
System.out.println(" = " + total);
    }
}
