package test;

import java.awt.image.VolatileImage;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sasayaya
 * @create 2022/11/13 21:16
 */
public class Solution {
    private volatile long i = 0;
    private Thread t1,t3,t2;
    private volatile int flag = 0;



    public static void main (String[]args){
        // 提供的 JSON 数据
        String jsonData = "{\"123\":\"456\", \"1234\":\"4567\", \"12345\":\"45678\", \"abc\":{\"1234abc\":\"4567\", \"12345abc\":\"45678\"}}";

        // 要查找的键
        String keyToFind = "1234abc";

        // 构建正则表达式
        String regex = "\"" + keyToFind + "\":\"([^\"]+)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(jsonData);

        // 查找并打印匹配的结果
        if (matcher.find()) {
            String value = matcher.group(1);
            System.out.println("Value for key '" + keyToFind + "': " + value);
        } else {
            System.out.println("Key '" + keyToFind + "' not found.");
        }
    }


    public void runThread(){
        t1 = new Thread(new Thread1());
        t2 = new Thread(new Thread2());
//        t3 = new Thread(new Thread1());
        t1.start();
        t2.start();
//        t3.start();
    }
    public class Thread1 implements Runnable{
        @Override
        public void run() {
            while (i<1000){

            System.out.println(Thread.currentThread().getName() + " " + i);
            i++;
//                i+=1;
            }

        }
    }
    public class Thread2 implements Runnable{
        @Override
        public void run() {
            while (i<1000) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                i++;
//                i+=1;

            }
        }
    }
}

