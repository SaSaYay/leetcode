package Decorator;

/**
 * @author sasayaya
 * @create 2023/8/1 22:45
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮"+name);
    }
}
