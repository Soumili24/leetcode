//input = [3,2,4], target = 6, output= [1,2]

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // Return empty array if no solution is found
    }
}
public class twosum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {2, 7, 11, 15}; // Example array
        int target = 9;             // Example target
        
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.printf("[%d, %d]%n", result[0], result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
    
}