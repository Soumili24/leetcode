import java.util.*;

public class DigitSumGroups {
    public static int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, map.get(sum));
        }

        int count = 0;
        for (int size : map.values()) {
            if (size == maxSize) {
                count++;
            }
        }

        return count;
    }

    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // add the last digit
            num /= 10;        // remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 13;
        int n2 = 2;
        System.out.println("Output for n = 13: " + countLargestGroup(n1)); // Output: 4
        System.out.println("Output for n = 2: " + countLargestGroup(n2));  // Output: 2
    }
}
