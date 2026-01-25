package K08_stringManipulation;

public class C02_StringFiyatlariToplama {
    public static void main(String[] args) {
        // Kullanicinin belirli bir formatta verdigi String fiyatlari
        // toplayip yazdirin.
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €
        // NOT : sondaki para birimi degisken olmalidir

        String fiyatStr1="15.30 €";
        String fiyatStr2="11.45 €";

        int spaceIndex= fiyatStr1.indexOf(" ");
        String paraBirimi = fiyatStr1.substring(spaceIndex);

        fiyatStr1=fiyatStr1.replaceAll("\\D","");
        fiyatStr2=fiyatStr2.replaceAll("\\D","");

        double fiyat1= Double.parseDouble(fiyatStr1)/100;
        double fiyat2= Double.parseDouble(fiyatStr2)/100;

        System.out.println("Ürünlerin fiyat toplamı: "+(fiyat1+fiyat2+paraBirimi));







    }
}
