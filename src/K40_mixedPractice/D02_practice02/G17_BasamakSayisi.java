package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G17_BasamakSayisi {

    public static void main(String[] args) {

        /*
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
    Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

    Örnek:
    İki tamsayı girin:
    25  veya  4567986321453
    46   veya 123456
    Konsolda Çıktı :
    Sayıların toplamı: 71  veya  Fazla Yüklenme


         */


        Scanner scanner = new Scanner(System.in);

       System.out.println("Lutfen toplanmak üzere birinci tamsayiyi girin: ");
       long sayi1= scanner.nextLong();

       System.out.println("Lutfen toplanmak üzere ikinci tamsayiyi girin: ");
       long sayi2= scanner.nextLong();



       long toplam =sayi1+sayi2;

       String num1= String.valueOf(sayi1);
       String num2= String.valueOf(sayi2);
       String sum= String.valueOf(toplam);

       if (num1.length()>10 || num2.length()>10 || sum.length()>10){

           System.out.println("Fazla yüklenme...");

       }else {

           System.out.println("Girilen iki sayının toplamı: "+toplam);
       }








    }
}
