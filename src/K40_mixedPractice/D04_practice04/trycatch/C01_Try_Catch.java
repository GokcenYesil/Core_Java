package K40_mixedPractice.D04_practice04.trycatch;

public class C01_Try_Catch {
    public static void main(String[] args) {
    /*
    numbers dizisinin 4. elemanını ekrana yazdır

    text değişkeninin uzunluğunu ekrana yazdır
    Program exception olsa bile çalışmaya devam etsin

En sonda mutlaka:Program devam ediyor yazsın
    */

        int[] numbers = {10, 20, 30};
        String text = null;


        try {
            System.out.println(numbers [4]);

        }catch (IndexOutOfBoundsException e ){

        }
        try {
            System.out.println(text.length());
        }catch (NullPointerException e){

        }


        System.out.println("Program devam ediyor");




    }
}
