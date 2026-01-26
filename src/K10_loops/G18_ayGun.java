package K10_loops;

import java.util.Scanner;

public class G18_ayGun {

    public static void main(String[] args) {
        /*
        Kullanıcıdan:

Kaç ay olduğunu girsin

Her ay kaç gün olduğunu girsin

Sonra şu formatta yazdır:

1. Ay:
   Gün 1
   Gün 2
   Gün 3

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ay sayısını girin:");
        int ay = scanner.nextInt();
        System.out.println("Gün sayısını girin:");
        int gun = scanner.nextInt();


        for (int i = 1; i <=ay ; i++) {

            System.out.println(i+"."+" Ay : ");

            for (int j = 1; j <=gun ; j++) {
                System.out.println("      Gün"+" "+j);

            }
            System.out.println();
        }





    }
}
