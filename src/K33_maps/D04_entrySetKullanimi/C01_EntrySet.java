package K33_maps.D04_entrySetKullanimi;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet extends C04_OgrenciMap {
    public static void main(String[] args) {


        // Entry Set'i kullanarak tum ogrencilerin numara, isim ve soyisimlerini yazdirin

        // 1.adim EntrySet olustur

        Set<Map.Entry<Integer,String>>ogrenciEntrySeti=ogrenciMap.entrySet();

        System.out.println("Öğrenci Entry Seti: "+ogrenciEntrySeti);


        // 2.adim bir for-each loop ile tum Entry'leri gozden gecirelim

        for (Map.Entry<Integer,String> eachEntry  :ogrenciEntrySeti) {


            //3.adim  ogrenci value'sunu kaydedelim
            String eachValue= eachEntry.getValue();

            //4.adim value'deki bilgilere erisebilmek icin split edelim
            String[] eachValueArr=eachValue.split("-");
            //5.adim istenen kontrolleri yapip, istenen bilgileri yazdirin
            System.out.println(

            eachEntry.getKey()+" "+
            eachValueArr[0]+" "+
            eachValueArr[1]


            );

        }


    }
}
