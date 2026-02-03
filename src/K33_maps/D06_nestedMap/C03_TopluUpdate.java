package K33_maps.D06_nestedMap;

import java.util.Set;

public class C03_TopluUpdate extends NestedOgrenciMap {

    public static void main(String[] args) {
        // tum ogrencilerin soyisimlerini buyuk harf yapin

        Set<Integer> ogrenciNoSet= ogrenciNestedMap.keySet();


        for (Integer eachNo  :ogrenciNoSet ) {

            String eskiSoyisim=(String) ogrenciNestedMap.get(eachNo).get("soyisim");
            ogrenciNestedMap.get(eachNo).replace("soyisim",eskiSoyisim.toUpperCase());

        } System.out.println(ogrenciNestedMap);

    }
}
