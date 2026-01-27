package K14_ArrayClassMetodlari;

import java.util.Arrays;

public class C01_sort {
    public static void main(String[] args) {
        String[] isimler = {"Metin","Mete","metehan","Mikail","Nevzat","Yasar","yakup","Yaman"};


        // array'i natural order'a gore duzenleyip (dogal siralama) yazdirin


        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));

    }
}
