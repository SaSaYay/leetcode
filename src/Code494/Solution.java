package Code494;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num:nums){
            sum+=num;
        }
        if (Math.abs(target)>sum){
            return 0;
        }
        if ((target+sum)%2!=0){
            return 0;
        }
        int size = (target+sum)/2;
        int[] dp = new int[size+1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = size; j >=nums[i] ; j--) {
                dp[j] += dp[j-nums[i]];
            }
        }
        return dp[size];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,1,1,1};
        System.out.println(solution.findTargetSumWays(nums, 3));
    }
}