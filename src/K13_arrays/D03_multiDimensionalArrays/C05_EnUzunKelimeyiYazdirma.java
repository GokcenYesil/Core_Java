package K13_arrays.D03_multiDimensionalArrays;

import java.util.Arrays;

public class C05_EnUzunKelimeyiYazdirma {


    public static void main(String[] args) {
        String[][] arr = { {"Ali","okula","git"},{"Merhabalar","arkadaslar"},{"Bu","is","olacak"}};


        // iki katli array'deki en uzun kelimeyi yazdirin

        String enUzunKelime="";

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr [i].length; j++) {

                if (arr[i][j].length() > enUzunKelime.length()) {

                    enUzunKelime= arr [i][j];


                }

            }

        }


        System.out.println("Arraydeki en uzun kelime: "+enUzunKelime);

    }
}
