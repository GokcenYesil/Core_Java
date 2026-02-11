package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G09_isimDuzenlemeMetodu {

    public static void main(String[] args) {
         /*
    Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
  isim bosluk soyisim seklinde bize donduren bir method olusturun
 input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim= scanner.next();
        System.out.println("Lutfen soyisminizi giriniz:");
        String soyisim = scanner.next();
        String duzenlenmisIsim= isimDuzenleme(isim,soyisim);

        System.out.println(duzenlenmisIsim);

    }

    public static String isimDuzenleme(String isim,String soyisim){

        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return (isim+" "+soyisim);






    }




}
