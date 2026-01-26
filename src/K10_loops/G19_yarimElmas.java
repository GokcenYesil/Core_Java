package K10_loops;

import java.util.Scanner;

public class G19_yarimElmas {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yarım elmas için yükselik girin:");
        int h= scanner.nextInt();


        for (int i = 1; i <=h ; i++) {//outer


            //herbir satır/sütundaki boslukları bulmada formül h-i/inner
            for (int b = 1; b <=h-i ; b++) {// 1<=4-1   4<=3

                System.out.print(" ");

            }//her bir satır/sütundaki yıldızları bulmada formül 2*i-1/inner
            for (int y = 1; y <=2*i-1 ; y++) {

                System.out.print("*");

            }
            System.out.println();
        }


        for (int i = h-1; i >=1 ; i--) {

            for (int b = 1; b <=h-i ; b++) {
                System.out.print(" ");

            }
            for (int y =1 ; y <=2*i-1 ; y++) {
                System.out.print("*");

            }System.out.println();
        }

    }
}
