import java.util.Scanner;

public class Tugas1 {
    public static int DeretDescendingRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n + " ");
            return DeretDescendingRekursif(n - 1);
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println(DeretDescendingRekursif(angka));
    }
}
