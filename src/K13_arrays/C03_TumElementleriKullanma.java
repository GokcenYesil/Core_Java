package K13_arrays;

import java.util.Arrays;

public class C03_TumElementleriKullanma {

    public static void main(String[] args) {



        int[] sayilar = {4,7,1,3,4,8,0,1};


        // sayilar array'ini yazdirin
        System.out.println(Arrays.toString(sayilar));


// sayilar array'inin tum elementlerini yan yana yazdirin

        for (int i = 0; i <sayilar.length ; i++) {

            System.out.print(sayilar[i] + " ");

        }
        System.out.println();
// sayilar array'indeki tum elementlerin toplamini yazdirin

        int toplam=0;

        for (int i = 0; i <sayilar.length ; i++) {

            toplam+=i;


        }
        System.out.print("Dizideki sayıların toplamı: "+toplam);

        System.out.println();

// sayilar array'indeki cift sayilarin carpimini yazdirin

        int carpim=1;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]%2==0){

                carpim*=sayilar[i];
            }

        }
        System.out.print("Dizideki sayıların çarpımı: "+carpim);







    }
}
