import java.util.Scanner;

public class KombinasyonHesaplama {

    // Faktöriyel hesaplayan fonksiyon
    public static long faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        }
        return sayi * faktoriyel(sayi - 1);
    }

    public static void main(String[] args) {
        int r;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();

        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Geçersiz giriş. n ve r sayılarını kontrol ediniz.");
        } else {
            long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }
    }
}
