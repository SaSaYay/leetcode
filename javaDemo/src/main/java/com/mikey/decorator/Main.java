package com.mikey.decorator;

/**
 * @author sasayaya
 * @create 2023/10/9 23:17
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent a = new ConcreteComponent();
        ConcreteDecoratorA A = new ConcreteDecoratorA();
        ConcreteDecoratorB B = new ConcreteDecoratorB();
        B.setComponent(A);
        A.setComponent(a);
        B.operation();
    }
}
