package K05_wrapperClass;

public class C01_WrapperClass {
    public static void main(String[] args) {

        // String olarak verilen iki urunun fiyatini toplayin

        String fiyat1 = "23";
        String fiyat2 = "45";

        int fiy1= Integer.parseInt(fiyat1);
        int fiy2= Integer.parseInt(fiyat2);

        System.out.println("Ürün Fiyatlarının toplamı: "+(fiy1+fiy2));

        //
        fiyat1 = "23.45";
        fiyat2 = "34.43";

        double f1=Double.parseDouble(fiyat1);
        double f2= Double.parseDouble(fiyat2);

        System.out.println("Fiyatlarin toplami:"+(f1+f2));

        // kullanicidan bir karakter alip
        char harf = 's';

        // verilen karakterin Buyuk Harf olup olmadigini yazdirin
        System.out.println(Character.isUpperCase(harf));//false
        // verilen karakterin Kucuk Harf olup olmadigini yazdirin
        System.out.println(Character.isLowerCase(harf));//true
        // verilen karakterin Sayi olup olmadigini yazdirin
        System.out.println(Character.isDigit(harf));//false
        // verilen karakterin Harf olup olmadigini yazdirin
        System.out.println(Character.isLetter(harf));//true
        // verilen karakterin Alfabetik olup olmadigini yazdirin
        System.out.println(Character.isAlphabetic(harf));//true
        // verilen karakteri buyuk harf olarak yazdirin
        System.out.println(Character.toUpperCase(harf));//S




    }
}
