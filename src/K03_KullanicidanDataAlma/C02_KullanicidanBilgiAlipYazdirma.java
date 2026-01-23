package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");

        String isim = scanner.nextLine();
        System.out.print("Lutfen soy isminizi giriniz: ");

        String soyisim = scanner.nextLine();
        System.out.print("Lutfen yaşınızı giriniz: ");

        double yas = scanner.nextDouble();
        System.out.println("İsminiz : " + (isim));

        System.out.println("Soyisminiz : " + (soyisim));

        System.out.println("Yaşınız: " + (yas));
        System.out.println("Kaydınız başarıyla tamamlanmıştır.");


    }
}
