package K34_Week01_SampleJavaQuestions;

public class RG05_ElmasDesenliYazdirma {

    public static void main(String[] args) {

        /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:*/


        int n = 7;



        for (int i = 1; i <=n ; i++) {


            for (int s = 1; s <=n-i ; s++) {

                System.out.print(" ");

            }


            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");

            }

            System.out.println();
        }



        for (int i =n-1; i >=1 ; i--) {

            for (int s = 1; s <=n-i ; s++) {
                System.out.print(" ");

            }


            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");

            }

            System.out.println();


        }



    }
}
