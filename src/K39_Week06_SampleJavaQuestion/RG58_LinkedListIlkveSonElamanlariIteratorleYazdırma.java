package K39_Week06_SampleJavaQuestion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class RG58_LinkedListIlkveSonElamanlariIteratorleYazdırma {
    public static void main(String[] args) {
        /*58-----
    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

    LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

    Beklenen Çıktı:

    Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
    Listenin ilk elemani: sari
    listenin son elemani: beyaz
    */

        LinkedList<String> li1 = new LinkedList<>();

        li1.add("sari");
        li1.add("mavi");
        li1.add("turuncu");
        li1.add("siyah");
        li1.add("yesil");
        li1.add("beyaz");

        System.out.println("Orjinal list elemanlari: " + li1);
        System.out.println(" Listenin ilk elemani: " + li1.getFirst());
        System.out.println("listenin son elemani: " + li1.getLast());

        System.out.println("******************************");

        // 2. yol

        LinkedList<String> ll=new LinkedList<>(Arrays.asList("sari","mavi","turuncu","siyah","yesil","beyaz"));
        System.out.println("Orjinal list elemanlari: "+ll);
        ListIterator li =ll.listIterator();
        System.out.println("Listenin ilk elemani: "+li.next());
        while (li.hasNext()){
            li.next();
        }
        li.previous();
        System.out.println("Listenin son elemani: "+li.next());

    }
}
