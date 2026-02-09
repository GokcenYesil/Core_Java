package K39_Week06_SampleJavaQuestion;

import java.util.TreeSet;

public class RG63_TreeSetElemanlariniTekTekYazdirma {
    public static void main(String[] args) {



    /*63-----
    Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

    TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

    Beklenen Çıktı:
    beyaz
    kirmizi
    mavi
    sari
    siyah
    yesil
    */

        TreeSet<String> ts = new TreeSet();

        ts.add("beyaz");
        ts.add("kirmizi");
        ts.add("mavi");
        ts.add("sari");
        ts.add("siyah");
        ts.add("yesil");

        for (String w : ts) {
            System.out.println(w);
        }


    }


}