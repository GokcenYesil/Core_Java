package K36_Week02_SampleJavaQuestions;

public class RG29_CumleyiTerstenDuzYazdırma {

    public static void main(String[] args) {

    /*29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */

        String sentence ="Java is fun";

        String [] bolunenCumle= sentence.split(" ");



        String reversed="";//


        for (int i = bolunenCumle.length-1; i >=0 ; i--) {


            reversed+= bolunenCumle [i]+" ";


        }

        System.out.println("Cümlenin tersten düz yazılışı: "+reversed);
        }


    }

