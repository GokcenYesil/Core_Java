package K05_wrapperClass;

import java.util.Scanner;

public class C05_Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci tamsayıyı giriniz: ");
        int sayi1 = scanner.nextInt();//25
        System.out.println("Lutfen ikinci tamsayıyı giriniz: ");
        int sayi2 = scanner.nextInt();//40

        int temp= 0;
        temp =sayi1;
        sayi1=sayi2;
        sayi2 =temp;

        System.out.println("Birinci sayının yeni değeri: " + sayi1);
        System.out.println("İkinci sayının yeni değeri:" + sayi2);


    }
}
