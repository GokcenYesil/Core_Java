package K37_Week04_SampleJavaQuestions;

public class RG36_AsalSayi {
    public static void main(String[] args) {
         /*36-----
    Bir sayı asal olup olmadığını kontrol eden bir Java Methodu yazınız.

    Test Data:

    isPrime(31)
    true

    isPrime(18)
    false
    */

    }
public static boolean asalMi (int sayi){


    for (int i = 2; i <sayi ; i++) {

        if (sayi%i==0){
            return false;
        }

    }return true;
}




}