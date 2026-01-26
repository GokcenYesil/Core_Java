package K10_loops;

import java.util.Scanner;

public class G24_tersMetniKaydetme {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin girin: ");
        String metin = scanner.nextLine();

        StringBuilder tersMetin= new StringBuilder();

        for (int i =metin.length()-1; i >=0 ; i--) {

            tersMetin.append(metin.charAt(i));


        }
        System.out.println("metnin tersten yazılışı: "+tersMetin);

        // girilen metnin bir palindrome olup olmadigini yazdirin
        // palindrome duz yazilisi ve ters yazilisi ayni olan metinler
        // madam , adanada, 1236321

        if (metin.equalsIgnoreCase(tersMetin.toString())){
            System.out.println("Girilen metin bir palindrome");
        }else {
            System.out.println("Girilen metin bir palindrome değil");
        }













    }
}
