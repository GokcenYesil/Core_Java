package K12_metodOlusturma;

import java.util.Scanner;

public class P01_Parse {

    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı al.
Bu sayıları Scanner + nextLine ile alıp parse ederek topla.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen toplamak istediğiniz ilk sayıyı girin: ");

        String sayi1= scanner.nextLine();

        System.out.println("Lutfen toplamak istediğiniz ikinci sayıyı girin: ");
        String sayi2= scanner.nextLine();



         int a = Integer.parseInt(sayi1);
         int b = Integer.parseInt(sayi2);

        System.out.println("Verdiğiniz sayıların toplamı: "+(a+b));


        /*



        Kullanıcıdan bir sayı al.
Sayının çift mi tek mi olduğunu yazdır.
         */

        System.out.println("Lutfen bir tamsayi sayıyı girin: ");

        String number= scanner.nextLine();

        int x = Integer.parseInt(number);



        if  (x==0){
            System.out.println("Lutfen sıfırdan farklı bir sayı giriniz...");


        } else if (x%2!=0) {
            System.out.println("Girdiğiniz sayı bir tek sayıdır");

        }else if (x%2==0){

            System.out.println("Girdiğiniz sayı bir çift sayıdır");
        }

        /*


        do-while ile
        Kullanıcıdan bir sayı al.
Sayının çift mi tek mi olduğunu yazdır.
         */

        int y;

        do {

            System.out.println("Lutfen pozitif bir tamsayi sayıyı girin: ");
            String num = scanner.nextLine();
            y= Integer.parseInt(num);


        }while (y<0);


        if (y%2!=0) {
            System.out.println("Girdiğiniz sayı bir tek sayıdır");

        }else {

            System.out.println("Girdiğiniz sayı bir çift sayıdır");
        }





    }
}
