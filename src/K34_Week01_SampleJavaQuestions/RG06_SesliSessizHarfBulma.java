package K34_Week01_SampleJavaQuestions;

import java.util.Scanner;

public class RG06_SesliSessizHarfBulma {
    public static void main(String[] args) {

        /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!



    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz:");
        String harf = scanner.nextLine();

        char chr =harf.charAt(0);
        String sesliHarfler= "aeıiouöüAEIİOUÖÜ";

        if (harf.length()>1 ||!Character.isLetter(chr)){
            System.out.println("Hatalı giriş. Lutfen tek bir harf girin...");
        } else if (sesliHarfler.indexOf(chr)!=-1) {
            System.out.println("Girdiğiniz karakter sesli harftir");

        }else {
            System.out.println("Girdiğiniz karakter sessiz harftir");

        }


    }




    }

