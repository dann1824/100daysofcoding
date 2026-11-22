import java.util.Scanner;
public class Hari82Icl{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai n: ");
        int a = in.nextInt();
        System.out.println();
        for (int i = 1; i <=a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        System.out.println();
    }
    }
}
