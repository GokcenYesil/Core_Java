package K39_Week06_SampleJavaQuestion;

import java.util.PriorityQueue;
import java.util.Queue;

public class RG68_PriorityQueueElemanlariniYazdirma {
    public static void main(String[] args) {
        /*68-----
    Bir Priority Queue  oluşruralım, elemanlarını ekleyim
    priority queue yazdıralım.

    priority queue elemanları: sari,yesil,mavi,kirmizi

    Beklenen Çıktı:
    Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
    */

        Queue<String> q=new PriorityQueue<>();
        q.add("sari");
        q.add("yesil");
        q.add("mavi");
        q.add("kirmizi");
        System.out.println("Priority Queue elemanlari: "+q); //javanin oncelik siralamasina gore siralar

       /* Queue<String>q1=new LinkedList<>();
        q1.add("sari");
        q1.add("yesil");
        q1.add("mavi");
        q1.add("kirmizi");
        System.out.println(q1);  giris sirasina gore siralar*/

    }
}
