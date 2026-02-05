package K35_Week02_SampleJavaQuestions;

public class RG17_3SayidanEnKucukEnBuykBulma {

    public static void main(String[] args) {

         /*17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */


        double sonuc=enKucukSayiBulma(12,24,34);

        System.out.println(sonuc);

}

    public static double enKucukSayiBulma(double sayi1,double sayi2,double sayi3){

    double min = sayi1;

    if (sayi2<min){
        min =sayi2;
    }
    if (sayi3<min){
        min=sayi3;
    }
    return min;

}


}