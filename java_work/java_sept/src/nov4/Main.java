package nov4;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
       Cow cow = new Cow();
       Cat cat = new Cat();

       dog.eat();
       cow.eat();
       cat.eat();

       dog.sound();
       cat.sound();
       cow.sound();
    }
}
