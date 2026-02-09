package K39_Week06_SampleJavaQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RG61_HashSetleTreeSetiListeleyipYazdirma {
    public static void main(String[] args) {

    /*61-----
    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım
    ve listeyi yazdıralım.


    HashSet List: sari,mavi,kirmizi,yesil,mor

    Beklenen Çıktı:
    TreeSet elements:
    kirmizi
    mavi
    mor
    sari
    yesil
    */


        HashSet<String> hs =new HashSet<>(Arrays.asList("sari","mavi","kirmizi","yesil","mor"));
        TreeSet<String> ts= new TreeSet(hs);
        System.out.println("TreeSet elements: "+ts);


    }
}
