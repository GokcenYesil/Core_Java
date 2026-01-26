package K11_whileLoop;

import java.util.Scanner;

public class W04_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin: ");
        int girilenSayi= scanner.nextInt();


        int sayi= girilenSayi;
        int rakamlarToplami=0;


        while (sayi>0){

            rakamlarToplami+=sayi%10;// rakamlar toplami= sayi%10+rakamlar toplamı
            sayi/=10;


        }


        System.out.println("Girilen "+girilenSayi+" sayısının rakamlar toplamı: "+rakamlarToplami);

    }

}


