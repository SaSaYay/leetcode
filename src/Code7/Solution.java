package Code7;

/**
 * @author sasayaya
 * @create 2023/1/4 1:47
 */
class Solution {
    public static void main(String[] args) {
        int reverse = Solution.reverse(-2147483648);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数

            if (res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && tmp>Integer.MAX_VALUE%10)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 && tmp<Integer.MIN_VALUE%10)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }
}
