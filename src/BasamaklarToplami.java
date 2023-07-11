import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int gecici = sayi;
        int basamaklarinToplami = 0;

        while (gecici != 0) {
            int basamak = gecici % 10;
            basamaklarinToplami += basamak;
            gecici /= 10;
        }

        System.out.println("Basamaklar Toplamı: " + basamaklarinToplami);
    }
}
