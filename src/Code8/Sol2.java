package Code8;

/**
 * @author sasayaya
 * @create 2024/2/17 22:13
 */
public class Sol2 {
    public static void main(String[] args) {
        String s = "";
        int i = s.indexOf('0');
        System.out.println(Sol2.myAtoi("  -0012a42"));
    }
    public static int myAtoi(String s) {
        s = s.trim();
        //去掉格式不对的情况
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = '0'; i <= '9'; i++) {
            char c = (char) i;
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);
            if (start == -1 || end == -1)  {
                continue;
            }
            if (end> max){
                max = end;
            }
            if (start< min){
                min = start;
            }
        }
        //没有数字
        if (max == 0 && min == Integer.MAX_VALUE){
            return 0;
        }
        //前边有多个字符串错
        if (min> 1){
            return 0;
        }
        //前边有字符串都错
        if (min> 0 && s.charAt(min-1)!='+' && s.charAt(min-1)!='-'){
            return 0;
        }
        //考虑小数
        String tmp = s.substring(min,max+1);
        if (tmp.indexOf('.') != tmp.lastIndexOf('.')){
            return 0;
        }
        if (tmp.indexOf('.') != -1){
            tmp = tmp.substring(min,tmp.indexOf('.'));
        }
        //考虑中间有字符串的情况,中间可以有,思路不对
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i)>'9' || tmp.charAt(i)<'0'){
                return 0;
            }
        }
        //考虑多余的0
//        if (tmp.indexOf('0')!=-1){
//            boolean flag = false;
//            for (int i = tmp.indexOf('0'); i < tmp.lastIndexOf('0'); i++) {
//                if (tmp.charAt(i)!='0'){
//                    flag = true;
//                }
//            }
//            if (flag){
//                tmp = tmp.substring(tmp.lastIndexOf('0')+1);
//            }
//        }

        int sub0 = -1;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i)!='0'){
                break;
            }
            sub0 = i;
        }
        if (sub0 != -1){
            tmp = tmp.substring(sub0+1);
        }


        //考虑过大过小
        int sym = 1;
        if (min> 0 &&  s.charAt(min-1)=='-'){
            sym = -1;
        }
        String maxStr = String.valueOf(Integer.MAX_VALUE);
        String minStr = String.valueOf(Integer.MIN_VALUE).substring(1);
        if (tmp.length()>maxStr.length()){
            if (sym == 1){
                return Integer.MAX_VALUE;
            }else {
                return Integer.MIN_VALUE;
            }
        }
        if (tmp.length() == maxStr.length()){
            if (sym == 1 && tmp.equals(maxStr)){
                return Integer.MAX_VALUE;
            }
            if (sym == -1 && tmp.equals(minStr)){
                return Integer.MIN_VALUE;
            }
            for (int i = 0; i < tmp.length(); i++) {
                if (sym == 1 && tmp.charAt(i)>maxStr.charAt(i)){
                    return Integer.MAX_VALUE;
                }
                if (sym == -1 &&tmp.charAt(i)>minStr.charAt(i)){
                    return Integer.MIN_VALUE;
                }
            }
        }
        if (tmp == ""){
            return 0;
        }
        //整合数据
        return  Integer.valueOf(tmp)*sym;
    }
}
