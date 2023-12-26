package com.mikey.decorator;

/**
 * @author sasayaya
 * @create 2023/10/9 23:09
 */
public class ConcreteDecoratorA extends Decorator{
    private String name;
    @Override
    public void operation() {
        if (component!=null){
            super.operation();
            System.out.println("我的名字叫" + name);
        }
    }

}
