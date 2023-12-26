package com.mikey.cashsuper;

/**
 * @author sasayaya
 * @create 2023/10/10 22:36
 */
public class CashNormal implements ISale{
    @Override
    public double acceptCash(double price, int num) {
        return price*num;
    }
}
