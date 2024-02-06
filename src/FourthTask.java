import java.util.Random;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(10) + 1;
        int tahminEdilenSayi;

        System.out.println("1 ile 10 arasında bir sayı tahmin edin.");
        do {
            System.out.print("Tahmininizi giriniz: ");
            tahminEdilenSayi = scanner.nextInt();

            if (tahminEdilenSayi == rastgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
            } else {
                System.out.println("Yanlış tahmin ettiniz. Tekrar deneyin.");
            }
        } while ( tahminEdilenSayi != rastgeleSayi );
    }
}
