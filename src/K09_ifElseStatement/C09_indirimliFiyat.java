package K09_ifElseStatement;

import java.util.Scanner;

public class C09_indirimliFiyat {
    public static void main(String[] args) {

        // Kullaniciya kac adet urun aldigini ve bir urunun fiyatini sorun
        // eger kullanici 100 adet veya daha fazla aldiysa %25,
        // eger 50 adet veya daha fazla aldiysa %20
        // eger 10 adet veya daha fazla aldiysa %10 indirim yaparak
        // odeyecegi toplam miktari yazdirin
        // Kullanici negatif bir fiyat veya adet girerse uyari verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedi girin: ");
        int adet = scanner.nextInt();
        System.out.println("Lutfen urun fiyati girin: ");
        double fiyat = scanner.nextDouble();

        double indirimsizFiyat = adet*fiyat;

        if (adet<=0 || fiyat<= 0){
            System.out.println("Lutfen pozitif bir sayi girin...");
        } else if (adet >=100) {
            System.out.println("Odenecek miktar: "+indirimsizFiyat*75/100);

        } else if (adet>=50) {
            System.out.println("Odenecek miktar: "+indirimsizFiyat*80/100);

        } else if (adet>=10) {
            System.out.println("Odenecek miktar: "+indirimsizFiyat*90/100);

        }else System.out.println("Ne yazık ki indiriminiz yok.Odenecek miktar: "+indirimsizFiyat);


    }
}
