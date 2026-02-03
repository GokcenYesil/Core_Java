package K33_maps.D04_entrySetKullanimi;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C02_EntrydenSinifUpdate extends C04_OgrenciMap {
    public static void main(String[] args) {

        // 11.siniftaki ogrencileri 12.sinif yapin


        Set<Map.Entry<Integer,String >>updatedEntrySet=ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry  :updatedEntrySet ) {

           String eachValue= eachEntry.getValue();

           String [] eachValueArr=eachValue.split("-");

           if (eachValueArr[2].equalsIgnoreCase("11")){

               eachValueArr[2]="12";
            eachEntry.setValue(String.join("-",eachValueArr));


           }

        }System.out.println(ogrenciMap);

    }
}
