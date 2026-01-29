package K24_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_FarkliZamanOlusturma {

    public static void main(String[] args) {

        LocalTime timeLondon= LocalTime.now(ZoneId.of("Europe/London"));

        System.out.println(timeLondon);


        LocalTime timeIstanbul = LocalTime.now(ZoneId.of("Europe/Istanbul"));

        System.out.println(timeIstanbul);

        LocalTime timeBerlin= LocalTime.now(ZoneId.of("Europe/Berlin"));

        System.out.println(timeBerlin);


        LocalTime timeBerlinHour= LocalTime.now(ZoneId.of("Europe/Berlin")).withHour(8);
        System.out.println(timeBerlinHour);


        LocalTime timeIstabulIleri= LocalTime.now(ZoneId.of("Europe/Istanbul")).plusMinutes(20);
        System.out.println(timeIstabulIleri);

        // LocalTime.of() ile istediginiz degerlere sahip bir zaman variable'i olusturabilirsiniz

        LocalTime istenenZaman = LocalTime.of(10,20,59);
        System.out.println(istenenZaman);



    }






}
