package K11_whileLoop;

public class W05_UsAlma {


    public static void main(String[] args) {

    W05_UsAlma.usAlma(2,3);

    }


    public static void usAlma(double sayi,int us){

        double sonuc=1;


        while (us>0){

            sonuc*=sayi;
            us--;
        }

        System.out.println(sonuc);
    }

}
