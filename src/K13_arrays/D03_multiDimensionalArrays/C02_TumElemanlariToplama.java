package K13_arrays.D03_multiDimensionalArrays;

import java.util.Arrays;

public class C02_TumElemanlariToplama {

    public static void main(String[] args) {
        int[] sayilar = {3, 6, 9, 1};

        // array'in tum elementlerinin toplamini yazdirin



        int toplam =0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam+=sayilar[i];

        }
        System.out.println("Array'deki sayıların toplamı: "+toplam);

        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};
        
        

        // array'in tum elementlerinin toplamini yazdirin
     
        toplam=0;


        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];
                
            }
            
        }


        System.out.println("Array'in tum elementlerinin toplami: "+toplam);


    }
}
