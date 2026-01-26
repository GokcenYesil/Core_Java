package K10_loops;

import java.util.Scanner;

public class G25_Asalmi {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi girin: ");
        int sayi= scanner.nextInt();


        for (int i = 2; i < sayi; i++) {


            if (sayi % i == 0) {
                System.out.println("Verilen " + sayi + " sayisi asal degil");
                break;
            }

            if (i == sayi - 1) {

                System.out.println("Verilen " + sayi + " sayisi asal");
            }


        }
    }
}
