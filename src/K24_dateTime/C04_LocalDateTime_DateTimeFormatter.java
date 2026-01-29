package K24_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C04_LocalDateTime_DateTimeFormatter {
    public static void main(String[] args) {


        LocalDateTime ldt= LocalDateTime.now();



        // 19.12.2025 Cuma

        DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE");
        System.out.println(ldt.format(format1));

        // 19/Aralık /2025 297.gun

        DateTimeFormatter format2= DateTimeFormatter.ofPattern("dd/MMMM/yyyy DDD");

        System.out.println(ldt.format(format2));

        // 19 Ara 25

        DateTimeFormatter format3= DateTimeFormatter.ofPattern("dd MMM yy");
        System.out.println(ldt.format(format3));

        // 11:43           24 saatlik dilime gore

        DateTimeFormatter format4= DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(ldt.format(format4));


        // 10:19 am         12 saatlik dilime gore

        DateTimeFormatter format5= DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format5));

        DateTimeFormatter format6= DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);
        System.out.println(ldt.format(format6));

        String kucukHarfIle= ldt.format(format6).replace("AM","am")
                            .replace("PM","pm");

        System.out.println(kucukHarfIle);


        // 08:23:24         saat, dakika, saniye hepsi 2 basamakli ve 24 saate gore olsun


        DateTimeFormatter format7= DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(ldt.format(format7));

        // 8:3:24         saat, dakika, saniye hepsi tek basamakli olabilsin

        DateTimeFormatter format8= DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(ldt.format(format8));

        // Çar Dec 23 3:20 PM

        DateTimeFormatter format9= DateTimeFormatter.ofPattern("EEE MMM yy h:mm a",Locale.ENGLISH);

        String kucukHarf= ldt.format(format9).replace("AM","am")
                .replace("PM","pm");


        System.out.println(kucukHarf);


    }
}
