package K33_maps.D06_nestedMap;

import java.util.Set;

public class C02_IstenenListeyiOlusturma extends NestedOgrenciMap {
    public static void main(String[] args) {


        mapeOgrenciEkle(109,"Kemal","Han",10,"K","MF");
        mapeOgrenciEkle(111,"Leyla","Yılmaz",9,"M","TM");


        System.out.println(ogrenciNestedMap);
        /*
        {102={sinif=11, sube=M, soyisim=Cem, bolum=Soz, isim=Veli},
        103={sinif=11, sube=H, soyisim=Cem, bolum=TM, isim=Ali},
        104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
        105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
        106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
        107={sinif=11, sube=M, soyisim=Han, bolum=SOZ, isim=Esra},
        109={sinif=10, sube=K, soyisim=Han, bolum=MF, isim=Kemal},
        111={sinif=9, sube=M, soyisim=Yılmaz, bolum=TM, isim=Leyla}}
         */

        //103 numaralı öğrencinin bölümünü MF yapın

        ogrenciNestedMap.get(103).replace("bolum","MF");


        //105 numarali ögrencinin soy ismini Yılmaz yapın


        ogrenciNestedMap.get(105).put("soyisim","Yılmaz");

        // ogrenci map'inde 11.siniftaki ogrencilerin
        // numara , sinif, sube, isim ve soyisimlerini liste olarak yazdirin


        Set<Integer> ogrenciNoKeySeti= ogrenciNestedMap.keySet();


        for (Integer eachKey  :ogrenciNoKeySeti ) {

            if ((Integer) ogrenciNestedMap.get(eachKey).get("sinif")==11){

                System.out.println(

                        eachKey+ " " +
                        ogrenciNestedMap.get(eachKey).get("sinif")+" "+
                        ogrenciNestedMap.get(eachKey).get("sube")+" "+
                        ogrenciNestedMap.get(eachKey).get("isim")+" "+
                        ogrenciNestedMap.get(eachKey).get("soyisim")


                );


            }

        }


    }
}
