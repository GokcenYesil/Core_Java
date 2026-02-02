package K31_iteratorListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator2 {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,  6,  7,  2,  3,  5,  6,  7,  2,  8));

        // INDEX kullanmadan sayilar listesindeki cift sayilari silin

        Iterator<Integer>iterator= sayilar.iterator();


        while (iterator.hasNext()){

            if (iterator.next()%2==0){
                iterator.remove();
            }
        }

        System.out.println("Listedeki çift olmayan sayılar: "+sayilar);



        // sayilar listesinin yeni halinde
        // INDEX kullanmadan 5'den buyuk sayilari silin


        Iterator<Integer> itr= sayilar.iterator();

        while (itr.hasNext()){

            if (itr.next()>5){
                itr.remove();
            }
        }

        System.out.println("Listedeki 5'ten büyük olmayan sayılar: "+sayilar);

    }
}
