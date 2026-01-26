package K32_set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C02_TekrarlariSilme {
    public static void main(String[] args) {
        // verilen bir array'de tekrar eden elementleri silip
        // array'i her elementin sadece 1 tane oldugu hale donusturen
        // ve bize donduren bir method olusturun



        int [] sayilar = {2,4,5,4,3,5,6,7,3,2,4,5,8,2,3,4,5,1,2,3};
        int [] arr = {3,3,3,3,3,3,5,5,5,5,5,5,77,5,77,77,3};

        arr =sayilariTekrarsizYap(arr);

        System.out.println(Arrays.toString(arr));




        sayilar=sayilariTekrarsizYap(sayilar);

        System.out.println(Arrays.toString(sayilar));


    }
        public static int [] sayilariTekrarsizYap (int []sayilar){

            Set<Integer> tekrarsizSet = new TreeSet<>();

            for (int each  :sayilar ) {

                tekrarsizSet.add(each);

            }

            sayilar = new int[tekrarsizSet.size()];
            int index=0;

            for (int each  :tekrarsizSet ) {

                sayilar [index]=each;

                index++;


            }


        return sayilar;


        }





}
