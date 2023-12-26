package com.mikey.proxypattern;

import java.io.PrintStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;


import org.apache.commons.lang3.ObjectUtils;

import javax.swing.*;


/**
 * @author sasayaya
 * @create 2023/10/10 23:22
 */
public class Main {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        String a = null;
        LocalDate localDate = Objects.requireNonNullElse(now, LocalDate.of(2001, 1, 1));
        LocalDate localDate2 = Objects.requireNonNullElseGet(now, ()->LocalDate.of(2001, 1, 1));
        Timer timer = new Timer(1000, event -> System.out.println(event.getWhen()));
        PrintStream out = System.out;
        


    }
}
