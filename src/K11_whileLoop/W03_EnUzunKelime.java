package K11_whileLoop;

import java.util.Scanner;

public class W03_EnUzunKelime {


    // asagidaki gorevi yapan bir method olusturun

    // kullanicidan istedigi kadar isim girmesini isteyin
    // kullanici islemi bitirmek icin Q'ya basmalidir (q veya Q olabilir)
    // girilen her ismin uzunlugunu kontrol edin ve
    // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin
    // esit sayida harfe sahip isimlerden herhangi biri olabilir


    public static void main(String[] args) {
        enUzunKelimeBulma();

    }//main  bitişi



    public static void enUzunKelimeBulma(){

        Scanner scanner = new Scanner(System.in);

        String enteredWord="";
        String longestWord="";

        while (!(enteredWord.equals("q")||enteredWord.equals("Q"))){

            System.out.println("Lutfen en uzun ismi bulmak icin, bir isim giriniz," +
                    "\nBitirmek icin Q'ya basiniz");

            enteredWord=scanner.nextLine();

            if (enteredWord.length()>longestWord.length()){

                longestWord=enteredWord;

            }



        }

        System.out.println("Girilen kelimelerden en uzun olanı: " + longestWord);

    }

}
