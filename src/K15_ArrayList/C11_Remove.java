package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));
        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));


        // isimler listesinden Ali'yi silin

        isimler.remove("Ali");
        System.out.println(isimler);


// isimler listesinden 3.index'deki elementi silin


        isimler.remove(3);

        System.out.println(isimler);


// sayilar listesinden 1'i silin

        Integer silinecek1=1;

        sayilar.remove(silinecek1);

        System.out.println(sayilar);


// sayilar listesinden 9'u silin


        Integer silinecek9= 9;

        sayilar.remove(silinecek9);
        System.out.println(sayilar);

    }
}
