package K38_Week05_SampleJavaQuestions;

import java.util.Scanner;

public class RG45_EmailKontrol {
    public static void main(String[] args) {
            /*45-----
    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanıcı bir mail lutfen ");

        String str= scan.nextLine();

        System.out.println(emailKontrol(str));
    }

    public static boolean emailKontrol(String str) {
        boolean sonuc=false;
        if (str.contains("@") && str.contains(".") && str.charAt(0)!='@' ) {
            sonuc=true;
        }
        return sonuc;

    }
}
