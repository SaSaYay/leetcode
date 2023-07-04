package Code14;

class Solution {

    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int res = ans.length();
        for (int j = 1; j < strs.length; j++) {//第几个词
            int i = 0;
            for (; i <ans.length()&&i<strs[j].length(); i++) {//第几个字母
                if (ans.charAt(i)!=strs[j].charAt(i)){
                    break;
                }
            }
            res = Math.min(res,i);
        }

        return ans.substring(0,res);
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(Solution.longestCommonPrefix(strs));
    }
}