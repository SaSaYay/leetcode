package Code34;

import java.lang.annotation.Target;
import java.util.TreeSet;

/**
 * @author sasayaya
 * @create 2022/3/7 21:41
 */
public class Solution {
     int  getRightBorder(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int rightBorder = -2;
        while (left <= right) {
            int mid = left + ((right - left)/2);
            if (nums[mid] > target) {
                right = mid - 1;
            } else {// ==  <
                left = mid + 1;
                rightBorder = left;
            }
        }
        return rightBorder;
    }

     int  getLeftBorder(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int leftBorder = -2;
        while (left <= right) {
            int mid = left + ((right - left)/2);
            if (nums[mid] >= target) {
                right = mid - 1;
                leftBorder = right;
            } else {//  <
                left = mid + 1;
            }
        }
        return leftBorder;
    }

     int[] searchRange(int[] nums, int target) {
        int leftBorder =getLeftBorder(nums,target);
        int rightBorder = getRightBorder(nums, target);
        if (leftBorder == -2 || rightBorder == -2 ){
            return new int [] {- 1,-1};
        }
        if ((rightBorder - leftBorder) > 1){
            return new int[] {leftBorder+1,rightBorder-1};
        }
        return  new int[] {-1, -1};
    }
}
