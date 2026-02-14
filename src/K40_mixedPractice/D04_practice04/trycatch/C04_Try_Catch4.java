package K40_mixedPractice.D04_practice04.trycatch;


import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Try_Catch4 {

    public static void main(String[] args) {

        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        Scanner scanner = new Scanner(System.in);

        int index=0;

        try {
            System.out.println("Lutfen index için bir tamsayi girin: ");
            index=scanner.nextInt();

        }catch (InputMismatchException e ){
            System.out.println("Bir tamsayi girmelisiniz...");
            return;

        }
        try {
            System.out.println("String için index: "+str.charAt(index));

        }catch (StringIndexOutOfBoundsException e){

            System.out.println("İndex String'in sınırları dışında..."
            +"Max giriş: "+(str.length()-1));

        }
        try {
            System.out.println("Array için index: "+arr [index]);
        }catch (IndexOutOfBoundsException e){

            System.out.println("İndex Array'in sınırları dışında..."
                    +"Max giriş: "+(arr.length-1));
        }

        System.out.println("Program sonlandi...");

    }
}
