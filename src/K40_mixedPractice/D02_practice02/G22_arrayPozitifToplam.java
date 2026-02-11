package K40_mixedPractice.D02_practice02;

public class G22_arrayPozitifToplam {
    public static void main(String[] args) {

        int[] arr = {-4,-6,7,2,5,-1,0,4,-5,8};

        int sayiToplami= sayiTopla(arr);

        System.out.println("Arraydeki pozitif sayıların toplamı: "+sayiToplami);


    }


    // Verilen bir array’deki pozitif tamsayilari toplayip
    // sonucu bize donduren bir method yaziniz.


    public static int sayiTopla (int [] arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {


            if (arr [i]>=0) {

                toplam+=arr [i];

            }

        }


        return toplam;

    }

}
