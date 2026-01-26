package K10_loops;

import java.util.Scanner;

public class G06_faktoriyelYazdirma {

    public static void main(String[] args) {
        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 17 den küçük pozitif bir tamsayı giriniz:");
        int sayi = scanner.nextInt();

        int faktoriyelDegeri=1;


        System.out.print(sayi+"!"+"= ");


        for (int i = sayi; i>=2 ; i--) {

            faktoriyelDegeri *=i;

            System.out.print(i+" "+"*"+" ");

        }

        System.out.print(1+" "+"="+faktoriyelDegeri);



    }
}
