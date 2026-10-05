public class Hari34 {
    public static void main(String[] args) {
        
       System.out.println("== PERCABANGAN IF ELSE =="); 
        System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
        int nilai = 80;
        String grade;

        //jika sudah ada salah satu yang benar maka yang lainnya di abaikan
        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Nilai Beliauw: " + nilai);
        System.out.println("Grade Beliauw: " + grade);
       System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈"); 
    }
    }
