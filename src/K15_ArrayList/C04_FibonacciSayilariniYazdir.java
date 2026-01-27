package K15_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

        // kullanicidan pozitif bir n tamsayisini alip,
        // ilk n tane Fibonacci sayisini bir liste olarak yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233


        List<Integer> fibonaccisayilari= new ArrayList<>();


        System.out.print("Metodla oluşturulan fibonacci Sayıları"+fibonacciYazdir(5));
        System.out.println("");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen istediğiniz fibonacci sayı adedini girin: ");
        
        int sayi= scanner.nextInt();
        
        
        if (sayi<=0){

            System.out.println("Pozitif bir tamsayi girin...");
            
            
        } else if (sayi==1) {

            fibonaccisayilari.add(0);

        } else if (sayi==2) {

            fibonaccisayilari.add(0);
            fibonaccisayilari.add(1);

        } else{
            fibonaccisayilari.add(0);
            fibonaccisayilari.add(1);

            for (int i = 2; i <sayi ; i++) {

            fibonaccisayilari.add(fibonaccisayilari.get(i-2)+fibonaccisayilari.get (i-1));


            }
        }

        System.out.print(fibonaccisayilari);
        System.out.println();



    }

    // Verilen pozitif bir n tamsayisini alarak,
    // bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun.


    public static List<Integer> fibonacciYazdir (int sayi) {

        List<Integer> fibonaccisayilari= new ArrayList<>();



        if (sayi<=0){

            System.out.println("Pozitif bir tamsayi girin...");


        } else if (sayi==1) {

            fibonaccisayilari.add(0);

        } else if (sayi==2) {

            fibonaccisayilari.add(0);
            fibonaccisayilari.add(1);

        } else{
            fibonaccisayilari.add(0);
            fibonaccisayilari.add(1);

            for (int i = 2; i <sayi ; i++) {

                fibonaccisayilari.add(fibonaccisayilari.get(i-2)+fibonaccisayilari.get (i-1));


            }
        }
       return fibonaccisayilari;
    }



}
