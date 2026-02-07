package K37_Week04_SampleJavaQuestions;

public class Array2ElemaninToplamindanOlusanSayilar {
    public static void main(String[] args) {
     /*35----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.

    Test Data:
    arrayOfMultiples(7, 5)

    sonuç: [7,14,21,28,35]
    */

    }

public static int [] elemanToplami (int x,int y){

int [] sayilar= new int[y];

    for (int i = 0; i <y ; i++) {

        sayilar [i]=x*(i+1);

    }
      return sayilar;
    }

public static int[] arrayOfMultiples(int num, int length) {

    int[] arr = new int[length];

    for (int i = 0; i < length; i++) {
        arr[i] = num * (i + 1);
    }

    return arr;
}








}
