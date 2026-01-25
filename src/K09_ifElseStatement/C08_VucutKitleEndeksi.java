package K09_ifElseStatement;

import java.util.Scanner;

public class C08_VucutKitleEndeksi {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen kilonuzu girin:");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu cm cinsinden girin");
        double boy =scanner.nextDouble();
        double sonuc = kilo*10000/(boy*boy);
        
        if (sonuc>30) {
            System.out.println("Obez");
        } else if (sonuc > 25) {
            System.out.println("kilolu");
        } else if (sonuc>20) {
            System.out.println("normal");
        }else System.out.println("zayıf");

        }
    }
