package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G11_kelimeBulma {

    public static void main(String[] args) {

         /*
         Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
         Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
         Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
         Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
         Loopun içerisinde StringM methodlarından  yararlanalım!
         */

        Scanner scanner = new Scanner(System.in);
        String girilenKelime="";

        do {
            System.out.println("Lutfen en az 5 harfli bir kelime giriniz: ");
            girilenKelime= scanner.nextLine();
            if (girilenKelime.length()<5){

                System.out.println("Lutfen sizden istenen uzunlukta bir kelime girin...");
            }


        }while (girilenKelime.length()<5);

        String sonUcHarf= girilenKelime.substring(girilenKelime.length()-3);
        String yeniKelime=sonUcHarf+sonUcHarf;

        System.out.println(yeniKelime);


    }
}
