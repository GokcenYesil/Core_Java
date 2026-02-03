package K33_maps.D04_entrySetKullanimi;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C04_EntryIleSoyisimGuncelle  extends C04_OgrenciMap {
    public static void main(String[] args) {

        // Tum ogrencilerin soyisimlerini buyuk harf yapin

        Set<Map.Entry<Integer,String >>soyIsimSet=ogrenciMap.entrySet();

        for (Map.Entry<Integer,String > eachEntry  :soyIsimSet ) {

            String eachValue=eachEntry.getValue();

            String [] eachValueArr=eachValue.split("-");

            eachValueArr[1]=eachValueArr[1].toUpperCase();

            eachEntry.setValue(String.join("-",eachValueArr));


        }
        System.out.println(ogrenciMap);
    }
}
