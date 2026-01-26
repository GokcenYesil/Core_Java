package K10_loops;

public class G09_bolenSayisi {
    public static void main(String[] args) {

        //40 sayısını kalansız bölen pozitif tam sayılar

        int sayi= 40;

        System.out.print("40 sayısının pozitif bölenleri: ");

        for (int i = 1; i <=40 ; i++) {

            if (sayi%i==0){

                System.out.print(i+" ");
            }

        }

    }
}
