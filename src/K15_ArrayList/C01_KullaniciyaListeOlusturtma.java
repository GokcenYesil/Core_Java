package K15_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullaniciyaListeOlusturtma {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        // bir method olusturun.


        List<String> yeniListe= stringListeOlustur();


        System.out.println("Yeni liste"+yeniListe);
    }


    public static List<String> stringListeOlustur (){


        List<String> isimler = new ArrayList<>();



        Scanner scanner = new Scanner(System.in);


        String girilenIsim="";

         do {
             System.out.println("Lutfen listeye eklenmek üzere bir isim giriniz");
                girilenIsim= scanner.nextLine();

             if (!girilenIsim.equalsIgnoreCase("q")){

                 isimler.add(girilenIsim);
             }


         }while (!girilenIsim.equalsIgnoreCase("q"));

        return isimler;
    }


}
