package K40_mixedPractice.D01_practice;

import java.util.Scanner;

public class G05_indirimliFiyat {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ürün adedini giriniz:");
        int adet = scanner.nextInt();
        System.out.println("Lutfen ürün fiyatını giriniz:");
        double fiyat = scanner.nextDouble();
        System.out.println("Club kartınız var mı?:      Evet : E     Hayır: H");
        String kart= scanner.next();
        double indirimsizFiyat= adet*fiyat;

        //ürün adedi 0 dan büyük mü kontrol et

        if (adet<=0){
            System.out.println("Ürün adedi yanlış girildi...");
            //cevap olarak tek karakter mi girilmiş kontrol et

        }else{
            if (kart.length()>1){
                System.out.println("Lutfen sadece E veya H girin...");

            }else {
                //kart Eveti kontrol et
                if (kart.equalsIgnoreCase("E")){
                    if (adet>=10){
                        System.out.println("Tutar:" + indirimsizFiyat * 80 / 100);
                    }else {
                        System.out.println("Tutar:" + indirimsizFiyat * 85 / 100);
                    }
                } else if (kart.equalsIgnoreCase("H")) {
                    if (adet>=10){
                        System.out.println("Tutar:" + indirimsizFiyat * 85 / 100);
                    }else {
                        System.out.println("Tutar:" + indirimsizFiyat * 90 / 100);
                    }

                }else {
                    System.out.println("Kartınızın olup olmadığını istenen şekilde giriniz....,");
                }

            }
        }

    }
}