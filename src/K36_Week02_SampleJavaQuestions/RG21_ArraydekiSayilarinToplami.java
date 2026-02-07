package K36_Week02_SampleJavaQuestions;

public class RG21_ArraydekiSayilarinToplami {
    public static void main(String[] args) {


        int [] sayilar={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {

            toplam+=sayilar [i];


        }
        System.out.println("Arraydeki sayıların toplamı: "+toplam);
    }
}
