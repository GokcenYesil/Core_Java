package K33_maps.D02_temelMetodlar;

import java.util.Arrays;

public class C02_ValuedanBilgiyeUlasma {
    public static void main(String[] args) {

        // bir ogrencinin bilgileri tek bir String halinde
        // asagida verilen formatla tutulmaktadir
        // ogrenci bilgisi verildiginde soyismi yazdirin

        String ogrenciBilgisi = "Ali-Can-10-H-MF";


      String [] valueArr = ogrenciBilgisi.split("-");

        System.out.println(Arrays.toString(valueArr));


        // ogrenci bilgisi verildiginde sinifi yazdirin

        System.out.println("Sınıf: "+valueArr[2]);

        // ogrenci bilgisi verildiginde Bolumu yazdirin

        System.out.println("Bölüm: "+valueArr [4]);

        // ogrencinin isim ve soyismini yazdirin

        System.out.println("İsim Soyisim: " + valueArr[0]+" " + valueArr[1]);


    }
}
