package K14_ArrayClassMetodlari;

import K13_arrays.C09_EnUzunVeEnKisaKelime;

import java.util.Arrays;

public class C03_split {

    public static void main(String[] args) {

        String str = "Java öğrenmek gün geçtikçe eğlenceli hale geliyor";


        // cumledeki en kisa ve en uzun kelimeyi yazdirin


        String[] kelimeler= str.split(" ");

        System.out.println(Arrays.toString(kelimeler));

        C09_EnUzunVeEnKisaKelime.enUzunEnKisaKelimeBul(kelimeler);


    }
}
