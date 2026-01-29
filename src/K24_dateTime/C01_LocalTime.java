package K24_dateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C01_LocalTime {


    public static void main(String[] args) {


        // bilgisayarinizdaki zamani yazdirin

        LocalTime anlikPc = LocalTime.now();

        System.out.println(anlikPc);



// .get..()  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi bize getirir

        System.out.println("Anlık saat bilgisi: "+anlikPc.getHour());
        System.out.println("Anlık dakika bilgisi: "+anlikPc.getMinute());
        System.out.println("Anlık saniye bilgisi: "+anlikPc.getSecond());
        System.out.println("Anlık nano saniye bilgisi: "+anlikPc.getNano());

// Bir loop olusturup
// Loop'un calismaya basladigi zaman ile bittigi zaman arasindaki farki bulun

        System.out.println("=============================================================");
        LocalTime start= LocalTime.now();


        String str = "";

        for (int i = 0; i <100000 ; i++) {

            str+= i;
        }


        LocalTime end= LocalTime.now();

        System.out.println("Anlık saat bilgisi: "+anlikPc);
        System.out.println("Loop için Baslangic saati: "+start);
        System.out.println("Loop için Bitiş saati: "+end);

        System.out.println("....................................................");
        System.out.println(end.getSecond() - start.getSecond());

        System.out.println("**************************************");

        System.out.println("Duration"+Duration.between(start, end));

        System.out.println("Günün başlangıcından loop başlangıcına kadar geçen saniye: "+start.toSecondOfDay());
        System.out.println("Günün başlangıcından loop başlangıcına kadar geçen saniye: "+end.toNanoOfDay());

        System.out.println(anlikPc.withHour(2));
        System.out.println(anlikPc.withMinute(38));
        System.out.println(anlikPc.withSecond(15));

        System.out.println(anlikPc.plusHours(8).plusMinutes(21).plusSeconds(34));
        System.out.println(anlikPc.minusHours(5));

        System.out.println(end.isAfter(anlikPc));
        System.out.println(start.isBefore(end));
        System.out.println(end.isBefore(start));




    }
}
