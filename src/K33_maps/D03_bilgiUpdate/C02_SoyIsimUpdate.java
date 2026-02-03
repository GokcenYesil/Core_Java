package K33_maps.D03_bilgiUpdate;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

public class C02_SoyIsimUpdate extends C04_OgrenciMap {
    public static void main(String[] args) {
        // 104 numarali ogrencinin soyismini Yilmaz yapin
        //Ayse-Can-10-H-MF

        int verilenNo= 103;
        String yeniSoyisim="Yilmaz";

        String verilenNoValue=ogrenciMap.get(verilenNo);

        String [] valueArr= verilenNoValue.split("-");

        valueArr [1]=yeniSoyisim;

        String yeniValueNo=String.join("-",valueArr);

        ogrenciMap.replace(verilenNo,yeniValueNo);

        System.out.println(ogrenciMap);
    }
}
