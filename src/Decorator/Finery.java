package Decorator;

/**
 * @author sasayaya
 * @create 2023/8/1 22:46
 */
public class Finery extends Person{
    protected Person component;

    public void Decorate(Person component){
        this.component = component;
    }
    @Override
    public void show(){
        if (component!=null){
            component.show();
        }
    }
}
