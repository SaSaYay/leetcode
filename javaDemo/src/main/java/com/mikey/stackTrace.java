package com.mikey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Scanner;

/**
 * @author sasayaya
 * @create 2023/9/3 14:12
 */
public class stackTrace {
    public static void main(String[] args) {
        try(var in =new Scanner(System.in)){
            System.out.println("输入:");
            int n = in.nextInt();
            factorial(n);
        }
    }

    public static int factorial(int n){
        System.out.println("factorial(" + n + ")");
        StackWalker walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if (n<=1){
            r =1;
        }else {
            r = n*factorial(n-1);
        }
        System.out.println("阶乘结果是:" + r);
        ActionListener listener = (ActionEvent event)-> Instant.ofEpochMilli(event.getWhen());
        return r;
    }
}
