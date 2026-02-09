package K39_Week06_SampleJavaQuestion;

import java.util.TreeSet;

public class RG65_TreeSetinIlkveSonElemanlainiYazdirma {
    public static void main(String[] args) {
        /*65-----
    Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

    TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

    Beklenen Çıktı:
    Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
    ilk elemen: kirmizi
    son eleman: yesil
    */

        TreeSet<String> tree = new TreeSet<String>();


        tree.add("sari");
        tree.add("mavi");
        tree.add("yesil");
        tree.add("kirmizi");
        tree.add("turuncu");
        tree.add("pembe");

        System.out.println(tree);

        System.out.println("Ilk Eleman : " + tree.first());
        System.out.println("Son Eleman : " + tree.last());




    }
}
