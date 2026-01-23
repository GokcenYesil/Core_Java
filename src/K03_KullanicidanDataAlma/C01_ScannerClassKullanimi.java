package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen ondalıklı bir sayı giriniz: ");
        double sayi = scanner.nextDouble();
        System.out.print("Lutfen bir tamsayi giriniz: ");
        int sayi1= scanner.nextInt();

        System.out.println("Sayıların toplamı: " + (sayi1 + sayi));
        System.out.println("Sayıların çarpımı: " + sayi * sayi1);

    }
}
