package com.mikey.decorator;

class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("做一些具体的事情");
    }
}
