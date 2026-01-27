package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_IstenenElementiKullanma {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,1,4,0));

        // sayilar listesinin 2.index'indeki sayiyi yazdirin


        System.out.println(sayilar.get(2));
        System.out.println(sayilar.get(0));
        System.out.println(sayilar.get(5));



// sayilar listesindeki tum elementleri toplayin

        int toplam=0;

        for (int i = 0; i <sayilar.size() ; i++) {


            toplam+=sayilar.get(i);

        }
        System.out.println("Sayilar listesindeki sayıların toplamı: "+toplam);// 22



// [3, 6, 8, 1, 4, 0]

// 2.index'deki elementi 5 yapin ==>


        sayilar.set(2,5);

        System.out.println(sayilar);

// 4.index'deki elementi yazdirin

        System.out.println("4.index'deki element: "+sayilar.get(4));



// sayilar listesinde 4.index'deki elementi 11 yapin

        sayilar.set(4,11);
        System.out.println(sayilar);// [3, 6, 5, 1, 11, 0]



// sayilar listesindeki 4.index'e 23 ekleyin


        sayilar.add(4,23);
        System.out.println(sayilar);// [3, 6, 5, 1, 23, 11, 0]


// sayilar listesinin 2.index'indeki sayiyi yazdirin

        System.out.println("2.index'deki element: "+sayilar.get(2));



    }
}
