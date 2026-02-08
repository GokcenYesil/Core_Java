package K38_Week05_SampleJavaQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class RG41_KelimelerinIlkHarfiniBuyukYapma {

    public static void main(String[] args) {
        /*41-----
    Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen metninizi giriniz");
        String metin = scan.nextLine();
        String[] str = metin.split(" ");

        Arrays.stream(str).map(t -> t.substring(0, 1).toUpperCase()
                + t.substring(1)).forEach(t ->
                System.out.print(t + " "));

    }

}

