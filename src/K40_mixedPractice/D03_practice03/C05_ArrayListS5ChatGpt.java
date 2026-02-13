package K40_mixedPractice.D03_practice03;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayListS5ChatGpt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);

        Integer[] arr = list.toArray(new Integer[0]);

        System.out.println(arr.length);
        System.out.println(arr[1]);
    }

}
