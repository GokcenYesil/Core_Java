package K35_Week02_SampleJavaQuestions;

import java.util.Scanner;

public class RG12_StrBuyukHarfeCevirme {
    public static void main(String[] args) {
        /*12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        metin=metin.toUpperCase();


        System.out.println(metin);


    }
}
