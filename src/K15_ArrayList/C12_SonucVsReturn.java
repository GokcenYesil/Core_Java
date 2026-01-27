package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_SonucVsReturn {
    public static void main(String[] args) {
        List<String> isimler= new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));
        List<Integer>sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));



        // sayilar listesinde 2.index'deki elementi 5 yapin


        System.out.println(sayilar.set(2, 5));
        System.out.println(sayilar);


// Isimler listesinden Ali'yi silin

        System.out.println(isimler.remove("Ali"));
        System.out.println(isimler);

// Isimler listesinden Mert'i silin


        System.out.println(isimler.remove("Mert"));
        System.out.println(isimler);

// Isimler listesinden 2. index'deki elementi silin

        System.out.println(isimler.remove(2));
        System.out.println(isimler);

// sayilar listesinden 3. index'deki elementi silin

        System.out.println(sayilar.remove(3));
        System.out.println(sayilar);

// sayilar listesinden 4'u silin

        Integer silinecek4=4;
        System.out.println(sayilar.remove(silinecek4));
        System.out.println(sayilar);

    }
}
