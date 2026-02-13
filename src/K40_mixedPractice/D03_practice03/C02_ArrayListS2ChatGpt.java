package K40_mixedPractice.D03_practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayListS2ChatGpt {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                Arrays.asList("Ali", "Ayşe", "Mehmet"));

        //"Zeynep" elemanını index 1’e ekle
        //2️⃣ Listeyi ekrana yazdır


      //set(1, "Zeynep") kullan
     //2️⃣ Listeyi yazdır



        names.set(1,"Zeynep");

        System.out.println(names);

        System.out.println(names.size());


        List<String> names2 = new ArrayList<>(
                Arrays.asList("Ali", "Ayşe", "Mehmet", "Ayşe", "Zeynep"));


        //1️⃣ İlk "Ayşe"nin index’ini bul
        //2️⃣ Son "Ayşe"nin index’ini bul
        //3️⃣ Sonuçları yazdır


        System.out.println("Ayşe'nin ilk indeksi: "+names2.indexOf("Ayşe"));
        System.out.println("Ayşe'nin son indeksi: "+names2.lastIndexOf("Ayşe"));

        //"Ayşe" ile "Zeynep" arasındaki elemanlardan bir alt liste oluştur
        //2️⃣ Bu alt listeyi yazdır

        List<String> names3 = new ArrayList<>(
                Arrays.asList("Ali", "Ayşe", "Mehmet", "Zeynep", "Can")
        );

        System.out.println(names3.subList(1, 3));

        System.out.println(names3);

        List<String> list1 = Arrays.asList("Ali", "Ayşe", "Mehmet", "Zeynep");
        List<String> list2 = Arrays.asList("Ayşe", "Mehmet");

        //list1, list2’nin tüm elemanlarını içeriyor mu?
        //2️⃣ Sonucu ekrana yazdır


        System.out.println(list1.containsAll(list2));

    }
}
