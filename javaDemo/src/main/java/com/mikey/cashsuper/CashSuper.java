package com.mikey.cashsuper;

/**
 * @author sasayaya
 * @create 2023/10/10 22:33
 */
public class CashSuper implements ISale{
    protected ISale component;

    public void decorate(ISale component) {
        this.component = component;
    }

    @Override
    public double acceptCash(double price, int num) {
        var result = 0d;
        if (this.component!=null){
            result = this.component.acceptCash(price,num);
        }
        return result;
    }
}
