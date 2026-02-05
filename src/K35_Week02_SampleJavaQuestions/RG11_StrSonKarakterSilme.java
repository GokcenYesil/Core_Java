package K35_Week02_SampleJavaQuestions;

import java.util.Scanner;

public class RG11_StrSonKarakterSilme {
    public static void main(String[] args) {


        /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();



        String yeniMetin= metin.substring(0,metin.length()-1);

        System.out.println(yeniMetin);

    }





}
