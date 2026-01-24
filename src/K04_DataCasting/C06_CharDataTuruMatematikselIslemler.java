package K04_DataCasting;

public class C06_CharDataTuruMatematikselIslemler {

    public static void main(String[] args) {


        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        System.out.println(chr1+chr2+chr3);
        // char data turundeki bir variable'i veya degeri
        // matematiksel islemlerde kullanirsaniz
        // Java direk ASCII table'daki degeri ile isleme alir

        int sayi1= 99;
        int sayi2 = 65;

        System.out.println("Girilen sayinin character degeri:"+ (char)sayi1+" "+ (char)sayi2);

        char ch5= 'k';

        System.out.println(
                (char)(ch5+1)+""+(char)(ch5+2)+(char)(ch5+3)

        );


        System.out.println(

                (char)(ch5 + 1) +", " + (char) (ch5+2) + ", " + (char)(ch5+3)
        ); // l, m, n








    }






}
