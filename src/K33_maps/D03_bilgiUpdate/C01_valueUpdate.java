package K33_maps.D03_bilgiUpdate;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Arrays;

public class C01_valueUpdate extends C04_OgrenciMap {

    public static void main(String[] args) {
        //102=Veli-Cem-10-K-TM,
        // 102 numarali ogrencinin ismini ve soyismini yazdirin


        String ogrenciValue=ogrenciMap.get(102);

        System.out.println(ogrenciValue);

        String [] ogrenciValueArr= ogrenciValue.split("-");
        System.out.println(Arrays.toString(ogrenciValueArr));


        System.out.println(


                "102 nolu öğrencinin ismi ve soyismi: "+
                ogrenciValueArr [0]+" "+
                ogrenciValueArr [1]
        );


        // 102 numarali ogrencinin adini Kemal olarak degistirin
        ogrenciValueArr [0]="Kemal";

        String yeniValue = String.join("-",ogrenciValueArr);

        System.out.println(yeniValue);

        ogrenciMap.replace(102,yeniValue);

        System.out.println(ogrenciMap);

        System.out.println("*****************************");




    }


}
