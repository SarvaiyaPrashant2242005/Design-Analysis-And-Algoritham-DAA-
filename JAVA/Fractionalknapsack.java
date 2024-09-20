import java.util.Arrays;
import java.util.Comparator;

public class Fractionalknapsack {
    public static void main(String[] args) {
        int val[] = {100,120,160};
        int weight[] = {50,40,40};
        int W = 100;

        double ratio[][] = new double[val.length][2]; // To store item index and value-to-weight ratio

        // Step 1: Calculate ratio of value per weight for each item
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; // store the item index
            ratio[i][1] = val[i] / (double) weight[i]; // store the value-to-weight ratio
        }

        // Step 2: Sort items by value-to-weight ratio in descending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> -o[1]));

        double maxValue = 0;
        int currentWeight = 0;

        // Step 3: Pick items based on ratio, starting from the highest
        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0];
            if (currentWeight + weight[idx] <= W) {
                // If we can take the whole item
                currentWeight += weight[idx];
                maxValue += val[idx];
            } else {
                // Take the fraction of the remaining item that fits in the knapsack
                int remainingCapacity = W - currentWeight;
                maxValue += val[idx] * ((double) remainingCapacity / weight[idx]);
                break; // Knapsack is full, exit the loop
            }
        }

        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
