package K34_Week01_SampleJavaQuestions;

import java.util.Scanner;

public class RG08_StrTerstenYazdirma {
    public static void main(String[] args) {
        /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String duzMetin = scanner.nextLine();


        for (int i =duzMetin.length()-1; i >=0 ; i--) {

            System.out.print(duzMetin.charAt(i));

        }
    }
}
