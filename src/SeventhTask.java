import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.print("Adınızı giriniz: ");
            String ad = scanner.next();

            System.out.print("Soyadınızı giriniz: ");
            String soyad = scanner.next();

            System.out.print("1. sınav notu: ");
            double s1 = scanner.nextDouble();

            System.out.print("2. sınav notu: ");
            double s2 = scanner.nextDouble();

            System.out.print("3. sınav notu: ");
            double s3 = scanner.nextDouble();

            double ort = (s1 + s2 + s3) / 3;

            System.out.println(i + ". öğrenci: " + ad + " " + soyad);
            System.out.println("Not ortalaması: " + ort);
            System.out.println();
        }
        scanner.close();
    }
}
