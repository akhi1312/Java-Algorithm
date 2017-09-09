package akhi.java.string;
import akhi.java.sorting.swap;

/**
 * Created by akhi on 9/4/17.
 */
public class TestString {

    // O(n^2) time and O(1) space
    public static void countFrequenciesNaive(int[] input) {
        int n = input.length;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (input[j] == i) {
                    count++;
                }
            }
            System.out.println(i + " " + count);
        }
    }

    // O(n) time and O(n) space
    public static void countFrequencies(int[] input) {
        int n = input.length;
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[input[i] - 1]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + " " + count[i]);
        }
    }

    // O(n) time and O(1) space
    public static void countfrequenciesEfficient(int input[]) {

        int n = input.length;
        for (int i = 0; i < n; i++) {
            input[i]--;
        }

        for (int i = 0; i < n; i++) {
            input[input[i] % n] += n;
        }

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + input[i] / n);
            // Change the element back to original value
            input[i] = input[i] % n + 1;
        }
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 20, 2, 5};
        countfrequenciesEfficient(input);
    }
}