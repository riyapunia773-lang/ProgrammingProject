
package task2;

import java.util.Random;

public class Orientationtask3_2 {
    public static void main(String[] args) {

        int[] ages = {18, 19, 20, 21, 22};
        int[] limits = {10, 35, 75, 90, 100};

        Random random = new Random();

        for (int run = 1; run <= 3; run++) {
            int[] counts = new int[ages.length];

            for (int i = 0; i < 1000; i++) {
                int number = random.nextInt(100);

                for (int j = 0; j < limits.length; j++) {
                    if (number < limits[j]) {
                        counts[j]++;
                        break;
                    }
                }
            }

            System.out.println("Run " + run);

            for (int i = 0; i < ages.length; i++) {
                System.out.println("Age " + ages[i] + ": " + counts[i]);
            }

            System.out.println();
        }
    }
}
