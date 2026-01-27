package K13_arrays.D03_multiDimensionalArrays;

import java.util.Arrays;

public class C03_TumElementleriGozdenGecirme {

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 19}};


        // arr'deki cift sayilarin toplamini yazdirin


        int ciftSayilarinToplami = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {

                    ciftSayilarinToplami += arr[i][j];

                }


            }

        }
        System.out.println("Array'deki çift sayıların toplamı: " + ciftSayilarinToplami);


        // arr'deki tek sayilardan en buyuk olani yazdirin
        // { {2,3,7},{3,5},{4},{1,2,3,6,8} }

        int enBuyukTekSayi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length
                    ; j++) {
                if (arr[i][j] % 2 != 0 && arr[i][j] > enBuyukTekSayi) {
                    enBuyukTekSayi = arr[i][j];


                }

            }

        }


        System.out.println("Array'deki en büyük tek sayı: " + enBuyukTekSayi);

        // arr'deki tum sayilari 1 artirin
        // { {2,3,7},{3,5},{4},{1,2,3,6,8} }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length
                    ; j++) {

                arr[i][j] += 1;


            }

        }

        System.out.println(Arrays.deepToString(arr));


        // arr'deki tum tek sayilari ve cift sayilari ayri ayri toplayip
        // ciftSayilarToplami - tekSayilarToplamini yazdirin
        //[[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 20]]


        int tekSayilarinToplami = 0;
        ciftSayilarinToplami = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length
                    ; j++) {

                if (arr[i][j] % 2 == 0) {
                    ciftSayilarinToplami += arr[i][j];


                } else if (arr[i][j] % 2 == 1) {

                    tekSayilarinToplami += arr[i][j];

                }


            }

        }

        System.out.println("Array'deki Cift sayilarin toplami ile tek sayilarin toplaminin farki: " +

                (ciftSayilarinToplami - tekSayilarinToplami));

    }
}