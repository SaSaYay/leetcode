package com.mikey.proxypattern;

/**
 * @author sasayaya
 * @create 2023/10/10 23:14
 */
public class Girl implements Cloneable{
    private String name;

    @Override
    public Girl clone() throws CloneNotSupportedException {
        Girl girl = (Girl) super.clone();
        return girl;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
