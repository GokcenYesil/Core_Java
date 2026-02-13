package K40_mixedPractice.D03_practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArrayListS7ChatGpt {
    public static void main(String[] args) {
        /*
List<Integer> oluştur

İçine 2, 4, 6, 8 ekle

Bir for döngüsüyle çift sayıların toplamını hesapla

Sonucu ekrana yazdır

         */


        List<Integer> liste = new ArrayList<>(Arrays.asList(2,4,6,8));


        int toplam=0;

        for (int i = 0; i < liste.size(); i++) {

            if (liste.get(i)%2==0){
                toplam+=liste.get(i);
            }

        }

        System.out.println(toplam);


        /*
        Bir int[] array oluştur: {1, 2, 3}

Bu array’i bağımsız bir List<Integer>’e çevir

Listeye 4 ekle

Listeyi ekrana yazdır
         */


        int [] arr = {1,2,3};
        List<Integer>list = new ArrayList<>();

        for (int each  : arr) {
            list.add(each);

        }

        list.add(4);
        System.out.println(list);


        /*
        Bir int[] array oluştur → {3, 6, 9, 12}

Bu array’deki en büyük sayıyı bul

En büyük sayıyı ekrana yazdır
         */



        int []dizi = {3,6,9,12,88};


        int enBuyuk=dizi [0];
        for (int i = 0; i <dizi.length ; i++) {

            if (dizi [i]>enBuyuk){

                enBuyuk=dizi [i];


            }

        }

        System.out.println(enBuyuk);


        /*
        Bir int[] array oluştur → {7, 4, 9, 2}

Bu array’deki en küçük sayıyı bul

Sonucu ekrana yazdır
         */


        int []yeniArr= {7,4,9,2};

        int min= yeniArr [0];

        for (int i = 0; i <yeniArr.length ; i++) {
            if (yeniArr [i]<min){
                min=yeniArr[i];

            }

        }

        System.out.println(min);

        /*
        Bir int[] array oluştur → {5, 1, 4, 1, 5}

Bu array’de kaç tane 1 olduğunu bul

Sonucu ekrana yazdır
         */

        int [] one= {5,1,4,1,5};

        int count=0;

        for (int each  :one ) {

            if (each==1){
                count++;
            }

        }

        System.out.println(count);

/*
Bir int[] array oluştur → {2, 4, 6, 8}

Tüm elemanları 2 artır

Güncellenmiş array’i ekrana yazdır
 */



        int [] sayilar={2,4,6,8};

        for (int i = 0; i <sayilar.length ; i++) {

            sayilar [i]+=2;


        }

        System.out.println(Arrays.toString(sayilar));



        /*
        Bir int[] array oluştur → {1, 2, 3}

Bu array’i Arrays.asList ile bir listeye çevir

Listenin 0. indeksine 10 koy (set kullan)

Sonra array’i ekrana yazdır
         */


        Integer [] numbers= {1,2,3};

        List<Integer> newNumbers =Arrays.asList(numbers);


        newNumbers.set(0,10);

        System.out.println(Arrays.toString(numbers));
    }
}
