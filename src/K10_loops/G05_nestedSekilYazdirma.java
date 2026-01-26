package K10_loops;

import java.util.Scanner;

public class G05_nestedSekilYazdirma {

    public static void main(String[] args) {

         /*

        kullanicidan satir ve sutun sayisini alip asagidaki sekli cizdirin
        orn satir = 3 , sutun= 6 oldugunda

                * * * * * *
                * * * * * *
                * * * * * *

         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen Satır Sayısı Giriniz: ");
        int satir = scanner.nextInt();
        System.out.println("Lutfen Sütun Sayısı Giriniz: ");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {

                System.out.print("*" + " ");


            }
            System.out.println();
        }









    }
}
