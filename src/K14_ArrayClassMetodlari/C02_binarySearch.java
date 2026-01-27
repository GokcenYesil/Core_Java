package K14_ArrayClassMetodlari;

import java.util.Arrays;

public class C02_binarySearch {
    public static void main(String[] args) {
        String[] harfler = {"d","t","p","k","z"};

        // verilen arr'de a harfinin var olup olmadigini yazdirin


        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));//[d, k, p, t, z]

        System.out.println(Arrays.binarySearch(harfler, "d"));//0
        System.out.println(Arrays.binarySearch(harfler, "t"));//1
        System.out.println(Arrays.binarySearch(harfler, "p"));//2
        System.out.println(Arrays.binarySearch(harfler, "k"));//3
        System.out.println(Arrays.binarySearch(harfler, "z"));//4
        System.out.println(Arrays.binarySearch(harfler, "g"));//-2
        System.out.println(Arrays.binarySearch(harfler, "i"));//-2
        System.out.println(Arrays.binarySearch(harfler, "s"));//-4
        System.out.println(Arrays.binarySearch(harfler, "m"));//-3


    }
}
