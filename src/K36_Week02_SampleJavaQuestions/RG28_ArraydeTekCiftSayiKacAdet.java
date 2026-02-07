package K36_Week02_SampleJavaQuestions;

public class RG28_ArraydeTekCiftSayiKacAdet {
    public static void main(String[] args) {


        /*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */


        int [] numbers= {1,2,3,4,5,6,7,8,9};
        int countCift=0;
        int countTek=0;

        for (int i = 0; i < numbers.length ; i++) {

            if (numbers[i]%2==0){

            countCift++;

            } else if (numbers[i]%2!=0) {
                countTek++;

            }

        }


        System.out.println("Arrayde "+countCift+" adet çift sayı vardır");
        System.out.println("Arrayde "+countTek+" adet tek sayı vardır");



    }
}
