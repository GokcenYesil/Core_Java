package K10_loops;

import java.util.Scanner;

public class G17_nestedGunlerVeDersler {

    public static void main(String[] args) {
        /*
    Bir okulda:

Kaç gün ders olduğunu kullanıcıdan al

Her gün kaç ders olduğunu kullanıcıdan al

Sonra şu formatta ekrana yaz:

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç gün ders olduğunu girin:");
        int gunSayisi = scanner.nextInt();
        System.out.println("Günlük ders sayısını girin:");
        int dersSayisi = scanner.nextInt();


        for (int gun = 1; gun <=gunSayisi ; gun++) {//outer
            System.out.println("\nGün"+gun+ "-");

            for (int ders = 1; ders <=dersSayisi ; ders++) {

                System.out.println("     Ders"+ders+" :");



            }
            System.out.println();
        }




























    }
}
