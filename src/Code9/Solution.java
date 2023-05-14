package Code9;

import java.io.BufferedReader;

/**
 * @author sasayaya
 * @create 2023/1/15 6:45
 */
class Solution {
    public boolean isPalindrome(int x) {
        String left = String.valueOf(x);

        StringBuilder right = new StringBuilder(left).reverse();
        for (int i = 0,j=0; i < left.length()&& j < right.length(); i++,j++) {
            if (left.charAt(i)!=right.charAt(j)){
                return  false;
            }
        }
        return true;
    }
}