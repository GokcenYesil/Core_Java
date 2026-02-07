package K37_Week04_SampleJavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG34_Array4HarfliKelimeReturn {

    public static void main(String[] args) {
        /*34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.


    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     ["Pair"]
    */


        String [] words= {"Tomato", "Potato", "Pair"};

        System.out.println(Arrays.toString(dortHarfliKelimeler(words)));


    }


    public static String [] dortHarfliKelimeler (String []kelimeler){

        List<String> sonuc= new ArrayList<>();


        for (int i = 0; i <kelimeler.length ; i++) {

            if (kelimeler [i].length()==4){

               sonuc.add(kelimeler[i]);


            }

        }

        return sonuc.toArray(new String[0]);
    }


}
