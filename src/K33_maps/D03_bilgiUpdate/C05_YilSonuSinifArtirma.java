package K33_maps.D03_bilgiUpdate;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Set;

public class C05_YilSonuSinifArtirma extends C04_OgrenciMap {

    public static void main(String[] args) {

        Set<Integer> ogrenciKeySeti= ogrenciMap.keySet();

        for (Integer eachKey  :ogrenciKeySeti ) {

            String ogrenciValue=ogrenciMap.get(eachKey);

            String [] ogrenciValueArr=ogrenciValue.split("-");


            String eskiSinif=ogrenciValueArr [2];

            switch (eskiSinif){

                case "9":
                    ogrenciValueArr [2]="10";
                    break;

                case "10":
                    ogrenciValueArr [2]="11";
                    break;

                case "11":
                    ogrenciValueArr [2]="12";
                    break;
                case "12":
                    ogrenciValueArr [2]="Mezun";



            }

            String yeniValue= String.join("-",ogrenciValueArr);
            ogrenciMap.put(eachKey,yeniValue);

        }

        System.out.println(ogrenciMap);
        
    }

}
