package K40_mixedPractice.D02_practice02;

import java.util.ArrayList;
import java.util.List;

public class G20_listeToplamaMetodu {

    public static void main(String[] args) {
        /*
       Görev: ArrayList ile toplam alma

🎯 Görev:

Adı listeToplam olan

List<Integer> parametre alan

listedeki tüm elemanların toplamını geri döndüren

bir public static metot yaz
         */

       List<Integer> numbers=new ArrayList<>();

       numbers.add(3);
       numbers.add(5);
       numbers.add(8);
       numbers.add(25);

        System.out.println("Listedeki sayıların toplamı: "+listeToplam(numbers));


    }


public static int listeToplam (List<Integer> sayilar) {

    int toplam=0;
    for (int i = 0; i < sayilar.size() ; i++) {

        toplam+=sayilar.get (i);



    }

return toplam;


}


    }










