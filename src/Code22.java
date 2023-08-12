import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sasayaya
 * @create 2023/7/9 0:21
 */
public class Code22 {
    public static List<String> generateParenthesis(int n) {
        if(n==0){
            return new LinkedList<>();
        }
        ArrayList<List<String>> result = new ArrayList<>();
        ArrayList<String> list0 = new ArrayList<>();
        list0.add("");
//        System.out.println(list0);
        result.add(list0);
        result.add(new ArrayList<String>(Collections.singleton("()")));
//        System.out.println(result.toString());
        for (int i = 2; i < n+1; i++) {
            ArrayList<String> listNum = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> listIn = result.get(j);
                List<String> listOut = result.get(i - 1 - j);
//        整合n = i的其中一种情况
                for (String str1 : listIn){
                    for (String str2 : listOut){
                        String tmpRes = "("+str1+")"+str2;
                        listNum.add(tmpRes);
                    }
                }
            }
            result.add(listNum);
        }
        return result.get(n);
    }

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
