package K11_whileLoop;

import java.util.Scanner;

public class W06_WhileRakamlarToplami {


    public static void main(String[] args) {
        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);

        int sayi=1;
        int toplam=0;
        int sayac=0;

        while (sayi!=0){

            System.out.println("Lutfen pozitif bir tamsayi girin: "+
                    "\nBitirmek için 0'a basın...");

            sayi= scanner.nextInt();
            if (sayi<0){

                System.out.println("negatif sayi kullanamazsiniz");
            }else if (sayi>0){

                toplam+=sayi;
                sayac++;

            }else {
                System.out.println("İşlem sonlandırıldı...");
            }



        }
        System.out.println("Girilen " + sayac + " adet pozitif sayının toplamı: " + toplam);


    }
}
