package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C03_DikdortgenAlaniHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin birinci kenar uzunluğunu giriniz ");
        double kenar1 = scanner.nextDouble();

        System.out.println("Lutfen dikdortgenin ikinci kenar uzunluğunu giriniz ");
        double kenar2 = scanner.nextDouble();

        double alan = kenar1*kenar2;
        System.out.println("Dikdörtgenin alanı: " + (kenar1 * kenar2));
    }
}
