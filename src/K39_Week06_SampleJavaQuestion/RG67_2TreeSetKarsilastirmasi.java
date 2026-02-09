package K39_Week06_SampleJavaQuestion;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class RG67_2TreeSetKarsilastirmasi {
    public static void main(String[] args) {
        /*67-----
    Ortak elemanları olan 2 farklı TreeSet oluşturalım ve
    elemanlarını tektek karşılaştırıp aynı olanlar için "yes"
    farklı olanlar için "no" yazdıralım.

    1. TreeSet: mavi,yesil,kirmizi,sari
    2. TreeSet: yesil,mavi,pembe,turuncu

    Beklenen Çıktı:
    1. TreeSet: [kirmizi,mavi,sari,yesil]
    2. TreeSet: [mavi,pembe,turuncu,yesil

    Karsilastirma Sonucu:

    no
    yes
    no
    yes
    */

        TreeSet<String> ts1 = new TreeSet<>(Arrays.asList("mavi", "yesil", "kirmizi", "sari"));
        TreeSet<String> ts2 = new TreeSet<>(Arrays.asList("yesil", "mavi", "beyaz", "turuncu"));
        // System.out.println(ts1);
        //.out.println(ts2);
        Iterator x = ts1.iterator();
        Iterator y = ts2.iterator();

        System.out.println("Karsilastirma Sonucu: ");

        while (x.hasNext() && y.hasNext()) {
            System.out.println(x.next().equals(y.next()) ? "yes" : "no");
        }

    }
}
