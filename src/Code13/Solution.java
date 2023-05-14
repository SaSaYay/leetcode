package Code13;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int mcmxciv = Solution.sol("MCMXCIV");
        System.out.println(mcmxciv);

    }
    public static int romanToInt(String s) {
//        int res = helper(s);
        int res = sol(s);
        return res;

    }

    private static int sol(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            int cur = map.get(chars[i]);
            if (i==chars.length-1){
                res+=cur;
                continue;
            }
            int next = map.get(chars[i+1]);
            if (cur==5||cur>=next||cur==1000||cur==50||cur==500){
                res+=cur;
                continue;
            }else {
                res+=(next-cur);
                i++;
                continue;
            }
        }

        return res;
    }

//    private int helper(String s) {
//        int res = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='M'){
//                res+=1000;
//                continue;
//            }else if(s.charAt(i)=='D'){
//                res+=500;
//                continue;
//            }else if (s.charAt(i)=='C'){
//                if (i==s.length()-1){
//                    res+=100;
//                    continue;
//                }
//                if (s.charAt(i+1)=='D'){
//                    res+=400;
//                    i++;
//                    continue;
//                }else if (s.charAt(i+1)=='M'){
//                    res+=900;
//                    i++;
//                    continue;
//                }else {
//                    res+=100;
//                    continue;
//                }
//            }else if (s.charAt(i)=='L'){
//                res+=50;
//                continue;
//            }else if(s.charAt(i)=='X'){
//                if (i==s.length()-1){
//                    res+=10;
//                    continue;
//                }
//                if (s.charAt(i+1)=='L'){
//                    res+=40;
//                    i++;
//                    continue;
//                }else if (s.charAt(i+1)=='C'){
//                    res+=90;
//                    i++;
//                    continue;
//                }else {
//                    res+=10;
//                    continue;
//                }
//            }else if(s.charAt(i)=='V'){
//                res+=5;
//                continue;
//            }else {
//                if (i==s.length()-1){
//                    res+=1;
//                    continue;
//                }
//                if (s.charAt(i+1)=='V'){
//                    res+=4;
//                    i++;
//                    continue;
//                }else if (s.charAt(i+1)=='X'){
//                    res+=9;
//                    i++;
//                    continue;
//                }else {
//                    res+=1;
//                    continue;
//                }
//            }
//        }
//        return res;
//    }
}