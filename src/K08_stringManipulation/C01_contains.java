package K08_stringManipulation;

import java.util.Scanner;

public class C01_contains {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir cümle girin: ");
        String metin = scanner.nextLine();

        if (metin.contains("ev")&&(metin.contains("is"))){
            System.out.println("Hem is lazim hem ev");
        } else if (metin.contains("ev")) {
            System.out.println("Home sweet home");
        } else if (metin.contains("is")) {
            System.out.println("Calismak guzeldir");
        }else System.out.println("Cok calisman lazim");


    }
    }

