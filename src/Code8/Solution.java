package Code8;

/**
 * @author sasayaya
 * @create 2023/3/23 16:20
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.myAtoi("+    42"));
    }
    public static int myAtoi(String s) {
        int i = 0;
        int sym = 1;
        for ( ;i < s.length(); i++) {
            if (s.charAt(i)=='-'){
                sym = -1;
            }else if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                break;
            }
        }
        int res = 0;
        for ( ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>'9'||c<'0'){
                break;
            }
//            if (s.charAt(i)=='-'){
//                builder.append(s.charAt(i));
//            }else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
//                builder.append(s.charAt(i));
//            }else {
//                continue;
//            }
        }

        return Integer.valueOf(Integer.MAX_VALUE);
    }
}
