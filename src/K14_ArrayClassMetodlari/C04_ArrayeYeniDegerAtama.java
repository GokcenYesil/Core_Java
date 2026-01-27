package K14_ArrayClassMetodlari;

import java.util.Arrays;

public class C04_ArrayeYeniDegerAtama {

    public static void main(String[] args) {


        int[] sayilar = {3,5,10};

        String[] isimler = {"Kemal", "Hasan"};


        // sayilar array'ine {3, 5, 10, 8} array'ini atayin



       int[] yeniSayilar= {3, 5, 10, 8};

       sayilar=yeniSayilar;

        System.out.println(Arrays.toString(sayilar));



        //  isimler = {"Kemal", "Hasan"};
        // isimler array'ine {"Ali", "Hasan", "Can"} array'ini atayin



        String[] yeniIsimler= new String[3];//null null null

        yeniIsimler[0]= isimler[0];
        yeniIsimler[1]= isimler[1];
        yeniIsimler[2]= "Can";

      isimler=yeniIsimler;


        System.out.println(Arrays.toString(isimler));

    }
}
