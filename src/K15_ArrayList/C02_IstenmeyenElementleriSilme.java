package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_IstenmeyenElementleriSilme {

    public static void main(String[] args) {

        // isimler listesinde "e" harfi iceren elementleri silin




        List<String> isimler= new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

        istenmeyenElementleriSil(isimler,"L");

        System.out.println("'e' harfi içermeyen isimlerin listesi: "+isimler );


        for (int i = 0; i < isimler.size() ; i++) {

            if (isimler.get(i).contains("e")){

                isimler.remove(isimler.get(i));
                i--;
            }

        }
        System.out.println(isimler);
    }
    //Case sensitivity var.sadece istenen karakteri yazdıran kod.
    // harf küçük girildiğinde sadece küçük harf hali varsa siliyor.

    //Soru 3- Verilen String bir listede
    //        istenmeyen harf iceren elementleri silip,
    //        kalan kismini list olarak bize donduren bir method olusturun

    public static List<String> istenmeyenElementleriSil (List<String> isimler,String istenmeyenElement){


        for (int i = 0; i < isimler.size() ; i++) {

            if (isimler.get(i).toLowerCase().contains(istenmeyenElement.toLowerCase())) {

                isimler.remove(isimler.get(i));

                i--;
            }


            }
        return isimler;
        }

    //Case sensitivity yok.Küçük büyük harf farketmeksizin silen metod
    }




