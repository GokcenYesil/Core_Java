package K13_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeKullanma {

    public static void main(String[] args) {


// 4 int deger koyabilecegimiz sayilar array'i olusturun

    int []sayilar = new int[4];



// 5 isim koyabilecegimiz bir array olusturun

    String [] isimler = new String[5];



// 2 boolean deger koyabilecegimiz bir array olusturun

    boolean [] bl= new boolean[2];


// icinde 56,67,23,97 degerlerinin oldugu notlar array'i olusturun
    int [] notlar = {56,67,23,97};


// icinde mevsim isimlerinin oldugu mevsimler array'i olusturun

    String  [] mevsimler = {"İlkbahar","Yaz","Sonbahar","Kış"};



// notlar array'indeki 23'u yazdirin

        System.out.println(notlar[2]);


// mevsimlerden Kis'i yazdirin
        System.out.println(mevsimler[3]);


// sayilar array'indeki ilk elementi yazdirin
        System.out.println(sayilar[0]);


// isimler array'indeki 2.elementi yazdirin
        System.out.println(isimler[1]);


// notlar array'indeki 2.sayiyi 45 yapin
        notlar [1]=45;


// isimler array'ini yazdirin
    isimler [0]="Mahmut";



// sayilar array'ini yazdiralim

        System.out.println(Arrays.toString(sayilar));


// notlar array'ini yazdiralim

        System.out.println(Arrays.toString(notlar));

        //mevsimler arrayinin 5.elementini yazdırın.


        try {
            System.out.println(mevsimler[5]);


        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("5.indekste eleman yok");
        }
        System.out.println(Arrays.toString(isimler));
    }
}
