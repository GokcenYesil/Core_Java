package K25_varargs;

public class C02_VarargsKullanimi {
    public static void main(String[] args) {
        // argument olarak girilen sayilardan
        // ilki haric geriye kalanlari toplayip
        // bulunan toplam deger ile ilk sayinin carpimini yazdiran
        // bir method olusturun
        // orn 2,3,4,5  ==>  2 * (3+4+5) = 24

        carpVeTopla(5,1,1,1,1);
        carpVeTopla(2,7,4,5);
        carpVeTopla(5,8,9,10);


    }




    public static void carpVeTopla (int a,int...kalanSayilar){


        int sum=0;

        for (int i = 0; i <kalanSayilar.length ; i++) {

        sum+= kalanSayilar [i];




        }


        System.out.println(a * sum);


    }

}
