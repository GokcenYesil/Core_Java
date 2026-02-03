package K33_maps.D01_bilgilereUlasma;

import java.util.Set;

public class C06_SubeListesiYazdirma extends C04_OgrenciMap {

    // sinif ve sube verildiginde
    // o siniftaki ogrencilerin
    // numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun

    /*
       {101=Ali-Can-11-H-MF,
       102=Veli-Cem-10-K-TM,
       103=Ali-Cem-11-K-TM,
       104=Ayse-Can-10-H-MF,
       105=Sevgi-Cem-11-M-TM,
       106=Sevgi-Can-10-K-MF,
       107=Esra-Han-11-M-SOZ}

  */
    public static void main(String[] args) {



        String sube="m";

        Integer sinif=11;


        Set<Integer> keySeti=ogrenciMap.keySet();

        for (Integer eachkey  :keySeti ) {

            String eachValue= ogrenciMap.get(eachkey);

            String [] valueArr = eachValue.split("-");

            if (valueArr [2].equalsIgnoreCase(sinif+"") && valueArr [3].equalsIgnoreCase(sube)){

                System.out.println(

                    eachkey+" "+ valueArr [0]+" "+ valueArr [1]

                );
            }

        }



    }
}
