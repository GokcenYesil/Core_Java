package K09_ifElseStatement;

import java.util.Scanner;

public class C06_KucukHarfDegistirme {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir karakter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        if (Character.isLowerCase(karakter)){
            System.out.println(Character.toUpperCase(karakter));

        }else System.out.println(karakter);

    }
}
