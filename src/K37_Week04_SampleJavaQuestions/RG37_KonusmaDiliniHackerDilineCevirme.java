package K37_Week04_SampleJavaQuestions;

public class RG37_KonusmaDiliniHackerDilineCevirme {

    public static void main(String[] args) {

/*37-----
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */


    }

    public static String konusmaDiliniHackerDilineCevir(String metin) {

        String yeniMetin="";

        for (int i = 0; i <metin.length() ; i++) {

            yeniMetin=metin.replaceAll("s","5")
                            .replaceAll("a","4")
                            .replaceAll("e","3")
                            .replaceAll("i","1")
                            .replaceAll("o","0");


        }


        return yeniMetin;
}


}