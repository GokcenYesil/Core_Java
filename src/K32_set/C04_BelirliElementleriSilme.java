package K32_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C04_BelirliElementleriSilme {
    public static void main(String[] args) {
        // Verilen String bir Set'deki
        // istenmeyen harf iceren elementleri silin


        Set<String> isimler = new HashSet<>();
        isimler.add("Kerem");
        isimler.add("Murat");
        isimler.add("Furkan");
        isimler.add("Kerem");
        isimler.add("Kerem");
        isimler.add("Sabri");
        isimler.add("Ridvan");
        String istenmeyenHarf = "e";

        System.out.println("Orijinal set: "+isimler);
        System.out.println();

        Iterator<String> iterator= isimler.iterator();

        while (iterator.hasNext()){

            if (iterator.next().contains(istenmeyenHarf)){

                iterator.remove();
            }
        }

        System.out.println("İstenmeyen harfin olmadığı yeni set: "+isimler);
    }

}





