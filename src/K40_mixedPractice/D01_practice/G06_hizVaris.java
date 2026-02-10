package K40_mixedPractice.D01_practice;

import java.util.Scanner;

public class G06_hizVaris {

    /*
    Soru 18-) Method Sorusu
    Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
    Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
    İpucu:
    yol=Hız*zaman
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen hizinizi km/sa cinsinden giriniz: ");
        double hiz = scanner.nextInt();
        System.out.println("Lütfen yol kilometresini(km) giriniz: ");
        double kilometre = scanner.nextInt();
        G06_hizVaris.VarisSuresiHesaplama(hiz,kilometre);


    }

    public static void VarisSuresiHesaplama (double hiz, double kilometre){

        double varisSuresi = kilometre/hiz ;

        System.out.println("Girilen hiz: "+hiz+" km/sa"+"\n"+"Girilen kilometre: "+kilometre+" km"+"\n"+"Varis suresi: "+varisSuresi+" saat");


    }
}

