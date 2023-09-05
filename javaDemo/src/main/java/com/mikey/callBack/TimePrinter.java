package com.mikey.callBack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

/**
 * @author sasayaya
 * @create 2023/9/2 15:17
 */
public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("the time is " + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args) throws InterruptedException {
        TimePrinter listener = new TimePrinter();
        Timer timer = new Timer(1000, listener); // 正确的初始化 Timer
        timer.start(); // 启动定时器

        JOptionPane.showMessageDialog(null,"Quit");
        Thread.sleep(10000000);
        System.exit(0);

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        System.out.println(Arrays.toString(list.toArray()));

        String[] strings = list.toArray(new String[100]);
        System.out.println(Arrays.toString(strings));
    }

}
