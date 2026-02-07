package K36_Week02_SampleJavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RG27_ArrayListtekiEnBuyuk2nciElamaniBulma {
    public static void main(String[] args) {

        /*27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

    Array: [1232,2345,5467,678,3454,2312,3451]
    */


        List<Integer>sayilistesi= new ArrayList<>(Arrays.asList(1232,2345,5467,678,3454,2312,3451));

        Collections.sort(sayilistesi);
        System.out.println(sayilistesi);


        int enBuyukIkinciSayi= sayilistesi.get(sayilistesi.size()-2);

        System.out.println("İkinci en büyük sayı: "+enBuyukIkinciSayi);
    }
}
