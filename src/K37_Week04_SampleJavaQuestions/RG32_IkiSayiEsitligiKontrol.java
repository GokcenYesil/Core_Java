package K37_Week04_SampleJavaQuestions;

import java.util.Objects;

public class RG32_IkiSayiEsitligiKontrol {

    public static void main(String[] args) {
        /*32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true

    */
        System.out.println(esitMi(5, 7));
        System.out.println(esitMi(5, 5));

    }


    public static boolean esitMi (Integer num1 ,Integer num2) {


       return Objects.equals(num1,num2);



    }

}
