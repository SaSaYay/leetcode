package Code977;

/**
 * @author sasayaya
 * @create 2022/3/9 19:13
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int k = nums.length-1;
        int j = nums.length-1;
        int[] result = new int[nums.length];
        for (int i = 0;i <= j;){
            if (Math.abs(nums[i]) < Math.abs(nums[j]) ){
                result[k] = nums[j]*nums[j];
                k--;
                j--;
            }else {//  i>=j
                result[k] = nums[i]*nums[i];
                k--;
                i++;
            }
        }
        return result;
    }
}
