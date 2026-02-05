package K34_Week01_SampleJavaQuestions;

public class RG01_SayiDegerleriToplami {

    public static void main(String[] args) {

        /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */

        int sayi= 34;

        int birlerBasamagi= 0;
        int rakamlarToplami= 0;

        birlerBasamagi= sayi%10;//4
        rakamlarToplami=birlerBasamagi+rakamlarToplami;//4+0

        sayi=sayi/10;

        System.out.println("Sayının sayı değerleri toplamı: " + (rakamlarToplami + sayi));


    }
}
