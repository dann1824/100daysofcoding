public class Hari87 {
    public static void main(String[] args) {
        System.out.println("10, 20, 30, 40, 50");
        int[] angka = {10, 20, 30, 40, 50};
        for (int i = 0; i < angka.length; i++) {
            angka[i] = angka[i] * 2;
        }
        angka[2] = 199;
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
    }
}
