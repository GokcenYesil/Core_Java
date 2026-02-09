package K39_Week06_SampleJavaQuestion;

import java.util.Iterator;
import java.util.TreeSet;

public class RG64_TreeSetListesiniIteratorleTerstenYazdirma {
    public static void main(String[] args) {
        /*64-----
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım
    ve ardından  descendingIterator()  fonksiyonunu kullanarak
    ters sıradan yazdıralım.

    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

    Tersten Siralanisi:

    yesil
    turuncu
    sari
    mavi
    kirmizi
    */

        TreeSet<String> tree = new TreeSet<String>();
        tree.add("kirmizi");
        tree.add("mavi");
        tree.add("sari");
        tree.add("turuncu");
        tree.add("yesil");

        System.out.println(tree);

        Iterator x= tree.descendingIterator(); // ters cevirme methodu

        while(x.hasNext()){
            System.out.println("Ters Cevrilmis : " + x.next());
        }


    }
}
