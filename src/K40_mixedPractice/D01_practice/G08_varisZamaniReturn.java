package K40_mixedPractice.D01_practice;

import java.util.Scanner;

public class G08_varisZamaniReturn {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ortalama hızınız km/sa cinsinden giriniz:");
        double hiz= scanner.nextDouble();
        System.out.println("Lutfen yolun mesafesini km cinsinden giriniz:");
        double yol = scanner.nextDouble();

        int varisZamani=varisSaati(hiz,yol);

        System.out.println("Ortalama " + hiz + " km"+" ile " + varisSaati(hiz, yol) + " saat sonra varırsınız");

    }


    public static int varisSaati(double hiz,double yol){

        return (int)(yol/hiz);






    }
}
