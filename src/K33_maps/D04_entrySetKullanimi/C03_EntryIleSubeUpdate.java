package K33_maps.D04_entrySetKullanimi;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C03_EntryIleSubeUpdate extends C04_OgrenciMap {

    public static void main(String[] args) {
        // Entry kullanarak, 11/M sinifindaki ogrencileri
        // 11/T olarak guncelleyin
        System.out.println(ogrenciMap);

        Set<Map.Entry<Integer,String>>subeEntrySeti=ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry  :subeEntrySeti ) {

            String eachValue=eachEntry.getValue();
            String [] eachValueArr=eachValue.split("-");

            if (eachValueArr[2].equalsIgnoreCase("11")&& eachValueArr[3].equalsIgnoreCase("M"))

                eachValueArr[3]="T";

        eachEntry.setValue(String.join("-",eachValueArr));


        }
        System.out.println(ogrenciMap);

    }
}
