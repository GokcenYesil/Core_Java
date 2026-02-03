package K33_maps.D06_nestedMap;

import java.util.Set;

public class C04_BolumDegistirme extends NestedOgrenciMap {
    public static void main(String[] args) {
        String eskiBolum = "MF";
        String yeniBolum = "Say";

        // ogrenci nested map'de bolumu eskiBolum olan ogrencilerin bolumlerini
        // yeniBolum olarak update edin


        Set<Integer> ogrenciNoKeySet=ogrenciNestedMap.keySet();

        for (Integer eachKey  :ogrenciNoKeySet ) {
            String ogrEskiBolum=(String) ogrenciNestedMap.get(eachKey).get("bolum");

            if (ogrEskiBolum.equalsIgnoreCase(eskiBolum)){

                ogrenciNestedMap.get(eachKey).put("bolum",yeniBolum);
            }

        }

        System.out.println(ogrenciNestedMap);


    }
}
