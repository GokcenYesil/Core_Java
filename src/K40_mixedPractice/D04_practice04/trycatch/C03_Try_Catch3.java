package K40_mixedPractice.D04_practice04.trycatch;

import java.util.Scanner;

public class C03_Try_Catch3 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan negatif olmayan bir tamsayı index al

Bu index’i:

str için charAt

arr için array index
olarak kullan

İlgili harfi ve sayıyı yazdır

Exception Kuralları:

Kullanıcı:

String veya array sınırları dışı bir index girerse
→ Exception yakala
→ Şu bilgileri yazdır:

"Gecersiz index"

str ve arr için kullanılabilecek en büyük index

Program exception alsa bile çalışmayı bitirsin
Program sonlandi yazdır

         */

        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen indeks olarak pozitif bir tamsayi girin: ");
        int girilenSayi=scanner.nextInt();

        try {
            System.out.println("String için "+girilenSayi+".indeksteki eleman: "+str.charAt(girilenSayi));

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Gecersiz indeks"+" String için kullanılabilecek en büyük değer: "+(str.length()-1));

        }

        try {
            System.out.println("Array için "+girilenSayi+".indeksteki eleman: "+arr[girilenSayi]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Gecersiz indeks"+"Array için kullanılabilecek en büyük değer: "+(arr.length-1));

        }


        System.out.println("Program sonlandi");


    }
}
