package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_TumElementleriArtirma {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        System.out.println("Metod ile işlem gören liste: "+elementleriArtir(sayilar, 4));

        // sayilar listesindeki tum elementleri 4 artirin

        for (int i = 0; i < sayilar.size() ; i++) {



            sayilar.set(i,sayilar.get(i)+4);



        }
        System.out.println("Listedeki elementlerin yeni değerleri: "+sayilar);

    }

    // verilen Integer bir listedeki tum elementleri
    // istenen bir deger kadar artirip listenin son halini donduren
    // bir method olusturun.


    public static List<Integer> elementleriArtir (List<Integer> sayilar, int artisMiktari){

        for (int i = 0; i < sayilar.size() ; i++) {



            sayilar.set(i,sayilar.get(i)+artisMiktari);



        }


        return sayilar;


    }
}
