package Decorator;

/**
 * @author sasayaya
 * @create 2023/8/1 22:51
 */
public class Shoes extends Finery{
    @Override
    public void show() {
        component.show();
        System.out.println("Shoes");
    }
}
