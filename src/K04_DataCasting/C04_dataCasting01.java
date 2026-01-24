package K04_DataCasting;

import java.util.Scanner;

public class C04_dataCasting01 {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // sayilari birbirine bolup, islem sonucunu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi girin: ");
        int sayi = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println("Girilen sayilarin bolumu:"+(double)(sayi/sayi2));
        // NOT : Java'da iki tamsayiyi birbirine bolerseniz
        //       Java islem sonucunun tamsayi kismini alir

        // NOT : bir tamsayiyi 10'a bolersek, birler basamagini silmis oluruz


    }

}
