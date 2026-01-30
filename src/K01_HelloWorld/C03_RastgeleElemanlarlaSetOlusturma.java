package K01_HelloWorld;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_RastgeleElemanlarlaSetOlusturma {
    public static void main(String[] args) {


        // icinde 20'den kucuk rastgele 7 adet pozitif tamsayinin oldugu
        // bir Set olusturun


        Random random = new Random();
        Set<Integer> rastgeleSayilarSeti= new TreeSet<>();

        for (int i = 1; i <6 ; i++) {

            rastgeleSayilarSeti.add(random.nextInt(20));

        }

        System.out.println(rastgeleSayilarSeti);

        Set<Integer> whileSet= new TreeSet<>();

        while (whileSet.size()<7) {
            whileSet.add(random.nextInt(20));
        }

        System.out.println("While ile oluşturulan set: " + whileSet);

    }
}
