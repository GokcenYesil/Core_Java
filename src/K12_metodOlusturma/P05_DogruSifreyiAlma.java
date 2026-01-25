package K12_metodOlusturma;

import java.util.Scanner;

public class P05_DogruSifreyiAlma {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin
        // C07'daki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin

        Scanner scanner = new Scanner(System.in);
        String sifre="";
        boolean sifreGecerliMi= false;


        for (int i = 1; i <10000 ; i++) {

            System.out.println("Lutfen şifrenizi girin:");
            sifre= scanner.nextLine();

            sifreGecerliMi= P04_sifreKontrol.sifreGecerliMi(sifre);

            if (sifreGecerliMi==true){

                System.out.println(i + " denemede gecerli şifre girdiniz");
                break;

            }

        }







    }
}
