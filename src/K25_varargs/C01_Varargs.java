package K25_varargs;

import java.util.Arrays;

public class C01_Varargs {
    public static void main(String[] args) {

    sayiTopla(1,3,5);

      topla(1,3,5,7,9);


    }


    public  static void topla (int... sayilar) {

        int toplam=0;

        for (int each  :sayilar ) {

            toplam+=each;




        }
        System.out.println("verilen sayıların toplamı: "+toplam);
    }


    public static void sayiTopla (int a, int b,int c){


        int toplam=a+b+c;

        System.out.println(toplam);
        
        
    }
    
    
}
