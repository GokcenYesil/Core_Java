package K40_mixedPractice.D01_practice;

import java.util.Scanner;

public class G04_sifreKontrolu {
    public static void main(String[] args) {
        /*
         // Kullanicidan sifre olusturmak uzere sifre isteyin.
        // Sifreyi iki kere isteyin
        // eger metin ayni oldugu halde yazim farkliligi varsa
        // "Lutfen yazimi kontrol edin" yazdirin
        // Eger karakter farkliligi varsa
        // "Girilen sifreler farkli" yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz:");
        String sifre1= scanner.nextLine();
        System.out.println("Lutfen sifrenizi giriniz:");
        String sifre2= scanner.nextLine();

        if (sifre1.equalsIgnoreCase(sifre2)){
            System.out.println("Lutfen yazimi kontrol edin");

        }else {
            System.out.println("Girilen sifreler farkli");
        }

    }
}
