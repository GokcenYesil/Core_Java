package K10_loops;

public class G16_nestedForTersUcgen {

    public static void main(String[] args) {

//         *******
//          *****
//           ***
//            *
//
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Boşluklar
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Yıldızlar
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
