package K16_forEach;

import java.util.Scanner;

public class C03_HarfKullanimSayisiniBulma {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cümlede aranacak harfi giriniz: ");

        String harf = scanner.nextLine().substring(0,1);

        String [] karakterler= cumle.split("");


        int sayac=0;

        for (String each:karakterler){

            if (each.equalsIgnoreCase(harf)){

                sayac++;

            }
        }
            if (sayac==0) {
                System.out.println("Harf cümlede kullanılmamıştır...");
            }else System.out.println("Aranan harf cümlede "+sayac+ " kez kullanılmıştır...");

    }
}
