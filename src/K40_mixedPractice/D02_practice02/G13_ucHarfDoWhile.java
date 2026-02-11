package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G13_ucHarfDoWhile {

    public static void main(String[] args) {
         /*
        Kullanıcının 3 harften uzun bir kelime olması şartıyla dilediği kadar kelime
        girmesini isteyin.Bitirmek için 0'a basma koşulu ekleyin. girdiği tüm kelimelerin son beş harfini yanyana yazdırın.
        do while loop kullanın.

         */


        Scanner scanner = new Scanner(System.in);

        String kelime="";
        String sonuc="";

        do {
            System.out.println("Lutfen en az 3 harfli bir kelime girin,\nbitirmek için 0'a basın:");
            kelime= scanner.nextLine();

            if (kelime.equals("0")){
                break;
            }


            if (kelime.length()>=3){

                sonuc += kelime.substring(kelime.length()-3);

            }else {
                System.out.println("Lutfen sizden istenilen uzunlukta bir kelime girin...");
            }

        }while (true);



        System.out.println(sonuc);


    }
}
