package K25_varargs;

public class C03_VarargsDikkatEdilecekler {

    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // sonuncusu haric geriye kalanlari toplayip
        // bulunan toplam deger ile son sayinin carpimini yazdiran
        // bir method olusturun


        vararg(2,7,5,1);
        vararg(2,4,6,3);
    }

    public static void vararg (int...sayilar){

        int sum=0;
        for (int i = 0; i <= sayilar.length-2 ; i++) {

            sum+=sayilar [i];

        }
        System.out.println(sum * sayilar[sayilar.length - 1]);

    }



}
