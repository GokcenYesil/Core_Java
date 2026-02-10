package K40_mixedPractice.D01_practice;

public class G01_fiyatToplami01 {

    public static void main(String[] args) {
        /*
    Kullanıcıdan iki adet fiyat bilgisi alın.
Bu fiyatlar belirli bir formatta olacak ve şu şekilde verilecek:

input1 : "22,75 TL"

input2 : "19,40 TL"

Kullanıcının görevi:

Fiyat stringlerindeki para birimini korumak,

Sadece sayısal kısmı alıp toplamak,

Sonucu yine aynı para birimi ile formatlı şekilde yazdırmak.

Beklenen çıktı:
Toplam fiyat: 42,15 TL


     */

        String fiyatStr1="22,75 TL";
        String fiyatStr2= "19,40 TL";

        int spaceIndex = fiyatStr1.indexOf(" ");
        String paraBirimi =fiyatStr1.substring(spaceIndex);

        fiyatStr1 = fiyatStr1.replaceAll("\\D","");//2275
        fiyatStr2= fiyatStr2.replaceAll("\\D","");//1940

        double fiyat1 = Double.parseDouble(fiyatStr1)/100;
        double fiyat2= Double.parseDouble(fiyatStr2)/100;

        System.out.println("Fiyatların toplamı: " + (fiyat1 + fiyat2) + paraBirimi);


    }

}
