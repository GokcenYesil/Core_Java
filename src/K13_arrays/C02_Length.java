package K13_arrays;

public class C02_Length {
    public static void main(String[] args) {

        String str = "Java Candir";

        int[] arr = {3,5,7,9,1,2};

        // String'deki karakter sayisini yazdirin

        System.out.println(str.length());


        // arr'deki element sayisini yazdirin

        System.out.println(arr.length);


        // String'in son karakterini yazdirin

        System.out.println(str.charAt(str.length() - 1));


        // arr'nin son elementini yazdirin
        System.out.println(arr[arr.length - 1]);


        // String'in sondan 3. elementini yazdirin


        System.out.println(str.charAt(str.length() - 3));


        // arr'nin sondan 3. elementini yazdirin
        System.out.println(arr[arr.length - 3]);


    }
}
