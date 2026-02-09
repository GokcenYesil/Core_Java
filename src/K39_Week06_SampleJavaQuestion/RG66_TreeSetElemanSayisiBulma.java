package K39_Week06_SampleJavaQuestion;

import java.util.TreeSet;

public class RG66_TreeSetElemanSayisiBulma {
    public static void main(String[] args) {
        /*66-----
    Bir TreeSet oluşturalım ve Tree Listesini ve
    listedeki eleman sayısını yazdıran java kodunu yazdıralım.

    TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

    Beklenen Çıktı:

    Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
    Tree eleman sayısı: 5
    */

        TreeSet<String> tree = new TreeSet<String>();

        tree.add("yesil");
        tree.add("sari");
        tree.add("mavi");
        tree.add("kirmizi");
        tree.add("pembe");

        System.out.println(tree); // [kirmizi, mavi, pembe, sari, yesil]
        System.out.println(tree.size()); // 5

    }
}
