package Code8;

import java.time.LocalDate;

/**
 * @author sasayaya
 * @create 2023/3/23 16:20
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.myAtoi("2147483647"));
    }

    public static int myAtoi(String s) {
        char[] chars = s.trim().toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        int bndry = Integer.MAX_VALUE / 10;
        int res = 0;
        int sign = 1;
        if (chars[0] == '-') {
            sign = -1;
        }
        for (char c : chars) {
            if (c < '0' || c > '9') {
                break;
            }
            if (res > bndry || (res == bndry && c > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + c - '0';
        }
        return sign * res;
    }
}
