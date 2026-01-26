package K10_loops;

public class G04_TemelForLoop2 {
    public static void main(String[] args) {
        // 675'den baslayarak geriye 389'a kadar (sinirlar dahil)
        // 17 ile bolunebilen sayilari yazdirin

        for (int i = 675; i >=389 ; i--) {

            if (i%17==0){

                System.out.print( i + " ");

            }

        }



        // -10 ile +10 arasindaki tum tamsayilarin carpini yazdirin

        long carpim=1;

        for (int i = -10; i <=10 ; i++) {

            if (i==0){
                continue;
            }
            carpim*=i;


        }
        System.out.print(" "+carpim);




        // 3 basamakli 73 ile bolunebilen sayilari,
        // buyukten kucuge dogru yazdirin

        for (int i = 999; i >=100 ; i--) {

            if (i%73==0){

                System.out.print(i + " ");
            }

        }
















    }
}
