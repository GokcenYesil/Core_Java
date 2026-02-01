package K29_inheritance.dataType;

public class C05_avciKuslar extends C04_kuslar {

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {


        C05_avciKuslar avciKartal= new C05_avciKuslar();


        //Objenin oluşturulduğu class C05_avciKuslar
        //C05_Data türü avciKuslar

        System.out.println(avciKartal.omur);//yasar ve olurler
        System.out.println(avciKartal.hareket);//ucarlar
        System.out.println(avciKartal.beslenme);//et yerler
        System.out.println(avciKartal.pence);//pencelidir
        System.out.println(avciKartal.gaga);//sivri gagalı
        System.out.println(avciKartal.cogalma);//yumurtayla cogalirlar
        System.out.println(avciKartal.kanat);//kanatlidirlar
        System.out.println(avciKartal.solunum);//akciğerle nefes alırlar
        System.out.println("==============================================");


        C04_kuslar kusKartal = new C05_avciKuslar();
        //Objenin oluşturulduğu class C05_avciKuslar
        //C05_Data türü C04_kuslar

        System.out.println(kusKartal.omur);//yasar ve olurler
        System.out.println(kusKartal.hareket);//hareket ederler
        System.out.println(kusKartal.beslenme);//beslenirler
        //System.out.println(kusKartal.pence);//pence yok CTE verir
        System.out.println(kusKartal.gaga);//gagalari vardır
        System.out.println(kusKartal.cogalma);//yumurtayla cogalirlar
        System.out.println(kusKartal.kanat);//kanatlidirlar
        System.out.println(kusKartal.solunum);//akciğerle nefes alırlar

        System.out.println("==============================================");

        C03_hayvanlar hayvanKartal= new C05_avciKuslar();
        //Objenin oluşturulduğu class C05_avciKuslar
        //C05_Data türü C03_hayvanlar

        System.out.println(hayvanKartal.omur);//yasar ve olurler
        System.out.println(hayvanKartal.hareket);//hareket ederler
        System.out.println(hayvanKartal.beslenme);//beslenirler
        //System.out.println(hayvanKartal.pence);//pence yok CTE verir
        //System.out.println(hayvanKartal.gaga);//gaga yok CTE verir
        System.out.println(hayvanKartal.cogalma);//cogalirlar
        //System.out.println(hayvanKartal.kanat);//kanat yok CTE verir
        System.out.println(hayvanKartal.solunum);//nefes alırlar

        System.out.println("==============================================");



        C04_kuslar kus1 = new C04_kuslar();

        //Objenin oluşturulduğu class C04_kuslar
        //C05_Data türü C04_kuslar


        System.out.println(kus1.omur);//yasar ve olurler
        System.out.println(kus1.hareket);//hareket ederler
        System.out.println(kus1.beslenme);//beslenirler
        //System.out.println(kus1.pence);//pence yok CTE
        System.out.println(kus1.gaga);//gagalari vardır
        System.out.println(kus1.cogalma);//yumurtayla cogalirlar
        System.out.println(kus1.kanat);//kanatlidirlar
        System.out.println(kus1.solunum);//akciğerle nefes alırlar



        System.out.println("==============================================");

        C03_hayvanlar hayvanKus = new C04_kuslar();

        //Objenin oluşturulduğu class C04_kuslar
        //C05_Data türü C03_hayvanlar


        System.out.println(hayvanKus.omur);//yasar ve olurler
        System.out.println(hayvanKus .hareket);//hareket ederler
        System.out.println(hayvanKus .beslenme);//beslenirler
//      System.out.println(hayvanKus .pence);//pence yok CTE
//      System.out.println(hayvanKus .gaga);//gaga yok CTE
        System.out.println(hayvanKus .cogalma);//cogalirlar
//      System.out.println(hayvanKus .kanat);//kanat yok CTE
        System.out.println(hayvanKus .solunum);//nefes alırlar
/*
Özelllikler variable olarak oluşturulduysa sadece ama sadece
data türü belirleyicidir.

Yani  variable olarak oluşturulan aynı data türüne sahip farklı objeler
aynı özellikleri taşır.

Bu durumda objenin oluşturulduğu class'ların farklı olması önemli değildir.
Önemli olan aynı data türüne sahip olup olmadıklarıdır.

exp:
C03_hayvanlar hayvanKus = new C04_kuslar();
C03_hayvanlar kus1 = new C05_avciKuslar();

örnekteki objeler farklı class'lardan oluşturulmuş olsalar da
aynı Data Type'a sahip oldukları için aynı özellikleri taşırlar.

Variable araması daima child'dan parent veya daha yukarı doğru olur.
Java geriye doğru yani parenttan child'a arama yapmaz. Başlangıç class'ındaki
constructor çalıştığında parentları çalıştırır(super (); metodu).
Fakat Java prensipleri gereği child class'ı çalıştırmaz.
 */











    }
}

