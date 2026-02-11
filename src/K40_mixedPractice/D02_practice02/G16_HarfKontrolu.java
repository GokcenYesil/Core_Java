package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G16_HarfKontrolu {

    public static void main(String[] args) {
        //Bir kelimedeki her harfi kontrol et, eğer harf ‘o’ ise * yap, değilse kendisini ekle, yeni kelimeyi oluştur ve yazdır.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        String yeniKelime="";
        for (int i = 0; i <kelime.length() ; i++) {

            char harf = kelime.charAt(i);

            if (harf=='o'){

               yeniKelime+='*';
            }else {
                yeniKelime+=harf;

            }

        }


        System.out.println("Yeni kelime: "+yeniKelime);



    }


}
