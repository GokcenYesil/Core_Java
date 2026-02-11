package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G18_CharDegiskenKontrolu {

    public static void main(String[] args) {
        /*
        Soru 13-) Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
   Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
   Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
   Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
   Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen a, b veya c girin: ");
        char chr = scanner.next().charAt(0);
        
        
        switch (chr){

            case 'a':
                System.out.print("İsteğiniz işleniyor");
                break;

            case 'b':
                System.out.print("Değerlendirmeniz için teşekkür ederiz");
                break;

            case 'c':
                System.out.print("Üzgünüm şuanda yardımcı olamıyoruz");
                break;

            default:
                System.out.print("Geçersiz giriş, lütfen tekrar deneyin");


        }

    }
}
