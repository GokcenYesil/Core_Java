package K09_ifElseStatement;

import java.util.Scanner;

public class C04_SinifNotu {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan notunu alin
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ders notunuzu giriniz: ");
        double not = scanner.nextDouble();

        if (not>=50){
            System.out.println("Sınıfı geçtin");

        }else System.out.println("Maalesef kaldın");
    }
}
