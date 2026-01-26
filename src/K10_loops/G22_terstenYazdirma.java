package K10_loops;

import java.util.Scanner;

public class G22_terstenYazdirma {

    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve String’i tersten yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin girin: ");
        String metin = scanner.nextLine();

        for (int i =metin.length()-1; i>=0 ; i--) {

            System.out.print(metin.charAt(i));



        }
    }
}
