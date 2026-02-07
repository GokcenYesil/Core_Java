package K37_Week04_SampleJavaQuestions;

import java.util.Arrays;

public class RG33_ArrayTersCevirme {
    public static void main(String[] args) {
      /*33-----
    Bir arrayi tersine çeviren  method yazınız.

    Test Data:

    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    */


int [] sayilar= {1,2,3,4};

int []tersSayilar=arrayiTersCevir(sayilar);

        System.out.println(Arrays.toString(tersSayilar));


    }

    public static int [] arrayiTersCevir (int []arr ) {

        int[] tersMetin = new int[arr.length];
        int index = 0;


        for (int i = arr.length - 1; i >= 0; i--) {

            tersMetin[index] = arr[i];
            index++;

        }
    return tersMetin;
    }
}