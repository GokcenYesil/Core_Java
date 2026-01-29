package K24_dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Scanner;

public class C03_LocalDate
{
    public static void main(String[] args) {
        // Japanyo'daki tarihi yazdirin


        LocalDate japanDate= LocalDate.now(ZoneId.of("Japan"));

        System.out.println(japanDate);

// Hawai'deki tarihi yazdirin (Pacific/Honolulu)

        LocalDate hawaiiDate= LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(hawaiiDate);

// 30 temmuz 2013 icin bir tarih olusturun

        LocalDate bulunanTarih= LocalDate.of(2013,7,30);
        System.out.println(bulunanTarih);



// 30 temmuz 2013'de dogan birinin su an kac yasinda oldugunu yazdirin

        LocalDate turkiye= LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(Period.between(bulunanTarih, turkiye));


// kullanicidan alinan iki dogum tarihini karsilastirarak
        // hangisinin daha once dogdugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci kişinin doğum tarihini YYYY-MM-DD şeklinde yazınız: ");
        LocalDate birinciTarih= LocalDate.parse(scanner.nextLine());

        System.out.println("Lütfen ikinci kişinin doğum tarihini YYYY-MM-DD şeklinde yazınız: ");
        LocalDate ikinciTarih = LocalDate.parse(scanner.nextLine());


        if (birinciTarih.isBefore(ikinciTarih)) {
            System.out.println("Birinci kişi daha önce doğmuştur...");

        } else if (birinciTarih.isAfter(ikinciTarih)) {
            System.out.println("Birinci kişi daha sonra doğmuştur...");

        }else {
            System.out.println("Kişiler aynı tarihte doğmuştur...");
        }




// 1900 yilinin artik yil olup olmadigini yazdirin

        LocalDate artikYilMi= LocalDate.of(1900,1,1);

        System.out.println(artikYilMi.isLeapYear());//false


        System.out.println(turkiye.getDayOfYear());//353

        System.out.println(turkiye.getDayOfWeek());//FRIDAY

        System.out.println(turkiye.getDayOfMonth());//19

        System.out.println(turkiye.getMonth());//DECEMBER

        System.out.println(turkiye.getMonthValue());//12

    }
}
