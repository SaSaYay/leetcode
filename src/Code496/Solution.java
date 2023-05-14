package Code496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int [] res= new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.fill(res,-1);
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],i);
        }
        stack.push(0);
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i]<=nums2[stack.peek()]){
                stack.push(i);
            }else {
                while (!stack.isEmpty()&&nums2[i]>nums2[stack.peek()]){
                    if (map.containsKey(nums2[stack.peek()])){
                         res[map.get(nums2[stack.peek()])]=nums2[i];
                    }
                    stack.pop();
                }
                stack.push(i);
            }
        }

        return res;
    }
}

class Solution2 {
    public int[] dailyTemperatures(int[] temperatures) {
        int lens = temperatures.length;
        Stack<Integer> st = new Stack<>();

        int [] res = new int[lens];
        st.push(0);
        for (int i = 0; i < lens; i++) {
            if (temperatures[i]<=temperatures[st.peek()]){
                st.push(i);
            }else {
                while (!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                    res[st.peek()] = i-st.peek();
                    st.pop();
                }
                st.push(i);
            }
        }
        return res;
    }
}