package K34_Week01_SampleJavaQuestions;

import java.util.Scanner;

public class RG10_KelimeBulma {
    public static void main(String[] args) {
        /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();
        System.out.println("Lutfen bir metinde aranacak kısmı giriniz:");
        String text = scanner.nextLine();

        System.out.println(metin.contains(text));


    }
}
