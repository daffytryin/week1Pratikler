import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz (tek sayı): ");
        int n = scanner.nextInt();

        int yildizSayisi = 1;
        int boslukSayisi = n / 2;

        // Elmasın üst kısmı
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= yildizSayisi; k++) {
                System.out.print("*");
            }

            System.out.println();
            yildizSayisi += 2;
            boslukSayisi--;
        }

        // Elmasın alt kısmı
        yildizSayisi = n - 2;
        boslukSayisi = 1;

        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= yildizSayisi; k++) {
                System.out.print("*");
            }

            System.out.println();
            yildizSayisi -= 2;
            boslukSayisi++;
        }
    }
}
