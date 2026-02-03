package K33_maps.D07_compute;

import java.util.HashMap;
import java.util.Map;

public class C01_ComputeMetodlari {
    public static void main(String[] args) {
        Map<String ,Integer> harfler = new HashMap<>();

        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        System.out.println(harfler);

        // map'deki B'nin degerini 5 artirin

        int eskiDeger=harfler.get("B");

        harfler.replace("B",eskiDeger+5);
        System.out.println(harfler);

        // Map'de key olarak S varsa
        // degerini 2 katina cikarin

        if (harfler.containsKey("S")){

            int oldKey=harfler.get("S");

            harfler.put("S",oldKey*2);

            System.out.println(harfler);
        }

        // Map'de key olarak R varsa
        // degerini 2 katina cikarin

        if (harfler.containsKey("R")){

            eskiDeger=harfler.get("R");

            harfler.replace("R",eskiDeger*2);

            System.out.println(harfler);
        }

        // Eger K harfi varsa,
        // degerini 5 azaltin,

      harfler.computeIfPresent("K",(k,v)-> v-5);
        System.out.println(harfler);

        // A 'nin degerini,
        // eski degerinin 2 katinin 3 fazlasi yapin

        harfler.computeIfPresent("A",(k,v)-> v*2+3);
        System.out.println(harfler);


        // Eger S harfi yoksa
        // degeri 25 olarak map'e ekleyin

        /*I. yol

        harfler.putIfAbsent("S",25);
        System.out.println(harfler);

           */
        // II.yol

        harfler.computeIfAbsent("S",v->25);

        System.out.println(harfler);


        // Eger T harfi yoksa
        // degeri 40 olarak map'e ekleyin

        harfler.computeIfAbsent("T",v->40);
        System.out.println(harfler);


        // Eger Y harfi yoksa
        // degeri 44 olarak map'e ekleyin

        harfler.computeIfAbsent("Y",v->44);

        System.out.println(harfler);




    }

}
