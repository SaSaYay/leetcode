package com.mikey.cashsuper;

/**
 * @author sasayaya
 * @create 2023/10/10 22:49
 */

public interface ISale {
    /**
     * 收款
     * @param price
     * @param num
     * @return double
     */
    double acceptCash(double price,int num);
}
