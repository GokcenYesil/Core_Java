package K39_Week06_SampleJavaQuestion;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class RG57_LinkedListiIteratorYardimiyleYazdirma {
    public static void main(String[] args) {
        /*57-----
    Bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki
    elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

    LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

    1. elemandan itibaren yazdıralım.

    Beklenen Çıktı:
    beyaz
    mavi
    yesil
    turuncu
    */

        LinkedList<String> li1 = new LinkedList<>();

        li1.add("sari");
        li1.add("beyaz");
        li1.add("yesil");
        li1.add("turuncu");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen listenin baslamasini istediginiz indexini yaziniz");
        int index = scan.nextInt();


        ListIterator yeniList = li1.listIterator();
        for (int i = 0; i < index; i++) {
            yeniList.next();
        }
        while (yeniList.hasNext()) {


            System.out.println(yeniList.next());
        }

    }
}
