package K40_mixedPractice.D01_practice;

public class G03_fiyatToplami03 {

    public static void main(String[] args) {

        /*
input1: "€ 14.75"
input2: "19.25 €"

Görev:

Para birimini, sayıdan bağımsız şekilde tespit edin.

Sadece sayı bölümünü alarak toplayın.

Sonucu tek bir kez para biriminden sonra yazdırın.

         */



        String input1="€ 14.75";
        String input2="19.25 €";

        //input2 den para birimini al

        char currency = input2.charAt(input2.length()-1);


        //para birimi digitlerden ve noktadan ayır

        input1=input1.replaceAll("[^\\d.]","");//14.75
        input2=input2.replaceAll("[^\\d.]","");//19.25

        double fiy1= Double.parseDouble(input1);
        double fiy2= Double.parseDouble(input2);


        double toplam = fiy1+fiy2;

        System.out.println("Fiyatların toplamı:" + toplam +" "+currency);


    }
}
