package K40_mixedPractice.D01_practice;

public class G02_fiyatToplami02 {

    public static void main(String[] args) {

        /*
        input1: " 12,50 ₺ "
input2: "7.30 ₺"
input3: " 8,20₺"

Görev:

Gereksiz boşlukları temizleyin.

Ondalık ayracını tek tipe çevirin.

Para birimini koruyarak sayıları toplayın.

Sonucu para birimiyle birlikte yazdırın.*/

        String input1= "12,50 ₺ ";
        String input2="7.30 ₺";
        String input3 ="8,20₺";

        //Gereksiz boşlukları temizle

        input1=input1.trim();
        input2=input2.trim();
        input3=input3.trim();

        //para birimini bul

        char currency =input2.charAt(input2.length()-1);

        //sayı kısmını para biriminden ayır.nokta virgül ve digit olmayan herşeyi sil
        input1=input1.replaceAll("[^\\d.,]","");
        input2=input2.replaceAll("[^\\d.,]","");
        input3=input3.replaceAll("[^\\d.,]","");


        //Virgülü noktaya çevir
        input1=input1.replace(",",".");
        input2=input2.replace(",",".");
        input3=input3.replace(",",".");


        //double'a çevir

        double inp1= Double.parseDouble(input1);
        double inp2= Double.parseDouble(input2);
        double inp3= Double.parseDouble(input3);
        // fiyatları topla
        double toplam= inp1+inp2+inp3;

        //para birimi ile yazdır

        System.out.println("Fiyatların toplamı: " + toplam + currency);


    }
}
