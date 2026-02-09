package K39_Week06_SampleJavaQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RG62_HashSetiTreeSeteCeviripYazdirma {
    public static void main(String[] args) {
        /*62-----
    Bir HashSet oluşturalım ve
    HashSet elemanlarını TreeSet e dönüştürelim.
    Tree Set elemanlarını tektek yazdıralım.

    HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

    Beklenen Çıktı:
    Tree Set Elemanlari:
    kirmizi
    mavi
    sari
    turuncu
    yesil
    */

        HashSet<String> hs = new HashSet<>(Arrays.asList("kirmizi", "mavi", "sari", "turuncu", "yesil"));

        TreeSet<String> ts = new TreeSet(hs);

        System.out.println("Tree Set Elemanlari:");
        for (String each : ts) {
            System.out.println(each);
        }

    }
}
