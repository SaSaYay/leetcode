package Decorator;

import java.io.Console;
import java.time.LocalDate;
import java.util.*;

/**
 * @author sasayaya
 * @create 2023/8/1 22:52
 */
public class Main {
    public static void main(String[] args) {
//        Console cons = System.console();
//        String username = cons.readLine("User name: ");
//        char[] passwd = cons.readPassword("PassWord: ");
//        System.out.println("User name: " + username);
//        System.out.println("PassWord: " + String.valueOf(passwd));
        int age = 123;
        String name = "myk";

        System.out.printf("%d你好%s",age,name);
//        System.out.printf("%d你好%s",name,age);
        String property = System.getProperty("user.dir");
        System.out.println(property);


    }
}
