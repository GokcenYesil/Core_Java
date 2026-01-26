package K10_loops;

public class G02_TemelForLoop {
    public static void main(String[] args) {


        // 1'den 20'e kadar (1 ve 20 dahil) olan sayilarin toplamini yazdirin

        int toplam =0;
        for (int i = 1; i <=20 ; i++) {
            toplam+=i;

        }
        System.out.println("Sayıların toplamı: "+toplam);

        // 3 basamakli cift sayilarin toplamini yazdirin

        toplam =0;

        for (int i = 100; i <=998 ; i++) {

            if (i%2==0){
                toplam+=i;
            }

        } System.out.println("Sayıların toplamı: "+toplam);


        // 247'den baslayarak 400'den kucuk 20 ile bolunebilen sayilari yan yana yazdirin

        for (int i = 247; i <400 ; i++) {

            if (i%20==0){

                System.out.print(i+" ");
            }

        }
        // 1278'den 2013'e kadar (sinirlar dahil) olan sayilarin toplamini yazdirin

        toplam=0;

        for (int i = 1278; i <=2013 ; i++) {

            toplam+=i;



        }System.out.println("\nSayıların toplamı:"+toplam);









    }




}
