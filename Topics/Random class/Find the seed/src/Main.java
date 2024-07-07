import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Find the best seed and its maximum value
        int[] result = findSeedWithMinMax(a, b, n, k);

        // Print results
        System.out.println(result[0]);
        System.out.println(result[1]);
    }


    public static int[] findSeedWithMinMax(int a, int b, int n, int k) {
        int bestSeed = -1;
        int minMaxValue = Integer.MAX_VALUE;

        for (int seed = a; seed <= b; seed++) {
            Random random = new Random(seed);
            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int number = random.nextInt(k);
                if (number > maxValue) {
                    maxValue = number;
                }
            }
            if (maxValue < minMaxValue || (maxValue == minMaxValue && seed < bestSeed)) {
                minMaxValue = maxValue;
                bestSeed = seed;
            }
        }

        return new int[]{bestSeed, minMaxValue};
    }

}