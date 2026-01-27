package K14_ArrayClassMetodlari;

import java.util.Arrays;

public class C05_ArrayeYeniElemanEkleme {


    public static void main(String[] args) {


        // Verilen int bir array'e istenen bir elemani ekleyip
        // son halini donduren bir method olusturun



       int[]arr = {3,5,6,2,1};




       arr=arrayeYeniElemanEkleme(arr,8);

        System.out.println(Arrays.toString(arr));

        arr=arrayeYeniElemanEkleme(arr,15);

        System.out.println(Arrays.toString(arr));




    }



    public static int[] arrayeYeniElemanEkleme(int[]arr,int eklenecekEleman){


            int[] yeniArr= new int[arr.length+1];


        for (int i = 0; i <arr.length ; i++) {


            yeniArr[i]=arr[i];

        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;

        arr=yeniArr;


        return arr;

    }
}
