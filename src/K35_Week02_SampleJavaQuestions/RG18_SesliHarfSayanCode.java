package K35_Week02_SampleJavaQuestions;

import java.util.Locale;

public class RG18_SesliHarfSayanCode {

    public static void main(String[] args) {
        /*18----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

   Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4


    */
        String str= "java is fun";
        int sonuc= sesliHarfSay(str);
        System.out.println("Metindeki sesli harf sayısı: " + sonuc);

    }

        public static int sesliHarfSay(String metin){

        metin= metin.toLowerCase(Locale.forLanguageTag("tr"));
        int sayac=0;
        String sesliHarfler="aeıioöuü";
            for (int i = 1; i <metin.length() ; i++) {

                char chr = metin.charAt(i);

                if (sesliHarfler.contains(chr+"")){

                    sayac++;
                }

            }


            return sayac;

    }

    }



