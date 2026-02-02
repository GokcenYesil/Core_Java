package K31_iteratorListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {



        List<Integer> sayilar =new ArrayList<>(Arrays.asList(4, 6, 7, 2, 3, 5, 6));

        // INDEX kullanmadan sayilar listesindeki sayilari
        // 1'er artirin


        ListIterator<Integer> iterator=sayilar.listIterator();

        while (iterator.hasNext()){


            Integer eskiDeger = iterator.next();

            iterator.set(eskiDeger+1);

        }

        System.out.println("Listenin artırılmış hali: "+sayilar);


        // sayilar listesindeki sayilari
        // INDEX kullanmadan sondan basa dogru yazdirin

while (iterator.hasPrevious()){
    System.out.print(iterator.previous()+" ");

}

        System.out.println();
        // INDEX KULLANMADAN sayilar listesindeki cift sayilari silin

        while (iterator.hasNext()){

            if (iterator.next()%2==0){
                iterator.remove();
            }
        }
        System.out.println(sayilar);
    }
}
