package K12_metodOlusturma;

public class P04_sifreKontrol {

    public static void main(String[] args) {

        //Soru 4 : verilen sifre icin
        //         asagidaki sartlari kontrol edip
        //         kullaniciya duzeltmesi gereken tum eksikleri yazdiran,
        //         tum sartlari kontrol ettikten sonra
        //         sifrede hata yoksa true, hata varsa false donduren
        //         bir method olusturun
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali


        System.out.println(sifreGecerliMi("akjdjj12345a5"));


    }//main bitişi





    public static boolean sifreGecerliMi(String sifre){

        int sayac=0;
        char ilkHarf = sifre.charAt(0);
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(ilkHarf>='a' && ilkHarf<='z')){

            System.out.println("ilk harf küçük olmalı");
            sayac++;
        }

        if (!(Character.isDigit(sonKarakter))){
            System.out.println("Son karakter rakam olmalı");
            sayac++;
        }
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            sayac++;
        }
        if (sifre.length()<10){

            System.out.println("Şifre en az 10 karakter olmalı");
            sayac++;
        }


       return sayac==0;



    }
}
