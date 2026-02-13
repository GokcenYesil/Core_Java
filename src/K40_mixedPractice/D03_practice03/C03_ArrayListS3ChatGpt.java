package K40_mixedPractice.D03_practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayListS3ChatGpt {

    public static void main(String[] args) {

        //"Laptop", "Mouse", "Keyboard", "Monitor
        //Senaryo:
        //
        //Eğer listede "Mouse" varsa
        //→ "Test Passed" yazdır
        //
        //Yoksa
        //→ "Test Failed" yazdır

        List<String> products= new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor"));


        if (products.contains("Mouse")){

            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        //Listede "Tablet" YOKSA
        //→ "Negative Test Passed" yazdır
        //
        //Varsa
        //→ "Negative Test Failed" yazdır


        if (!products.contains("Tablet")) {
            System.out.println("Negative Test Passed");
        }else System.out.println("Negative Test Failed");

    }
}
