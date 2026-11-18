
public class Hari78 {
    public static void main(String[] args) {
        int [] nilai = {10, 20, 30, 40, 50};
        int jumlah = 0;
        for (int i = 0; i < nilai.length; i++){
            jumlah += nilai[i];
        }
        double rata = (double) jumlah / nilai.length;
            System.out.println("jumlah: " + jumlah);
        System.out.println("rata: " + rata); 
    }
    
}
