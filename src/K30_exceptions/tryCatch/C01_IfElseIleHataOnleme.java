package K30_exceptions.tryCatch;

import java.util.Scanner;

public class C01_IfElseIleHataOnleme {

    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin


        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi girin: ");


        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        if (sayi2!=0){

            System.out.println("Sayiların bölümü: "+(sayi1/sayi2));
        }else System.out.println("İkinci sayı sıfır olamaz");


        System.out.println("Kod normal olarak çalıştı... ");
    }



}
