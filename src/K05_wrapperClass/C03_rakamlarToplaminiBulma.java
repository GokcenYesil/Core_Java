package K05_wrapperClass;

import java.util.Scanner;

public class C03_rakamlarToplaminiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        // input data  : 526
        //output data : 13

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi= sayi %10;//6
        rakamlarToplami = birlerBasamagi+rakamlarToplami;
        sayi = sayi/10;

        birlerBasamagi= sayi %10;//2
        rakamlarToplami= birlerBasamagi+rakamlarToplami;
        sayi = sayi/10;//5
        rakamlarToplami= rakamlarToplami+sayi;

        System.out.println("Verilen sayının rakamları toplamı: " + rakamlarToplami);


    }
}
