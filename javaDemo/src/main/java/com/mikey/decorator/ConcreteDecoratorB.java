package com.mikey.decorator;

/**
 * @author sasayaya
 * @create 2023/10/9 23:15
 */
public class ConcreteDecoratorB extends Decorator{
    @Override
    public void operation() {
        if (component!=null){
            super.operation();
            this.specialBehave();
        }
    }
    private void specialBehave(){
        System.out.println("B的独有操作");
    }
}
