package com.mikey.arraysComportor;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sasayaya
 * @create 2023/9/2 15:38
 */
public class ArraysTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (Integer i:integers){
            System.out.println(i);
        }
    }
}
