package K05_wrapperClass;

public class C04_Concatenation {

    public static void main(String[] args) {
        // Sadece verilen variable'lari kullanarak
        // istenen String'leri yazdirin

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";

        int a = 3;
        int b = 4;


        // 12 Java Candir

        System.out.println( a*b + s2 + s1 + s2 + s3    ); // 12 Java Candir

        // 7 Java

        System.out.println(  a + b + s2 + s1   );

        // 34 Candir

        System.out.println(  a + b + s2 + s3   ); // 7 Candir
        System.out.println(  ""+a + b + s2 + s3   ); // 34 Candir

        // Java7

        System.out.println( s1 + a + b  ); // "Java3" + 4 ==> Java34

        System.out.println( s1 + (a + b)  ); // Java7
    }
}
