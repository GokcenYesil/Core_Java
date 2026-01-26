package K10_loops;

import java.util.Scanner;

public class G12_aradakiSayilarinToplami2 {
    public static void main(String[] args) {
        //  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //  sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //  Bitis degeri baslangic degerinden kucuk olsa da program calissin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangıç değeri olarak pozitif bir tamsayı giriniz:");
        int baslangic = scanner.nextInt();
        System.out.println("Lutfen bitiş değeri olarak pozitif bir tamsayı giriniz:");
        int bitis = scanner.nextInt();
        int toplam = 0;

        if (baslangic < bitis) {

            for (int i = baslangic; i <= bitis; i++) {

                toplam += i;

            }


        } else {
            for (int i = baslangic; i >= bitis; i--) {

                toplam += i;
            }


            System.out.println(baslangic + " ile " + bitis + " sayilari dahil olarak aralarindaki tamsayilarin toplami : " + toplam);


        }
    }
}
