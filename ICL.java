import java.util.Scanner;

public class ICL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char inputChar = scanner.next().charAt(0);
        int outputInt = (int) inputChar;
        System.out.println(outputInt);
        scanner.close();
    }
}
