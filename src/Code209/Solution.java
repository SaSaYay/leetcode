package Code209;

import com.sun.source.doctree.SummaryTree;

/**
 * @author sasayaya
 * @create 2022/3/9 19:37
 */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int left = 0;
            int right = 0;
            int sum =0;
            int result = Integer.MAX_VALUE;
            for (right = 0; right < nums.length; right++){
                sum += nums[right];
                while (sum >= target){
                    result = Math.min(result,right-left+1);
                    sum-=nums[left++];
                }
            }
            return result==Integer.MAX_VALUE? 0:result;
    }
}