package Decorator;

import java.io.Console;
import java.util.*;

/**
 * @author sasayaya
 * @create 2023/8/1 22:52
 */
public class Main {
    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("PassWord: ");
        System.out.println("User name: " + username);
        System.out.println("PassWord: " + String.valueOf(passwd));

    }
}
