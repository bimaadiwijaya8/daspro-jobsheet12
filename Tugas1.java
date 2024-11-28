import java.util.Scanner;

public class Tugas1 {
    public static void DeretDescendingRekursif(int n) {
        if (n == 0) {
            return;
        }
        DeretDescendingIteratif(n - 1);
    }

    public static void DeretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        DeretDescendingRekursif(angka);
    }
}
