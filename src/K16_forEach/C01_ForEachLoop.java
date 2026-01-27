package K16_forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ForEachLoop {

    public static void main(String[] args) {


        int[] arr = {3,4,5,2,3,4,5,1,2,3};

        List<Integer> sayilar= new ArrayList<>(Arrays.asList(2,8,5,6,7,4,2,13,4,5,6,4,5,4,3));

        System.out.println(sayilar);

        // arr'deki elementlerin toplamini yazdirin
        int toplam=0;

        for (int each:sayilar) {

            toplam+=each;


        }

        System.out.println("Array'deki elementlerin toplamı: "+toplam);


// sayilar listesindeki  cift sayilari toplayin


        int sum=0;

        for (int cift:sayilar){
            if (cift%2==0) {

                sum+=cift;

            }
        }
        System.out.println("Array'deki çift sayıların toplamı: "+sum);

// sayilar listesindeki en buyuk elementi yazdirin
        int enBuyuk= Integer.MIN_VALUE;


        for (int each:sayilar){

            if (each>enBuyuk){

                enBuyuk=each;
            }
        }

        System.out.println("Array'deki en büyük sayı: "+enBuyuk);




    }
}
