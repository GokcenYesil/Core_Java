package K13_arrays;

import java.util.Arrays;

public class C09_MethodlariKullanma {
    public static void main(String[] args) {

        int[] sayilar = {1,3,5,8,91};


   sayilar =(C05_TumElementleriArtirma.arrayinElemanlariniArtir(sayilar, 5));

        System.out.println(Arrays.toString(sayilar));

        System.out.println(C06_PozitifElementlerinToplami.pozitifElementlerinToplami(sayilar));


       int[] kullaniciArr=C08_KullaniciyaArrayOlusturtma.integerArrayOlustur();

        System.out.println();

        System.out.println(Arrays.toString(kullaniciArr));

    }
}
