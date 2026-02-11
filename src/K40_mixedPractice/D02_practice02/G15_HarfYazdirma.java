package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G15_HarfYazdirma {

    public static void main(String[] args) {




        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        int sayac =0;


        for (int i = 0; i <kelime.length() ; i++) {

            char chr = kelime.charAt(i);

            if (chr=='e'){
                sayac++;

            }

        }

        System.out.println("Girilen kelimede "+sayac+" adet"+ " 'e' harfi vardır.");


    }


}



