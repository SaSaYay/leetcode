package com.mikey.decorator;

/**
 * @author sasayaya
 * @create 2023/10/9 23:05
 */
abstract class Decorator extends Component{
    protected Component component;
    @Override
    public void operation() {
        if (component!=null){
            component.operation();
        }
    }
    public void setComponent(Component component) {
        this.component = component;
    }
}
