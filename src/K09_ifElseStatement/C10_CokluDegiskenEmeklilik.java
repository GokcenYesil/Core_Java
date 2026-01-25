package K09_ifElseStatement;

import java.util.Scanner;

public class C10_CokluDegiskenEmeklilik {
    public static void main(String[] args) {


        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // kullanici E ve K disinda bir cinsiyet girerse
        // veya 15 yasdan kucuk, 80 yasdan buyuk yas girerse uyarin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyet giriniz: Erkek : E    Kadın : K");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi girin : ");
        double yas = scanner.nextDouble();


        if (yas<15 || yas > 80 ||  !(cinsiyet=='E' || cinsiyet == 'K')){
            System.out.println("Girilen degerler hesaplamaya uygun degil.Sizden istenen bilgileri konrtol edin...");

        }else if (cinsiyet== 'K' && yas >=60){
            System.out.println("Emekli olabilirsiniz");

        } else if (cinsiyet== 'K' && yas <60) {
            System.out.println("Emekli olmanız icin "+(60-yas)+ " yıl daha calismalisiniz");


        } else if (cinsiyet== 'E'&& yas >=65) {
            System.out.println("Emekli olabilirsiniz ");

        } else if (cinsiyet== 'E'&& yas <65) {
            System.out.println("Emekli olmanız icin "+(65-yas)+ " yıl daha calismalisiniz");

        }


    }
}
