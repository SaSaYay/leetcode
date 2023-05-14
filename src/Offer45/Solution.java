package Offer45;

import java.util.Arrays;

class Solution {
    public String minNumber(int[] nums) {
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(res,(x,y)->(x+y).compareTo(y+x));
        StringBuilder ans = new StringBuilder();
        for (String s:res){
            ans.append(s);
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String filename = new String("abc").intern();
        String suffix = "abc";
        System.out.println(filename==suffix);
    }
}