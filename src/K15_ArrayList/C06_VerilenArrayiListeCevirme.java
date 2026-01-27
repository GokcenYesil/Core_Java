package K15_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_VerilenArrayiListeCevirme {
    public static void main(String[] args) {
        Integer[] arr = {3,5,6,7,8,9,2,3,5,3,4,6,2,7};

        // arr array'ini bir list olarak kaydedin

        // bos bir list olusturup
        // for loop ile array'deki elementleri listeye ekleyin

        List<Integer> yeniListe= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

           yeniListe.add(arr[i]);


        }
        yeniListe.add(10);
        yeniListe.add(20);
        yeniListe.remove(0);
        yeniListe.remove(0);
        System.out.println(yeniListe);
    }
}
