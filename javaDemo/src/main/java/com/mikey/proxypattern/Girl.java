package com.mikey.proxypattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;

/**
 * @author sasayaya
 * @create 2023/10/10 23:14
 */
public class Girl implements Cloneable{
    @Autowired
    private Environment environment;
    private String name;

    @Override
    public Girl clone() throws CloneNotSupportedException {

        Girl girl = (Girl) super.clone();
        return girl;
    }
    public String getName() {
        return environment.getProperty("123")+name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
