package K40_mixedPractice.D03_practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayListS1ChatGpt {

    public static void main(String[] args) {
        /*
        List<String> names = new ArrayList<>(
        Arrays.asList("Ali", "Ayşe", "Mehmet", "Zeynep")
);
❓ Soru:
1️⃣ Listenin eleman sayısını ekrana yazdır
2️⃣ Listenin boş olup olmadığını kontrol et ve sonucu yazdır

📌 Şartlar:

Sadece List metodlarını kullan

if kullanabilirsin

size() ve isEmpty() mutlaka geçsin


   1️⃣ Listede "Mehmet" var mı kontrol et
2️⃣ Varsa "Mehmet listede mevcut"
3️⃣ Yoksa "Mehmet listede yok" yazdır


         */

        List<String> names=new ArrayList<>(Arrays.asList("Ali", "Ayşe", "Mehmet", "Zeynep","Mehmet", "Merve" ,"Mehmet"));


        System.out.println(names.size());

        System.out.println(names.isEmpty());


        if (names.contains("Mehmet")){
            System.out.println("Mehmet listede mevcut");
        }else System.out.println("Mehmet listede yok");

        /*
        Listenin son elemanını ekrana yazdır
2️⃣ Index hatası almamak için size() kullan
         */


        System.out.println(names.get(names.size() - 1));

        //1️⃣ Listedeki tüm elemanları sırayla yazdır
        //2️⃣ index kullanarak yaz (for + get)


        for (int i = 0; i < names.size() ; i++) {

            System.out.print(names.get(i)+" ");

        }

        //Listeyi for-each ile dön
        //2️⃣ Eğer eleman "Ayşe" ise
        //3️⃣ "Ayşe bulundu" yazdır
        //4️⃣ Bulduktan sonra döngüyü durdur


        System.out.println();


        for (String name  :names ) {
            if (name.equals("Ayşe")) {
                System.out.println("Ayşe bulundu");
                break;

            }

        }

//remove() kullanılacak
//listeden "Mehmet" elemanını sil.
//String’e göre silme yapılacak (index değil)
//
//Kod çalıştığında "Mehmet" listede kalmamalı

        //List<String> names=new ArrayList<>(Arrays.asList("Ali", "Ayşe", "Mehmet", "Zeynep"));




        names.remove("Mehmet");
        System.out.println(names);

        boolean sonuc = names.remove("Mehmet");
        System.out.println(sonuc);
        //"M" harfi ile başlayan tüm isimleri sil.


        for (int i = 0; i < names.size() ; i++) {

            if (names.get(i).startsWith("M")){

         names.remove(i);

                i--;


            }

        }

        System.out.println(names);

        }


    }

