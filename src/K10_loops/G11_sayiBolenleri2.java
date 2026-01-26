package K10_loops;

public class G11_sayiBolenleri2 {

    public static void main(String[] args) {

         // verilen baslangic ve bitis degerleri dahil olmak uzere
        // bu sayilar arasinda 7 ile bolunebilen sayi adedini yazdirin

        int baslangic = 1235;
        int bitis = 16703;

        int sayac=0;

        for (int i = baslangic; i <=bitis ; i++) {

            if (i%7==0){
            sayac++;

            }

        }System.out.println(sayac);




    }
}
