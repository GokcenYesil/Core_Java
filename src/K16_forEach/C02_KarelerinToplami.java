package K16_forEach;

public class C02_KarelerinToplami {

    public static void main(String[] args) {
        // Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.


        int [] numbers ={1,3,5,7,2,1,3};

        karelerinToplami(numbers);


    }


    public static void karelerinToplami (int [] numbers) {

        int sum=0;


        for (int x  :numbers ) {

            sum+=x*x;

        }


        System.out.println("Array'deki elementlerin karelerinin toplami :"+sum);



    }


}
