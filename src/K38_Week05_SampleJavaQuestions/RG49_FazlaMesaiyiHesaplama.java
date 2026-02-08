package K38_Week05_SampleJavaQuestions;

public class RG49_FazlaMesaiyiHesaplama {
    public static void main(String[] args) {
        /*49-----
    Fazla mesaiyi hesaplayan bir program yazınız.
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        ucretHesapla(9.0,20.0,40.0,1.8);

        System.out.println("Toplam = " +ucretHesapla(9.0,20.0,40.0,1.8));

    }

    public static int ucretHesapla(double baslama, double bitis, double saatlik, double mesai) {


        int m1= (int) (17-baslama)*40;
        int m2= (int) ((int) (bitis-17)*(40*1.8));

        return m1+m2;
    }

    // 2. yol dinamik hali
    /*
      Scanner scan=new Scanner(System.in);
        System.out.println("Sirayla  \nbaslangic saatini \nbitis saatini \nsaatlik çalışma ücretini \nfazla mesai carpanini \ngiriniz ");
        double start =scan.nextDouble(); //8.00;
        double finish = scan.nextDouble(); // 20.00;
        double calismaUcreti = scan.nextDouble(); //40.0;
        double exMesaiKatSayisi = scan.nextDouble(); // 1.8;

       double toplam= ucretHesapla(start, finish, calismaUcreti, exMesaiKatSayisi);
        System.out.println("toplam = "+toplam);
    }

    private static double ucretHesapla(double start, double finish, double calismaUcreti, double exMesaiKatSayisi) {
            double toplamUcret=0;
        toplamUcret+=(finish-start)*calismaUcreti;

            if (finish>17.00 ) {
                toplamUcret+=(finish-17.00)*calismaUcreti*(exMesaiKatSayisi-1);
            }
            if(start<09.00){
                toplamUcret+=(09.00-start)*calismaUcreti*(exMesaiKatSayisi-1);
            }

        return toplamUcret;
        }
     */

}

