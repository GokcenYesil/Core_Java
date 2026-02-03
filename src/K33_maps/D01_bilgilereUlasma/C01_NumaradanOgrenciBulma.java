package K33_maps.D01_bilgilereUlasma;

public class C01_NumaradanOgrenciBulma extends C04_OgrenciMap {

    public static void main(String[] args) {



        int ogrenciNo=107;

        // ogrenci map'inde verilen ogrenciNo'ya sahip ogrencinin
        // sinif, sube, isim ve soyismini yazdirin


        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}
         */


            String ogrenciValue=ogrenciMap.get(ogrenciNo);

            String [] valueArr=ogrenciValue.split("-");

        System.out.println(ogrenciNo+" numaralı örenciye ait bilgiler: ");

        System.out.println(

                valueArr [2]+" "+
                valueArr [3]+" "+
                valueArr [0]+" "+
                valueArr [1]

        );

    }
}
