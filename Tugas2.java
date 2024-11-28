import java.util.Scanner;

public class Tugas2 {
    public static int PenjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + PenjumlahanRekursif(n - 1);
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println(PenjumlahanRekursif(angka));
    }
}
