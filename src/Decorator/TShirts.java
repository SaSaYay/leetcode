package Decorator;

/**
 * @author sasayaya
 * @create 2023/8/1 22:50
 */
public class TShirts extends Finery{
    @Override
    public void show() {
        component.show();
        System.out.println("Tshirt");
    }
}
