package K36_Week02_SampleJavaQuestions;

public class RG24_ArraydeIstenenDegeriBulma {
    public static void main(String[] args) {
         /*24----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]


    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False
    */



        int []arr = new int[7];

        arr [0]=1551;
        arr [1]=1223;
        arr [2]=1443;
        arr [3]=1267;
        arr [4]=1789;
        arr [5]=1023;
        arr [6]=2020;

        int arananDeger=2020;
        boolean varMi= false;

        for (int i = 0; i <arr.length ; i++) {

            if (arr [i]==arananDeger){
                varMi=true;
                break;
            }

        }


        System.out.println(varMi);


        arananDeger=2010;
        varMi= false;

        for (int sayi  :arr ) {
            if (sayi==arananDeger){
                varMi=true;
                break;
            }

        }


        System.out.println(varMi);

    }
}
