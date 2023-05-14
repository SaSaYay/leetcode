package Code409;

class Solution {
    public static void main(String[] args) {
        char a ='a';
        char b = 'A';
        System.out.println(a+0);
        System.out.println(b+0);
    }
    public int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1;
        }
        int[] list = new int[256];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            list[c-'A'] ++;
        }
        int count = 0;
        for (int i:list){
            if (i%2 != 0){
                count++;
            }
        }
        if (count == 0){
            count =  1;
        }
        System.out.println(count);
        return s.length()-count+1;

    }
}