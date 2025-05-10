package Code10;

class Solution {
    public static boolean isMatch(String s, String p) {
        int m = s.length() + 1;
        int n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        //*放在正则第一位没有意义
        if ('*' == p.charAt(0)) {
            return false;
        }
        //空字符串相匹配
        dp[0][0] = true;
        //初始化dp第一行，即s为空字符串时和p的匹配方式
        for (int j = 2; j < n; j += 2) {
            if ('*' == (p.charAt(j - 1))) {
                dp[0][j] = dp[0][j - 2];
            }
        }
        //初始化dp第一列，即p为空的时候，s和p匹配情况
        for (int i = 1; i < m; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if ('*' == p.charAt(j - 1)) {
                    if (dp[i][j - 2]) {
                        dp[i][j] = true;
                    } else if (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || '.' == p.charAt(j - 2))) {
                        dp[i][j] = true;
                    }
                } else {
                    if (dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || '.' == p.charAt(j - 1))) {
                        dp[i][j] = true;
                    }
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        isMatch("mississippi","mis*is*ip*.");
    }
}