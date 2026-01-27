package K13_arrays;

public class C07_ElemanArama {


    public static void main(String[] args) {
        // Verilen String bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin


        String[] harfler = {"a", "d", "f", "e", "a", "e", "d", "a", "a", "e", "a"};


        String arananEleman = "a";
        int sayac = 0;


        for (int i = 0; i < harfler.length ; i++) {

            if (harfler[i].equals(arananEleman)){
                sayac++;
            }

        }

        if (sayac==0){

            System.out.println("Aradığınız element array içinde kullanılmamıştır...");
        }else {

            System.out.println("Aradığınız element array içinde "+sayac+" kez kullanılmıştır");//5
        }




}
}