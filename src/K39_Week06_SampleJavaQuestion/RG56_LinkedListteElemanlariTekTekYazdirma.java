package K39_Week06_SampleJavaQuestion;

import java.util.Arrays;
import java.util.LinkedList;

public class RG56_LinkedListteElemanlariTekTekYazdirma {
    public static void main(String[] args) {
        /*56-----
    Bir linkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

    LinkedList elemanları: sari,mavi,mor,yesil,beyaz

    Beklenen Çıktı:
    sari
    mavi
    mor
    yesil
    beyaz
    */

        LinkedList<String> lil = new LinkedList<>(Arrays.asList("sari", "mavi", "mor", "yesil", "beyaz"));

        for (String each : lil) {
            System.out.println(each);

        }
    }

}


