package K38_Week05_SampleJavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG48_2FarkliArrayiBirlestirme {
    public static void main(String[] args) {
            /*48-----
    İki farklı Array'i birleştiren bir program yazınız.

    Örnekler:

    birlestir([1, 3, 5], [2, 6, 8])
    Çıktı : [1, 3, 5, 2, 6, 8]

    birlestir([7, 8], [10, 9, 1, 1, 2])
    Çıktı : [7, 8, 10, 9, 1, 1, 2]

    birlestir([4, 5, 1], [3, 3, 3, 3, 3])
    Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
    */

        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(4, 5, 1));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3, 3, 3, 3, 3));


        list1.addAll(list2);
        System.out.println(list1);

    }
}
