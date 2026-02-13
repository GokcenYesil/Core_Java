package K40_mixedPractice.D04_practice04.methods;

import java.util.Scanner;

public class C02_KendiSubstringMethodumuz {

    public static void main(String[] args) {
        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

    }


    public static void selfSubstring () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin girin: ");
        String metin= scanner.nextLine();
        System.out.println("Lutfen başlangıç indeksini girin: ");
        int baslangic= scanner.nextInt();
        System.out.println("Lutfen bitiş indeksini girin: ");
        int bitis= scanner.nextInt();






        if (baslangic<0 ||bitis<0||baslangic>metin.length()||bitis>metin.length()){
            System.out.println("Hatalı indeks girişi...");
           return;

        } else if (baslangic>bitis) {
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");
            return;

        }

        System.out.print("İstenen metin parçası: "+metin.substring(baslangic,bitis));
        scanner.close();
    }



}
