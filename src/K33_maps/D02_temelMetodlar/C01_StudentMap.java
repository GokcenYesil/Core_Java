package K33_maps.D02_temelMetodlar;

import java.util.*;

public class C01_StudentMap {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        //System.out.print(ogrenciMap);

        // 103 numarali ogrencinin value'sunu yazdirin

        System.out.println(ogrenciMap.get(103));// Ali-Cem-11-K-TM


        System.out.println(ogrenciMap.get(105));// Sevgi-Cem-11-M-TM



        System.out.println(ogrenciMap.getOrDefault(105, "Aranan key map'te yok"));//"Sevgi-Cem-11-M-TM"
        System.out.println(ogrenciMap.getOrDefault(125, "Aranan key map'te yok"));//Aranan key map'te yok


// butun key'leri yazdirin

        System.out.println(ogrenciMap.keySet());
//  [101, 102, 103, 104, 105, 106, 107]


// butun key'leri kaydedin

        Set<Integer>ogrencikeySeti=ogrenciMap.keySet();
        System.out.println("Ogrenci key seti: "+ogrencikeySeti);

        // ogrenci map'inde 107 numarali ogrenci var mi ?

        System.out.println(ogrenciMap.containsKey(107));//true
        System.out.println(ogrenciMap.containsKey(127));//false


        // tum value'leri yazdirin
        System.out.println(ogrenciMap.values());


        // tum value'leri kaydedin

        Collection<String> ogrenciValueCollection= ogrenciMap.values();
        System.out.println("Öğrenci value'leri: "+ogrenciValueCollection);

/*
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
         */
        System.out.println(ogrenciMap.containsValue("Ali"));
        System.out.println(ogrenciMap.containsValue("Sevgi-Cem-11-M-TM"));

        ogrenciMap.replace(101,"Hasan-Can-11-H-MF");
        ogrenciMap.replace(110,"Hasan-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-CEM-10-K-TM");
        ogrenciMap.put(110,"Veli-CEM-10-K-TM");
        ogrenciMap.replace(105,"Sevgi-Cem-11-M-TM","Sevgi-HAYAT-11-M-TM");
        ogrenciMap.remove(104);
        ogrenciMap.remove(102,"Veli-CEM-10-K-TM");
        ogrenciMap.remove(105,"Veli-CEM-10-K-TM");




        System.out.print(ogrenciMap);









    }








}
