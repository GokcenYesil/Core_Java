package K40_mixedPractice.D02_practice02;

import java.util.Scanner;

public class G14_KrediKartDuzenleme {

    public static void main(String[] args) {
         /*
    Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz.
                Giriş :
		         > Gandalf Grey 563245879632
                Çıktı :
		         > İsim : G****** G***
		         > CCN : **** **** 9632
     */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adınızı girin: ");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyadınızı girin: ");
        String soyisim = scanner.nextLine();
        System.out.println("Lutfen kredi kartı numaranızı girin: ");
        String kartNo = scanner.nextLine();


        String duzenlenmisIsim= isim.substring(0,1).toUpperCase()+
                                isim.substring(1).replaceAll("\\w","*");
        String duzenlenmisSoyisim = soyisim.substring(0,1).toUpperCase()+
                                    soyisim.substring(1).replaceAll("\\w","*");

        String duzenlenmisKartNo=" **** **** ****"+" " +kartNo.substring( kartNo.length()-4);

        System.out.println(duzenlenmisIsim+" " +duzenlenmisSoyisim+" " + duzenlenmisKartNo);


    }
}
