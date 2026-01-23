package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C04_CemberinCevresi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen çember yarıçapı giriniz: ");

        double yariCap = scanner.nextDouble();
        double pi = 3.14;

        System.out.println("Cemberin alanı: " + (pi * yariCap * yariCap));

        System.out.println("Cemberin çevresi: " + (pi * yariCap * 2));


    }
}
