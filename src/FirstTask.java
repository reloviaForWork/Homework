import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int siparisNo;
        String yemek;
        do {
            System.out.print("Lütfen yiyeceğiniz yemeğin numarasını giriniz: ");
            siparisNo = scanner.nextInt();

            switch (siparisNo) {
                case 1:
                    yemek = "Döner";
                    break;
                case 2:
                    yemek = "İskender";
                    break;
                case 3:
                    yemek = "Beyti";
                    break;
                case 4:
                    yemek = "Pide";
                    break;
                case 5:
                    yemek = "Lahmacun";
                    break;
                default:
                    yemek = "Geçersiz sipariş numarası";
                    break;
            }
            System.out.println("Sipariş edilen yemek: " + yemek);
        } while (siparisNo < 1 || siparisNo > 5);
    }
}