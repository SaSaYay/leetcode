package com.mikey.cashsuper;

/**
 * @author sasayaya
 * @create 2023/10/10 22:37
 */
public class CashRebate extends CashSuper{
    private double moneyRepeat = 1d;

    public CashRebate(double moneyRepeat) {
        this.moneyRepeat = moneyRepeat;
    }

    @Override
    public double acceptCash(double price, int num) {
        var result = price*num*moneyRepeat;
        return super.acceptCash(result,1);
    }
}
