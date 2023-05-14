package Code739;

import java.util.Stack;

class Solution {
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