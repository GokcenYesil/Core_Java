package K10_loops;

import java.util.Scanner;

public class G27_NestedApartmanDaire {
    public static void main(String[] args) {

        /*
        Bir apartmanda:

Kaç kat olduğunu kullanıcıdan al

Her katta kaç daire olduğunu kullanıcıdan al

Sonra şu formatta yazdır:

1. Kat:
   Daire 1
   Daire 2
   Daire 3

2. Kat:
   Daire 1
   Daire 2
   Daire 3
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Apartmanda kaç kat olduğunu girin:");
        int floor = scanner.nextInt();
        System.out.println("Her kattaki daire sayısını girin:");
        int apartment = scanner.nextInt();


        for (int i = 1; i <=floor; i++) {


            System.out.println(i+"."+"kat: ");




            for (int j = 1; j <=apartment ; j++) {

                System.out.println("      Daire "+j);




            }
            System.out.println();
        }





    }
}
