import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç ürün satmak istiyorsunuz? ");

        int urunMiktari = scanner.nextInt();
        double toplamTutar = 0;

        for (int i = 1; i <= urunMiktari; i++) {
            System.out.print(i + ". ürünün fiyatını giriniz: ");
            double urunFiyati = scanner.nextDouble();
            toplamTutar += urunFiyati;
        }

        System.out.print("Toplam alışveriş tutarı: " + toplamTutar);
    }
}