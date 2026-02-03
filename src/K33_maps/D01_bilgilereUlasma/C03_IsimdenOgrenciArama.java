package K33_maps.D01_bilgilereUlasma;

import java.util.Set;

public class C03_IsimdenOgrenciArama extends C04_OgrenciMap {

    public static void main(String[] args) {
        // verilen isme sahip ogrencilerin
        // Numara, sinif, sube, isim ve soyisimlerini yazdiran
        // bir method olusturun

            String isim ="Sevgi";

        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}

   */


        Set<Integer> isimKeySet = ogrenciMap.keySet();



        for (Integer each  :isimKeySet ) {

            String eachValue= ogrenciMap.get(each);

            String [] valueArr = eachValue.split("-");

            if (valueArr [0].equalsIgnoreCase(isim)){


                System.out.println(

                        each+" "+
                        valueArr [2]+" "+
                        valueArr [3]+" "+
                        valueArr [0]+" "+
                        valueArr [1]


                );
            }



        }




















    }
}
