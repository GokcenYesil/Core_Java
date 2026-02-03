package K33_maps.D03_bilgiUpdate;

import K33_maps.D01_bilgilereUlasma.C04_OgrenciMap;

import java.util.Scanner;

public class C03_YeniOgrenciEkleme extends C04_OgrenciMap {
    public static void main(String[] args) {


        // Kullanicidan numara, isim, soyisim, sinif, sube ve bolum bilgilerini alip
        // ogrenciyi map'e kaydeden bir method olusturun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ogrenci no girin: ");
        int ogrenciNo= scanner.nextInt();

        String ogrenciValue="";



        scanner.nextLine();
        System.out.println("Ogrenci ismini girin: ");
        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";

        System.out.println("Ogrenci soyismini girin: ");

        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";


        System.out.println("Ogrenci sınıfını girin: ");

        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";


        System.out.println("Ogrenci şubesini girin: ");
        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";

        System.out.println("Ogrenci bölümünü girin: ");
        ogrenciValue+=scanner.nextLine();

        ogrenciMap.put(ogrenciNo,ogrenciValue);

        System.out.println(C04_OgrenciMap.ogrenciMap);


    }
}
