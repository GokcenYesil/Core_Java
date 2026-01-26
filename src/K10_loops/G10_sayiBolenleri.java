package K10_loops;

public class G10_sayiBolenleri {

    public static void main(String[] args) {


        //1000 den geriye doğru 3 basamaklı 37 ile bölünebilen sayılar

        System.out.println("3 basamaklı 37 ile bölünebilen sayılar: ");
        for (int i = 1000; i >=100 ; i--) {

            if (i%37==0){

                System.out.print(i+" ");
            }

        }
    }
}
