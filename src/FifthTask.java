import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için 0'a basın): ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }
            if (isPerfectNumber(sayi)) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }
        } while (true);
        scanner.close();
    }
    public static boolean isPerfectNumber(int sayi) {
        if (sayi < 1) {
            return false;
        }

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }
}