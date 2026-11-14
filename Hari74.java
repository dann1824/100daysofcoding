public class Hari74 {
    public static void main(String[] args) {
        System.out.println(" tesk 1: Belajar Java");
        System.out.println("teks 2: belajar java");
        System.out.println(" ");
        String teks1 = "Belajar Java";
        String teks2 = "belajar java";
        String teksKosong = "";
        System.out.println("1. equals: " + teks1.equals(teks2));
        
        System.out.println("2. equalsIgnoreCase: " + teks1.equalsIgnoreCase(teks2));
        
        System.out.println("3. contains 'Java': " + teks1.contains("Java"));
        
        System.out.println("4. isEmpty (teksKosong): " + teksKosong.isEmpty()); 
        
        System.out.println("   isEmpty (teks1): " + teks1.isEmpty()); 
    }
}
