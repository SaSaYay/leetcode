package com.mikey.cashsuper;

import org.springframework.ui.Model;

/**
 * @author sasayaya
 * @create 2023/10/10 22:38
 */
public class CashReturn extends CashSuper{
    private double moneyRepeat = 0d;
    private double moneyCondition = 0d;

    public CashReturn(double moneyRepeat, double moneyCondition) {
        this.moneyRepeat = moneyRepeat;
        this.moneyCondition = moneyCondition;
    }

    @Override
    public double acceptCash(double price, int num) {
        double res = price*num;
        if (moneyCondition > 0 && res>moneyCondition){
            res = res - Math.floor(res/ moneyCondition)*moneyRepeat;
        }
        return super.acceptCash(res,1);
    }
}
