package K36_Week02_SampleJavaQuestions;

public class RG25_ArraydeKacinciElemanOldugunuBulma {
    public static void main(String[] args) {
        /*25----
        Aranan değerin Array içerisinde kaçıncı indekste olduğunu bulan Java Kodu yazınız.

                Array: [12,15,43,23,56,76,78,90,77,43]

        Aranan değer:56

        Beklenen Çıktı:
        56 sayısı arrayin 4. elemanı
                */




        int [] numbers= {12,15,43,23,56,76,78,90,77,43};

        int arananSayi=56;


        for (int i = 0; i <numbers.length ; i++) {

            if (numbers [i]==arananSayi){
                System.out.println(arananSayi+" array'inin "+(i)+" . indeksindedir");
                return;

            }


        }
        System.out.println("Aranan değer array içinde yok...");
    }
}
