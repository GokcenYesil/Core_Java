package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C08_ListeMetodlari {
    public static void main(String[] args) {
        // [5, 7, 2, 9, 1, 2, 5, 9, 3]

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5, 7, 2, 9, 1, 2, 5, 9, 3));

        System.out.println(sayilar);

// listede kac element oldugunu yazdirin

        System.out.println(sayilar.size());


// listede element olarak 7'nin var olup olmadigini yazdirin

        System.out.println(sayilar.contains(7));

// listede varsa 2'nin ilk index'ini yazdirin
        System.out.println(sayilar.indexOf(2));

// listede varsa 2'nin son kullanilma index'ini yazdirin
        System.out.println(sayilar.lastIndexOf(2));

// [5, 7, 2, 9, 1, 2, 5, 9, 3]
// listede varsa 11'in ilk index'ini yazdirin

        System.out.println(sayilar.indexOf(11));

// listede 2 icin asagidaki cumlelerden uygun olani yazdirin
// listede 2 yok
// listede 2 sadece 1 tane var
// listede 2 1'den fazla var


        if (sayilar.indexOf(2)==-1){
            System.out.println("listede 2 yok");

        } else if (sayilar.indexOf(2)==sayilar.lastIndexOf(2)) {
            System.out.println("listede 2 sadece 1 tane var");

        }else {
            System.out.println("listede 2 1'den fazla var");
        }


// listedeki tum elementleri natural order'a uygun olarak siralayin

        Collections.sort(sayilar);

        System.out.println(sayilar);

//  [1, 2, 2, 3, 5, 5, 7, 9, 9]

// listedeki tum elementleri silin

        sayilar.clear();

        System.out.println(sayilar);


    }
}
