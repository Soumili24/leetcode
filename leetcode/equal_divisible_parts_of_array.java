public class equal_divisible_parts_of_array {

    // Define the countPairs method
    public int countPairs(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution(); // Create object to call non-static method

        int[] nums1 = {3, 1, 2, 2, 2, 1, 3};
        int k1 = 2;
        System.out.println("Output: " + sol.countPairs(nums1, k1)); // Expected: 4

        int[] nums2 = {1, 2, 3, 4};
        int k2 = 1;
        System.out.println("Output: " + sol.countPairs(nums2, k2)); // Expected: 0
    }
}
