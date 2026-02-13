package K40_mixedPractice.D04_practice04.methods;

import M04_mentoring.week04.Array2ElemaninToplamindanOlusanSayilar;
import M04_mentoring.week04.RG36_AsalSayi;
import M04_mentoring.week04.RG37_KonusmaDiliniHackerDilineCevirme;

import java.util.Arrays;

public class C03_MethodKullanmaClassi {

    public static void main(String[] args) {
        C01_ChatgptCokluSorular.ekranaMerhabaYaz();



C01_ChatgptCokluSorular.karesiniyazdir(4);

        System.out.println(C01_ChatgptCokluSorular.buyukOlaniDondur(5, 7));
    int dondur= C01_ChatgptCokluSorular.buyukOlaniDondur(7,8);

        System.out.println(dondur);

        System.out.println(C01_ChatgptCokluSorular.birdenNyeToplam(-5));
        System.out.println(C01_ChatgptCokluSorular.birdenNyeToplam(5));

        System.out.println(C01_ChatgptCokluSorular.ilkVeSonHarf(""));

        System.out.println(C01_ChatgptCokluSorular.ciftMi(6));
        System.out.println(C01_ChatgptCokluSorular.sesliHarfSayisi("JAVA CANDIR"));

        int [] arr= {1,88,19,-2};

        System.out.println("Arraydeki en büyük eleman: "+ C01_ChatgptCokluSorular.enBuyukEleman(arr));
        System.out.println("Arraydeki en küçük eleman: "+ C01_ChatgptCokluSorular.enKucukEleman(arr));

        System.out.println("Arraydeki tek sayıların toplamı: "+ C01_ChatgptCokluSorular.tekSayilariTopla(arr));

       int [] sonuc=Array2ElemaninToplamindanOlusanSayilar.elemanToplami(2,3);

        System.out.println(Arrays.toString(sonuc));


        System.out.println(RG36_AsalSayi.asalMi(17));
        System.out.println(RG37_KonusmaDiliniHackerDilineCevirme.konusmaDiliniHackerDilineCevir("javayı severim"));


    }
}
