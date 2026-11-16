public class Hari75 {
    public static void main(String[] args) {
        System.out.println("Belajar java");
        System.out.println("substring,replace dan trim");
        System.out.println();
        String s = "  Belajar Java  ";

        String a = s.trim();              
        String b = a.replace("Java", "Python"); 
        String c = b.substring(0, 7);      

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
