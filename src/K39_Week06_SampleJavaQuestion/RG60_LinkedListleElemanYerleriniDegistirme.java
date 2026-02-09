package K39_Week06_SampleJavaQuestion;

import java.util.Collections;
import java.util.LinkedList;

public class RG60_LinkedListleElemanYerleriniDegistirme {
    public static void main(String[] args) {
            /*60-----
    Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı
    yer değiştiren java kodunu yazınız.

    LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

    hint:  Collections.swap();

    Beklene Çıktı:
    Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
    Swap sonrası durum: [siyah,kirmizi,beyaz,mavi,yesil,turuncu]
    */

        degisim();
    }

    private static void degisim() {
        LinkedList<String> li1 = new LinkedList<>();
        li1.add("mavi");
        li1.add("kirmizi");
        li1.add("beyaz");
        li1.add("siyah");
        li1.add("yesil");
        li1.add("turuncu");
        System.out.println("Orjinal LinkedList: " + li1);
        Collections.swap(li1, 0, 3);
        System.out.println("Swap sonrası durum: " + li1);


    }
}
