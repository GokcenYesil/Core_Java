package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G12_ucHarfWhile {
    public static void main(String[] args) {

        /*
        Kullanıcının 3 harften uzun bir kelime olması şartıyla dilediği kadar kelime
        girmesini isteyin.Bitirmek için 0'a basma koşulu ekleyin. girdiği tüm kelimelerin son üç harfini yanyana yazdırın.
        while loop kullanın.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen en az 3 harfli bir kelime girin,\nbitirmek için 0'a basın: ");
        String kelime = scanner.nextLine();

        kelime="";
        String sonuc="";

       while (!kelime.equals("0")){

           if (kelime.length()>=3){

               sonuc+=kelime.substring(kelime.length()-3);
           }else {
               System.out.println("Lutfen sizden istenilen uzunlukta bir kelime girin...");
           }

           System.out.println("Lutfen en az 3 harfli bir kelime girin,\nbitirmek için 0'a basın: ");
           kelime=scanner.nextLine();
       }

        System.out.println(sonuc);





    }






}
