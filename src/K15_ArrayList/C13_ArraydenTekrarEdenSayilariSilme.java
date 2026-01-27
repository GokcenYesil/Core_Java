package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C13_ArraydenTekrarEdenSayilariSilme {
    public static void main(String[] args) {
        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip,
        // array'i her sayidan sadece 1 tane bulunacak sekilde kaydedin
        // ornek input : {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : [1,2,3,4,5]


        int [] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr [i])){


                tekrarsizList.add(arr [i]);
            }

        }

        System.out.println(tekrarsizList);
        Collections.sort(tekrarsizList);



        //[1, 2, 3, 4, 5]
        arr= new int[tekrarsizList.size()];


        for (int i = 0; i < tekrarsizList.size() ; i++) {

            arr [i] = tekrarsizList.get(i);

        }

        System.out.println("Array'in tekrarsız elemanlı hali: "+ Arrays.toString(arr));

    }
}
