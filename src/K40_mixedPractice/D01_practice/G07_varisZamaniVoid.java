package K40_mixedPractice.D01_practice;

import java.util.Scanner;

public class G07_varisZamaniVoid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ortalama hızınız km/sa cinsinden giriniz:");
        double hiz= scanner.nextDouble();
        System.out.println("Lutfen yolun mesafesini km cinsinden giriniz:");
        double yol = scanner.nextDouble();

        varisZamani(hiz,yol);

    }

    public static void varisZamani(double hiz, double yol){

        double varisSuresi=yol/hiz;

        System.out.println("Ortalama "+hiz+" ile "+varisSuresi+" saat sonra varırsınız");


    }

}
