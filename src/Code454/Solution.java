package Code454;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author sasayaya
 * @create 2022/3/18 17:24
 */
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map =  new HashMap<>();
        int temp ;
        int res = 0;
        for (int i : nums1){
            for (int j : nums2){
                temp = nums1[i]+nums2[j];
                if (map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                }else {
                    map.put(temp,1);
                }
            }
        }
        for (int i :nums3){
            for (int j : nums4){
                temp = i+j;
                if (map.containsKey(0-temp)){
                    res += map.get(0-temp);
                }
            }
        }
        return res;
    }
}