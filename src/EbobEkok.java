import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ilk sayıyı alın
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        // Kullanıcıdan ikinci sayıyı alın
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        // EBOB ve EKOK değerlerini tutacak değişkenleri tanımlayın ve ilk değerlerini atayın
        int ebob = 1;
        int ekok = (sayi1 * sayi2) / ebob;

        // İki sayı arasında en küçüğünü bulun
        int min = Math.min(sayi1, sayi2);

        // EBOB hesaplaması için döngüyü başlatın
        int i = 1;
        while (i <= min) {
            // i, hem sayı1 hem de sayi2'ye tam bölünüyorsa, i yeni EBOB değeridir
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK hesaplaması
        ekok = (sayi1 * sayi2) / ebob;

        // Sonuçları ekrana yazdırın
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
