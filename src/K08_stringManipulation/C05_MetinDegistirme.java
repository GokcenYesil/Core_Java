package K08_stringManipulation;

import java.util.Scanner;

public class C05_MetinDegistirme {
    public static void main(String[] args) {
        //  Kullanicidan bir String alin,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin girin: ");
        String metin = scanner.nextLine();
        int uzunluk = metin.length();

        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,

       if (uzunluk%2==0){
           System.out.println(
                   metin.substring(0,uzunluk/2)+
                   ":)"+
                   metin.substring(uzunluk/2)
           );
           //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
       }else {

           System.out.println(
                   metin.substring(0,uzunluk/2)+
                   ":("+
                   metin.substring(uzunluk/2+1)



           );
       }
    }
}
