package com.mikey.calculator.impl;

import com.mikey.calculator.Operation;

/**
 * @author sasayaya
 * @create 2023/9/22 0:01
 */
public class Sub implements Operation {
    @Override
    public double getResult(double numA, double numB) {

        return numA-numB;
    }
}
