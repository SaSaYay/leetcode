package Code8;

import java.time.LocalDate;

/**
 * @author sasayaya
 * @create 2023/3/23 16:20
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.myAtoi("+1"));
    }
    public static int myAtoi(String s) {
        int i = 0;
        int sym = 1;
        if (s == null || s == ""){
            return 0;
        }
//        去掉前导空格
        for ( ;i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                break;
            }
        }
//        去掉无关字符
        for ( ;i < s.length(); i++) {
            if (s.charAt(i)=='-'){
                sym = -1;
            } else if (s.charAt(i)=='+'){
                break;
            } else if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                break;
            }else if (s.charAt(i)>'9'||s.charAt(i)<'0'){
                return 0;
            }
        }
        //计算数的大小
        String res = "";
        for ( ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.'){
                break;
            }
            if (c>'9'||c<='0'){
                continue;
            }
            res = res+c;
        }
        if (res == null || res == ""){
            return 0;
        }
//        考虑超出范围的情况
        Long aLong = Long.valueOf(res)*sym;
        Long aLong1 = Long.valueOf(Integer.MAX_VALUE);
        Long aLong2 = Long.valueOf(Integer.MIN_VALUE);
        if (aLong>aLong1){
            return Integer.MAX_VALUE;
        }else if (aLong < aLong2){
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(res)*sym;
    }
}
