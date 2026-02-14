package K40_mixedPractice.D04_practice04.trycatch;

public class C02_Try_Catch2 {

    public static void main(String[] args) {
        /*
        arr[3] değerini yazdır

s değişkenini Integer.parseInt(s) ile çevirmeye çalış

En sonda sadece şu yazsın:Bitti
         */

        int[] arr = {1, 2, 3};
        String s = "Java";


        try {
            System.out.println(arr [3]);
        }catch (IndexOutOfBoundsException e){

        }


        try {
            System.out.println(Integer.parseInt(s));
        }catch (NumberFormatException e){

        }

        System.out.println("Bitti");

    }
}
