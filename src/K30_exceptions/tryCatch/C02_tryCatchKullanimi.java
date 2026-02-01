package K30_exceptions.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatchKullanimi {
    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin


        boolean calismayaDevamEdeyimMi=true;


        while (calismayaDevamEdeyimMi){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Lutfen iki tamsayi girin: ");

            int sayi1=0;
            int sayi2=0;

            try {

                sayi1=scanner.nextInt();
                sayi2=scanner.nextInt();


                if (sayi2!=0){

                    System.out.println("Sayıların bölümü: "+(sayi1/sayi2));
                    calismayaDevamEdeyimMi =false;

                }else System.out.println("İkinci sayı sıfır olamaz ");

            }catch (InputMismatchException e){
                System.out.println("Lutfen girdiğiniz değerin tamsayi olup olmadığını kontrol edin...");

            }

        }
        System.out.println("Kod normal çalıştı");
    }
}
