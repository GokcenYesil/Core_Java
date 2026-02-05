package K35_Week02_SampleJavaQuestions;

public class RG19_ArtikYil {

    public static void main(String[] args) {


        System.out.println(artikYilMi(2017));


    }

    public static boolean artikYilMi(int yil){


        if (yil%400==0 && yil%100==0 ||
            yil%4==0 && yil%100 !=0){

            return true;
        }else{
            return false ;

    }



}
}