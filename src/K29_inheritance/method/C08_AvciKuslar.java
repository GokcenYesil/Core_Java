package K29_inheritance.method;

public class C08_AvciKuslar extends C07_Kuslar {

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {


        C08_AvciKuslar avciKartal = new C08_AvciKuslar();

        avciKartal.omur(); //yasar ve olurler
        avciKartal.solunum(); //akcigerle nefes alırlar
        avciKartal.cogalma(); // yumurtayla cogalirlar
        avciKartal.kanat(); // kanatlidirlar
        avciKartal.hareket(); // ucarlar
        avciKartal.beslenme(); // et yerler
        avciKartal.gaga(); // sivri gagali
        avciKartal.pence();  // pencelidir

        System.out.println("==============================");

        C07_Kuslar kusKartal = new C08_AvciKuslar();

        kusKartal.omur(); //yasar ve olurler
        kusKartal.solunum(); //akcigerle nefes alırlar
        kusKartal.cogalma(); // yumurtayla cogalirlar
        kusKartal.kanat(); // kanatlidirlar
        kusKartal.hareket(); // ucarlar
        kusKartal.beslenme(); // et yerler
        kusKartal.gaga(); // sivri gagali
        //kusKartal.pence();  // pence yok CTE verir

        System.out.println("==============================");

        C07_Kuslar kus2= new C07_Kuslar();

        kus2.omur(); //yasar ve olurler
        kus2.solunum(); //akcigerle nefes alırlar
        kus2.cogalma(); // yumurtayla cogalirlar
        kus2.kanat(); // kanatlidirlar
        kus2.hareket(); // hareket ederler
        kus2.beslenme(); // beslenirler
        kus2.gaga(); // gagalari vardır
        //kus2.pence();  // pence yok CTE verir

        System.out.println("==============================");

    C06_Hayvanlar hayvanKartal = new C08_AvciKuslar();

        hayvanKartal.omur(); //yasar ve olurler
        hayvanKartal.solunum(); //akcigerle nefes alırlar
        hayvanKartal.cogalma(); // yumurtayla cogalirlar
        //hayvanKartal.kanat(); // kanat yok CTE verir
        hayvanKartal.hareket(); // ucarlar
        hayvanKartal.beslenme(); // et yerler
        //hayvanKartal.gaga(); // gaga yok CTE verir
        //hayvanKartal.pence();  // pençe yok CTE verir

        System.out.println("==============================");


        C06_Hayvanlar hayvan1 = new C06_Hayvanlar();

        hayvan1.omur(); //yasar ve olurler
        hayvan1.solunum(); //nefes alırlar
        hayvan1.cogalma(); // cogalirlar
        //hayvan1.kanat(); // kanat yok CTE verir
        hayvan1.hareket(); // hareket ederler
        hayvan1.beslenme(); // beslenirler
        //hayvan1.gaga(); // gaga yok CTE verir
        //hayvan1.pence();  // pençe yok CTE verir

        System.out.println("==============================");

        C06_Hayvanlar hayvankus = new C07_Kuslar();


        hayvankus.omur(); //yasar ve olurler
        hayvankus.solunum(); //akcigerle nefes alırlar
        hayvankus.cogalma(); // yumurtayla cogalirlar
        //hayvankus.kanat(); // kanat yok CTE verir
        hayvankus.hareket(); // hareket ederler
        hayvankus.beslenme(); // belenirler
        //hayvankus.gaga(); // gaga yok CTE verir
        //hayvankus.pence();  // pençe yok CTE verir


        /*
        Java,özellikleri method olarak oluşturduğumuzda variable olarak
         oluşturmaktan farkl bir yol izler. variable'da data türüne göre
         başlangıç classında ilk bulduğu variable'ı kullanıyorken, method
         oluşturmada daha spesifik,daha güncel bilgi var mı diye kontrol eder.
        Fakat bu kontrolleri özelliği aradığı classta bulduğu sürece yapar.
        yani başlangıç class'ında o özellik yok
        ise daha güncelini de bulamayacağı için CTE verir.Tüm bu kontrolleri
        başlangıç constructor'ına kadar yapar.
         */






    }
}