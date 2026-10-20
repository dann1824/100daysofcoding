import java.util.Scanner;
public class Hari48 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);                                                                                                                                                                        int angka1, angka2, hasil = 0;
char operator;
boolean ValidOperator = true;

System.out.println("program membuat kalkulator");
System.out.println("masukkan angka pertama");
angka1 = in.nextInt();

System.out.println("pilih operator (+, -, *, /) ");
operator = in.next().charAt(0);

System.out.println("masukkan angka kedua");
angka2 = in.nextInt();

switch(operator){
case '+':
    hasil = angka1 + angka2;
    break;
    case '-':
        hasil = angka1 - angka2;
        break;
        case '*':
            hasil = angka1 * angka2;
            break;
            case '/':
            if(hasil != 0 ){
hasil = angka1 / angka2;
            }else{
                System.out.println("tidak dapat di bagi 0");
                ValidOperator = false;
            }
break;
default:
    System.out.println("kesalahan operator yang dimasukkan");
break;
}
if (ValidOperator){
    System.out.println("hasil dari " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
}
}    
  }
