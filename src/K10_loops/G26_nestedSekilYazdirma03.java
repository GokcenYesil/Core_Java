package K10_loops;

import java.util.Scanner;

public class G26_nestedSekilYazdirma03 {

    public static void main(String[] args) {

         /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                0
                0 1
                0 1 2
                0 1 2 3
                0 1 2 3 4

         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen Satır Sayısı Giriniz: ");
        int satir = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j - 1 + " ");


            }
            System.out.println();
        }













    }
}
