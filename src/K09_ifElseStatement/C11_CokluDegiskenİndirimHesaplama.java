package K09_ifElseStatement;

import java.util.Scanner;

public class C11_CokluDegiskenİndirimHesaplama {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedi giriniz: ");
        int adet = scanner.nextInt();

        System.out.println("Urunun fiyatini girin : ");
        double fiyat = scanner.nextDouble();

        double indirimsizFiyat = fiyat*adet;

        System.out.println("Musteri kartiniz var mi :  Evet : E Hayır : H ");
        char kart = scanner.next().toUpperCase().charAt(0);

        if (kart == 'E' && adet >=10){
            System.out.println("Odenecek miktar "+(indirimsizFiyat*80/100));
        } else if (kart== 'E' && adet<10) {
            System.out.println("Odenecek miktar "+(indirimsizFiyat*85/100));

        } else if (kart == 'H'&& adet>=10) {
            System.out.println("Odenecek miktar "+(indirimsizFiyat*85/100));

        } else if (kart == 'H'&& adet<10) {
            System.out.println("Odenecek miktar "+(indirimsizFiyat*90/100));

        }


    }
}
