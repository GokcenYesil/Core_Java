package K10_loops;

import java.util.Scanner;

public class G21_aradakiSayilarinToplami {

    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangıç değeri olarak pozitif bir tamsayı giriniz:");
        int baslangic = scanner.nextInt();
        System.out.println("Lutfen bitiş değeri olarak pozitif bir tamsayı giriniz:");
        int bitis = scanner.nextInt();
        int toplam=0;

        if (bitis<baslangic){
            System.out.println("Bitiş değeri başlangıç değerinden küçük olamaz...");
        }else {

            for (int i = baslangic; i <=bitis ; i++) {

                toplam+=i;

            }
            System.out.println(baslangic + " ile " + bitis + " sayilari dahil olarak aralarindaki tamsayilarin toplami : " + toplam);
        }





    }
}
