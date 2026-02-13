package K40_mixedPractice.D04_practice04.methods;

public class C01_ChatgptCokluSorular {
    public static void main(String[] args) {
//        Parametre almayan ve void olan bir method yaz:
//
//        Method adı: ekranaMerhabaYaz
//
//        Ekrana sadece bir kere şu yazıyı yazdırsın:
    }




    public static void ekranaMerhabaYaz (){

        System.out.println("Merhaba Java");


        /*
        Parametre alan bir method yaz:

Method adı: karesiniYazdir

Bir tane int parametre alsın

Aldığı sayının karesini ekrana yazdırsın

return kullanma (void olsun)

         */

    }

    public static void karesiniyazdir (int num){

        System.out.println(num*num);
    }

    public static int topla (int a,int b) {

        int toplam = 0;

        toplam = a + b;

        return toplam;
    }
public  static int buyukOlaniDondur (int x,int y){


        if (x==y){
            return 0;

        } else if (x>y) {

            return x;

        }else return y;
}


/*
Method adı: 1denNyeToplam

Bir int parametre alsın (n)

1’den n’e kadar olan sayıların toplamını return etsin

n 0 veya negatifse 0 döndürsün
 */




    public static int birdenNyeToplam (int n) {

        int toplam = 0;

            if (n==0 || n<0) {

                return 0;
            }

        for (int i = 1; i <n ; i++) {
            toplam+=i;

        }


        return toplam;
    }


/*
Method adı: ilkVeSonHarf

Bir String parametre alsın

String boşsa "Geçersiz metin" döndürsün

Değilse:

ilk karakter DAHİL

son karakter DAHİL

bu iki karakterden oluşan bir String döndürsün
 */

public static String ilkVeSonHarf (String str) {

    String yeniMetin="";

    if (str.isEmpty()) {
        return "Geçersiz metin";


    }else {

        yeniMetin=str.substring(0,1).concat(str.substring(str.length()-1));


       return yeniMetin;

    }
}
/*
Method adı: ciftMi

Bir int parametre alsın

Sayı çiftse true

Tekse false döndürsün


 */


    public static boolean ciftMi (int a){


        return a % 2 == 0;
    }


/*
Method adı: sesliHarfSayisi

Bir String parametre alsın

Metin içindeki sesli harf sayısını (a,e,ı,i,o,ö,u,ü) saysın

Büyük/küçük harf fark etmesin

Sayıyı int olarak return etsin
 */



public static int sesliHarfSayisi (String metin){

    int count=0;
    metin=metin.toLowerCase();


    for (int i = 0; i <metin.length() ; i++) {

        char ch= metin.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'ı' || ch == 'i' ||
                ch == 'o' || ch == 'ö' || ch == 'u' || ch == 'ü') {
            count++;
        }


        }

return count;
}
/*
Method adı: enBuyukEleman

Bir int array alsın

Array içindeki en büyük elemanı bulup

int olarak return etsin

Array boşsa Integer.MIN_VALUE döndürsün

 */



public static int enBuyukEleman (int []arr){


    int enBuyuk= arr [0];


   if (arr.length==0){
      return Integer.MIN_VALUE;
   }
    for (int i = 0; i < arr.length ; i++) {

        if (arr [i]>enBuyuk){
            enBuyuk=arr [i];

        }

    }

return enBuyuk;

}

/*
Method adı: enKucukEleman

Bir int array alsın

Array içindeki en küçük elemanı bulup

int olarak return etsin

Array boşsa Integer.MAX_VALUE döndürsün
 */



public static int enKucukEleman (int [] dizi){




    if (dizi.length==0){
        return Integer.MAX_VALUE;

    }
    int enKucuk= dizi [0];

    for (int i = 0; i <dizi.length ; i++) {

        if (enKucuk>dizi [i]){
            enKucuk=dizi [i];



        }

    }

return enKucuk;
}


/*
Method adı: tekSayilariTopla

Bir int array alsın

Array içindeki tek sayıların toplamını hesaplasın

Toplamı int olarak return etsin

Array boşsa 0 döndürsün
 */




public static int tekSayilariTopla (int []arr){


    int toplam=0;


    if (arr.length==0){
        return 0;
    }

    for (int i = 0; i <arr.length ; i++) {


        if (arr [i]%2!=0){

            toplam+=arr [i];
        }

    }

    return toplam;

}

/*
Method adı: ikinciEnBuyuk

Bir int array alsın

Array içindeki ikinci en büyük sayıyı bulup

int olarak return etsin

Array 2’den az elemanlıysa Integer.MIN_VALUE döndürsün
 */




}

