package K33_maps.D03_bilgiUpdate;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Set;

public class C04_SubeUpdate extends C04_OgrenciMap {
    public static void main(String[] args) {
        // 10/K sinifindaki ogrencilerin subelerini Z yapin

        Integer sinif = 10;
        String eskiSube = "K";
        String yeniSube = "Z";


        Set<Integer> ogrenciKeySeti= ogrenciMap.keySet();

        for (Integer eachKey  :ogrenciKeySeti ) {

            String eachValue =ogrenciMap.get(eachKey);

            String [] eachValueArr= eachValue.split("-");

            if (eachValueArr [2].equalsIgnoreCase(sinif+"")
                    && eachValueArr [3].equalsIgnoreCase(eskiSube)){

                eachValueArr [3]=yeniSube;


                String yeniValue= String.join("-",eachValueArr);

                ogrenciMap.put(eachKey,yeniValue);
            }


        }
        System.out.println(ogrenciMap);
    }
}
