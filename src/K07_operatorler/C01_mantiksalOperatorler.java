package K07_operatorler;

public class C01_mantiksalOperatorler {
    public static void main(String[] args) {

        char harf = 't';

        // verilen harfin kucuk harf oldugunu kontrol edin

        System.out.println(Character.isLowerCase(harf));

        // verilen harfin a ile k arasinda oldugunu kontrol edin


        System.out.println(harf > 'a' && harf < 'k');

        int sayi = 25;

        // verilen sayinin 2 basamakli oldugunu kontrol edin

        System.out.println(sayi >= 10 && sayi <= 99);


        // verilen sayinin 100 ile 200 arasinda (sinirlar dahil) oldugunu kontrol edin

        System.out.println(sayi >= 100 && sayi <= 200);


        char let= 'y';


        // verilen harfin kucuk harf olmadigini kontrol edin

        System.out.println(let < 'a' && let > 'z');


    }
}
