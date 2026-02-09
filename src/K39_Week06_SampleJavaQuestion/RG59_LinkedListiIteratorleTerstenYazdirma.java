package K39_Week06_SampleJavaQuestion;

import java.util.LinkedList;
import java.util.ListIterator;

public class RG59_LinkedListiIteratorleTerstenYazdirma {
    public static void main(String[] args) {
        /*59-----
    Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

    LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

    Beklenen Çıktı:
    Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
    LinkedList Tersi:
    mor
    beyaz
    kirmizi
    yesil
    mavi
    sari
    */

        yol1();
    }

    private static void yol1() {
        LinkedList<String> li1 = new LinkedList<>();

        li1.add("sari");
        li1.add("mavi");
        li1.add("yesil");
        li1.add("kirmizi");
        li1.add("beyaz");
        li1.add("mor");
        System.out.println("Orjinal list elemanlari: " + li1);


        ListIterator tersList = li1.listIterator();
        while (tersList.hasNext()){//bunu yaparak cursoru(imleci) sona getiriyoruz(hasnext next ile)
            tersList.next();

        }while (tersList.hasPrevious()){//bunulada sonra eleman var mi

            System.out.println(tersList.previous());
        }


    }
}
