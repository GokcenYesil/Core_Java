package K10_loops;

public class G15nestedBoslukVeYildiz {

    public static void main(String[] args) {

//          *
//         ***
//        *****
//       *******
//
        int n=4;

        for (int i = 1; i <=n ; i++) {//outer

            for (int j = 1; j <=n-i ; j++) { //inner bosluk
                System.out.print(" ");

            }for (int k = 1; k <=2*i-1 ; k++) {//inner yıldız
                System.out.print("*");

            }
            System.out.println();
        }

                //k =2  2*1-1  k<=1 false
                //k=1 i=2  1<=3  *
                //k=2 i=2  2<=3 *
                //k=3 i= 2  3<=3 *
                //k=4 i=2 4<=3 false  3 yıldız yazdırır



            }


    }

