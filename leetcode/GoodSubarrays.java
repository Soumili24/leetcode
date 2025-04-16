import java.util.HashMap;
import java.util.Map;

public class GoodSubarrays {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        long totalPairs = 0;
        long result = 0;

        for (int right = 0; right < nums.length; right++) {
            int rightVal = nums[right];
            int count = freq.getOrDefault(rightVal, 0);
            totalPairs += count;
            freq.put(rightVal, count + 1);

            while (totalPairs >= k) {
                result += nums.length - right; // all subarrays from current [left, right] to [left, nums.length - 1]
                int leftVal = nums[left];
                int leftCount = freq.get(leftVal);
                totalPairs -= leftCount - 1;
                freq.put(leftVal, leftCount - 1);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        GoodSubarrays sol = new GoodSubarrays();

        int[] nums1 = {1, 1, 1, 1, 1};
        int k1 = 10;
        System.out.println("Output 1: " + sol.countGood(nums1, k1)); // Output: 1

        int[] nums2 = {3, 1, 4, 3, 2, 2, 4};
        int k2 = 2;
        System.out.println("Output 2: " + sol.countGood(nums2, k2)); // Output: 4
    }
}
