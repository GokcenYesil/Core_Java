package K20_constructors;

public class C02_DefaultConstructor_ToStringKullanimi {

    public static void main(String[] args) {


        C01_Araba araba = new C01_Araba();

        System.out.println(araba.marka);
        System.out.println(araba.yil);
        System.out.println(araba.model);
        System.out.println(araba.renk);
        System.out.println(araba.fiyat);


        C01_Araba araba1= new C01_Araba();

        araba1.yil =2010;
        araba1.fiyat=30000;

        System.out.println("==========================");
        System.out.println(araba.marka);
        System.out.println(araba1.yil);
        System.out.println(araba1.fiyat);
        System.out.println(araba.model);
        System.out.println(araba.renk);



    }
}
