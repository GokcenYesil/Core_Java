package K30_exceptions.tryCatch;


import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_tryCatchKullanim {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere tamsayilar isteyin
        // ve kullanici q veya Q'ya basincaya kadar islemi devam ettirin
        // Kullanici q'ya bastiginda
        // kac adet sayi girildigini ve toplamin ne oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);


        int toplam=0;
        int sayac=0;
        int girilenSayi=0;
        String girilenMetin="";



    while (!girilenMetin.equalsIgnoreCase("q")){

        System.out.println("Lutfen toplanmak uzere bir tamsayilar giriniz...\nBitirmek icin Q'ya basin");
        try {

            girilenSayi= scanner.nextInt();
            toplam+=girilenSayi;
            sayac++;

        }catch (InputMismatchException e){

            girilenMetin=scanner.nextLine();

            if (!girilenMetin.equalsIgnoreCase("q")){
                System.out.println("Lutfen girdiğiniz değerin Q veya tamsayı olduğundan emin olun...");

            }

        }

    }
        System.out.println("Girilen "+sayac+" adet sayının toplamı: "+toplam);

    }

    }

