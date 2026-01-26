package K10_loops;

import java.util.Scanner;

public class G07_forLoopRakamlarToplami {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayı giriniz:");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami=0;

        int basamakSayisi =(""+girilenSayi).length();

        int sayi = girilenSayi;




        for (int i = 1; i <=basamakSayisi ; i++) {

            rakamlarToplami+=sayi%10;
            sayi/=10;

        }


        System.out.println("Girilen " + girilenSayi +
                            " sayısının rakamlar toplamı = " +
                            rakamlarToplami);


    }
}
