package K15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListeOlusturmaVeElemanEkleme {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        //ArrayList<String>isimler2 = new ArrayList<>();// Array list oluşturmak için 2. yol



        // icine int elementler koyabilecegimiz sayilar isminde bir ArrayList olusturun

        List<Integer> sayilar = new ArrayList<>();

        // Listeye 3,6,8 ve 9 ekleyin

        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(9);

        System.out.println(sayilar);


        // element olarak 3,4,5,6,2,3,4,2,3,4,5,4,7,8,9 bulunduran bir ArrayList olusturun

        List<Integer> yeniList= new ArrayList<>(Arrays.asList(3,4,5,6,2,3,4,2,3,4,5,4,7,8,9));

        System.out.println("Yeni liste:"+yeniList);


        // icinde 10,20,30 elementlerini bulunduran yeni bir liste olusturun

        List<Integer> ekListe = new ArrayList<>(Arrays.asList(10,20,30));

        System.out.println("Ek liste: "+ekListe);

        // yukarda olusturdugumuz sayilar listesine yeni listenin tamamini ekleyin


        sayilar.addAll(ekListe);

        System.out.println("Yeni sayılar listesi: "+sayilar);


        sayilar.addAll(2,ekListe);

        System.out.println("İndeks bazlı ekleme sonrası sayilar: "+sayilar);


    }
    }

