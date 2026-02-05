package K35_Week02_SampleJavaQuestions;

public class RG15_StrIstenilenKarakteriYazdirma {

    public static void main(String[] args) {
        /*15----
    Girilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */


        String metin= "Java is fun";

        System.out.println("Metnin 0.indexteki karakteri: " + metin.substring(0, 1));
        System.out.println("Metnin 5.indexteki karakteri: " + metin.substring(5, 6));


    }
}
