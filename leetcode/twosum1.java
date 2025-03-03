public class twosum1 {
    public static void main (String[] args){
        Solution solution = new Solution();
        int nums[] = {2,7,11,5};
        int target = 9;
        int result [] = solution.twosum1(nums,target);
        if(result.length == 2){
            System.out.printf("[%d, %d]" , result[0], result[1]);
        }
        else{
            System.out.printf("no solution found");
        }
    }
}
class Solution {
    public int [] twosum1(int [] nums, int target){
        int n = nums.length;
        for (int i=0;i<n-1;i++){
            for(int j =i+1; j<n ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {};
    }
}
