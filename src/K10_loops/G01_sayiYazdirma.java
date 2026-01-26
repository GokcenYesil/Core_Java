package K10_loops;

public class G01_sayiYazdirma {
    public static void main(String[] args) {

//        for loop kullanarak asagidaki sayilari yazdirin
//        1 2 3 4
//        2 4 6 8
//        3 6 9 12
//        4 8 12 16


        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=4 ; j++) {


                System.out.print(i * j+" ");


            }

            System.out.println("");
        }
    }
}
