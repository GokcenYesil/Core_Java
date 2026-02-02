package K31_iteratorListIterator;

import java.util.*;

public class C01_Iterator {
    public static void main(String[] args) {

        int[] arr = {3,5,6,1,2,4,5};
        // arr'in tum elementlerini 1'er artirin

        for (int i = 0; i < arr.length ; i++) {

            arr [i]+=1;


        }
        System.out.println(Arrays.toString(arr));//[4, 6, 7, 2, 3, 5, 6]


// arr'in tum elemanlarini INDEX KULLANMADAN 2 artirin


        List<Integer> yeniList= new ArrayList<>(Arrays.asList(3,5,6,1,2,4,5));

       ListIterator<Integer> iterator =yeniList.listIterator();

       while (iterator.hasNext()){

           iterator.set(iterator.next()+2);


       }

        System.out.println("Elemanların 2 artırıldığı yeni liste: "+yeniList);

// INDEX kullanmadan sayilar listesindeki tek sayilari silin


        List<Integer> sayilar= new ArrayList<>(Arrays.asList(5,6,7));

        Iterator<Integer> iterator1 = sayilar.iterator();

        while (iterator1.hasNext()){

            if (iterator1.next()%2!=0){
                iterator1.remove();
            }
        }


        System.out.println("Listedeki tek olmayan sayılar: "+sayilar);




    }
}
