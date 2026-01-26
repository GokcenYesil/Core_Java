package K11_whileLoop;

public class W01_TemelWhileLoop {

    public static void main(String[] args) {


        // 1'den 10'a kadar (1 ve 10 dahil) tum sayilari toplayin

        int sayi = 1;
        int sayiToplami = 0;


        while (sayi <= 10) {
            sayiToplami += sayi;
            sayi++;

        }
        System.out.println("1 den 10' a kadar tüm sayıların toplamı: " + sayiToplami);


        // 20'den 30'a kadar olan sayilari (20 ve 30 dahil) cift sayilari carpin ve yazdirin

        sayi = 20;
        int carpim = 1;

        while (sayi <= 30) {

            if (sayi % 2 == 0) {

                carpim *= sayi;

            }

            sayi++;



        }System.out.println("20 ile 30 arasındaki çift sayıların çarpımı: " + carpim);
    }
}