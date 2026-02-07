package K36_Week02_SampleJavaQuestions;

import java.util.Arrays;
import java.util.List;

public class RG26_ArrayiArrayListeCevirmek {
    public static void main(String[] args) {
        /*26-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

    Beklenen Çıktı:
            [Python, JAVA, PHP, Perl, C#, C++]
            */




        String [] kelimeler={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> yeniList= Arrays.asList(kelimeler);

        System.out.println("Array list: "+yeniList);

    }


}
