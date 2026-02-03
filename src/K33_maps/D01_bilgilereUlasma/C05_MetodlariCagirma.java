package K33_maps.D01_bilgilereUlasma;

import K33_maps.D03_bilgiUpdate.C01_valueUpdate;
import K33_maps.D03_bilgiUpdate.C04_SubeUpdate;
import K33_maps.D03_bilgiUpdate.C05_YilSonuSinifArtirma;

public class C05_MetodlariCagirma {

    public static void main(String[] args) {
        C04_OgrenciMap.numaradanOgrenciBul(102);
        C04_OgrenciMap.numaradanOgrenciBul(106);

        System.out.println("=====================");

        C04_OgrenciMap.soyIsimdenOgrenciBul("Can");
        C04_OgrenciMap.soyIsimdenOgrenciBul("CEM");
        System.out.println("=====================");


        C03_IsimdenOgrenciArama.isimdenOgrenciBul("Ali");
        C03_IsimdenOgrenciArama.isimdenOgrenciBul("Esra");
        C03_IsimdenOgrenciArama.isimdenOgrenciBul("Sevgi");
        System.out.println("=====================");



        C06_SubeListesiYazdirma.subeListesiYazdir(11,"K");
        C06_SubeListesiYazdirma.subeListesiYazdir(10,"K");

        System.out.println("=====================");
        System.out.println("=====================");

        C01_valueUpdate.numaradanSoyIsimUpdate(102,"Yeşil");
        C01_valueUpdate.numaradanSoyIsimUpdate(101,"Yeşil");

        //C03_YeniOgrenciEkleme.ogrenciEkle();

        System.out.println("=====================");

        C04_SubeUpdate.subeUpdate(11,"H","P");
        System.out.println(C04_OgrenciMap.ogrenciMap);

        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");

        C05_YilSonuSinifArtirma.yilSonuSinifArtir();
        System.out.println(C04_OgrenciMap.ogrenciMap);
        C05_YilSonuSinifArtirma.yilSonuSinifArtir();
        System.out.println(C04_OgrenciMap.ogrenciMap);
    }
}
