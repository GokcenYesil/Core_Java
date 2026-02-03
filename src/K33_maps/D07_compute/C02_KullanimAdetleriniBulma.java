package K33_maps.D07_compute;

import java.util.Map;
import java.util.TreeMap;

public class C02_KullanimAdetleriniBulma {
    public static void main(String[] args) {
        // Verilen String bir array'de
        // her bir elementi ve kacar defa kullanildigini yazdirin

        String[] harfler = { "a", "b","d","a","r","a","b","d","d","a", "a" ,"t"};


        Map<String ,Integer>harfKullanimSayisi= new TreeMap<>();

        for (String eachKey  : harfler) {

           harfKullanimSayisi.computeIfPresent(eachKey,(k,v)->v+1);
           harfKullanimSayisi.putIfAbsent(eachKey,1);

        }
        System.out.println(harfKullanimSayisi);

    }
}
