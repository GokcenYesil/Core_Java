package K10_loops;

import java.util.Scanner;

public class G23_nestedSekilYazdirma02 {

    public static void main(String[] args) {



    /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                *
                * *
                * * *
                * * * *
                * * * * *

         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen Satır Sayısı Giriniz: ");
        int satir = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("*" + " ");


            }
            System.out.println();
        }


    }


}
