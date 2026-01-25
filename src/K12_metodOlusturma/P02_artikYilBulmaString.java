package K12_metodOlusturma;

public class P02_artikYilBulmaString {

    public static void main(String[] args) {

    }


    public static String artilYilBulma(int yil) {


        if (yil % 400 == 0 && yil % 100 == 0 ||
                yil % 4 == 0 && yil % 100 != 0) {

            return "Artık Yıl";
        } else {
            return "Artık Yıl Değil";


        }
    }
}