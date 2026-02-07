package K36_Week02_SampleJavaQuestions;

import java.util.Arrays;

public class RG22_ArraydekiSayilarinOrtalamasiniBulma {
    public static void main(String[] args) {



    /*22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.*/



        //Array =  [20, 30, 25, 35, -16, 60, -100 ]



        int [] sayilar= new int[7];

        double ortalama=0;

        int toplam=0;

        sayilar [0]=20;
        sayilar [1]=30;
        sayilar [2]=25;
        sayilar [3]=35;
        sayilar [4]=-16;
        sayilar [5]=60;
        sayilar [6]=-100;


        System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar [i];

            ortalama= toplam/sayilar.length;


        }

        System.out.println("Arraydeki sayıların ortalaması:"+ortalama);

        }


    }

