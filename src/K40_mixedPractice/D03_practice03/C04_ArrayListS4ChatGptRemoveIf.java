package K40_mixedPractice.D03_practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayListS4ChatGptRemoveIf {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(3, 7, 1, 9, 4, 6));

        //listede 5’ten küçük olan tüm sayıları sil

       numbers.removeIf(x-> x<5);

        System.out.println(numbers);

        }

    }

