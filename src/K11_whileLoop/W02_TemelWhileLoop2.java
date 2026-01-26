package K11_whileLoop;

import java.util.Scanner;

public class W02_TemelWhileLoop2 {
    public static void main(String[] args) {
        // kullaniciya istedigi kadar pozitif sayi girmesini soyleyin
        // girilen sayilar pozitif ise sayiyi toplama ekleyin
        // girilen sayi negatif ise uyari verin ve sayiyi isleme almayin
        // girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);
        int sayi=1;
        int toplam =0;
        int sayac=0;


        while (sayi!=0){

            System.out.println("Lutfen toplanmak üzere pozitif bir tamsayı giriniz." +
                    "\nBitirmek için 0'a basınız");

            sayi= scanner.nextInt();

            if (sayi>0){
                toplam+=sayi;
                sayac++;

            }else if (sayi<0){
                System.out.println("Lütfen pozitif bir tamsayi girin...");
            }else {

                System.out.println("İşlem sonlandırıldı");
            }



        }
        System.out.println("Girilen " + sayac + " adet sayının toplamı: " + toplam);

    }
}
