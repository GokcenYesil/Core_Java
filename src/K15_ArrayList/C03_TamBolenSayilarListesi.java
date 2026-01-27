package K15_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenSayilarListesi {
    public static void main(String[] args) {


        System.out.println(pozitifTamBolenleriBul(50));



         /*
                tamBolenlerListesi method'unu kullanarak
                2 basamakli asal sayilari yazdirin
         */


        for (int i = 10; i <100 ; i++) {

           int tamBolenler= pozitifTamBolenleriBul(i).size();

           if (tamBolenler==2){

               System.out.print(i+" ");
           }

        }
    }




    // Soru 6- Verilen pozitif bir tamsayiyi,
    //         tam bolebilen tum pozitif tamsayilari bir liste olarak
    //         bize donduren bir method olusturun.



    public static List<Integer> pozitifTamBolenleriBul (int sayi) {

        List<Integer> tamBolenler= new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){

                tamBolenler.add(i);

            }

        }


        return tamBolenler;

    }



}
