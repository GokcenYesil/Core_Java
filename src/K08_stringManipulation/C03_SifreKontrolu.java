package K08_stringManipulation;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sifre olusturun: ");
        String sifre = scanner.nextLine();

        char ilkHarf = sifre.charAt(0);
        int sayac = 0;
        if (!(ilkHarf >= 97 && ilkHarf <= 122)) {
            System.out.println("İlk harf küçük olmalı");
            sayac++;
        }
        char sonKarakter = sifre.charAt(sifre.length() - 1);
        if (!Character.isDigit(sonKarakter)) {
            System.out.println("Son karakter rakam olmalı");
            sayac++;
        }

        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemeli");
            sayac++;
        }
        if (sifre.length() < 10) {
            System.out.println("Şifre en az 10 karakter olmalı");
            sayac++;
        }
        if (sayac==0){
            System.out.println("Şifreniz başarıyla oluşturuldu");
        }


    }
}
