package K09_ifElseStatement;

import java.util.Scanner;

public class C13_IndirimliUrun {
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




    }


    }

