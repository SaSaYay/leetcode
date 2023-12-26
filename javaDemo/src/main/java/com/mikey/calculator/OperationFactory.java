package com.mikey.calculator;

import com.mikey.calculator.impl.Add;
import com.mikey.calculator.impl.Sub;

/**
 * @author sasayaya
 * @create 2023/9/22 0:02
 */
public class OperationFactory {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        double result = operate.getResult(12, 1);
        System.out.println(result);
    }
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            default:
                break;
        }
        return operation;
    }
}
