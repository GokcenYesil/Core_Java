package K05_wrapperClass;

import java.util.Scanner;

public class C02_Modulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi<=0){
            System.out.println("Hatalı giriş.Lütfen pozitif bir tamsayi girin: ");
        }else {
            System.out.println("Girilen sayının birler basamağı: " + (sayi % 10));
        }


    }
}
