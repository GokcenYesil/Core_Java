package K35_Week02_SampleJavaQuestions;

public class RG13_StrPalindrome {

    public static void main(String[] args) {

        /*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */

        String duzmetin= "Madam";

        String tersMetin="";

        for (int i = duzmetin.length()-1 ; i >=0 ; i--) {

            tersMetin+=duzmetin.charAt(i);

        }
        System.out.println("Girilen metin palindrome mu? sorusunun cevabı: \n" +

                duzmetin.equalsIgnoreCase(tersMetin));





    }
}
