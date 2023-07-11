import java.util.Scanner;

public class FaktoriyelHesaplama{
    // Faktoriyel hesaplama metodu
    public static int faktoriyel(int sayi) {
        if (sayi <= 1) {
            return 1;
        }
        return sayi * faktoriyel(sayi - 1);
    }

    // Kombinasyon hesaplama metodu
    public static int kombinasyon(int n, int r) {
        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        return kombinasyon;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        int sonuc = kombinasyon(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + sonuc);
    }
}
