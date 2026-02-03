package K33_maps.D01_bilgilereUlasma;

import java.util.Collection;

public class C02_SoyisimdenOgrenciBilgisiYazdirma extends C04_OgrenciMap {

    public static void main(String[] args) {


        // verilen soyisim'e sahip ogrencilerin
        // sinif sube isim ve soyisimlerini
        // alt alta yazdirin

        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}
         */


        String soyIsim= "Cem";


        Collection<String> ogrenciValues =ogrenciMap.values();
        System.out.println("Soyismi " + soyIsim + " olan ogrenciler : ");

        for (String each  :ogrenciValues ) {

            String [] valueList =each.split("-");


            if (valueList [1].equalsIgnoreCase(soyIsim)){

                System.out.println(


                        valueList [2]+" "+
                        valueList [3]+" "+
                        valueList [0]+" "+
                        valueList [1]

                );

            }

        }



    }


}
