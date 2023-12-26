package com.mikey.proxypattern;

/**
 * @author sasayaya
 * @create 2023/10/10 23:21
 */
public class Proxy implements GiveGifts{
    private Pursuit gg;

    public Proxy(Girl girl) {
        this.gg = new Pursuit(girl);
    }

    @Override
    public void show() {
        gg.show();
    }
}
