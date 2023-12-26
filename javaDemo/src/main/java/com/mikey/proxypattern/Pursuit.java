package com.mikey.proxypattern;

/**
 * @author sasayaya
 * @create 2023/10/10 23:13
 */
public class Pursuit implements GiveGifts,Cloneable{
    private Girl mm;
    @Override
    public Pursuit clone() throws CloneNotSupportedException {
        Pursuit pursuit = (Pursuit) super.clone();
        pursuit.mm = mm.clone();
        return pursuit;
    }

    public Pursuit(Girl mm) {
        this.mm = mm;
    }

    @Override
    public void show(){
        System.out.println("你好," + mm.getName());
    }

}
