package nov4;

public class Dog extends Animal implements Eatable{

    @Override
    public void sound() {
        System.out.println("The dog barks");

    }

    @Override
    public void eat() {
        System.out.println("The dog eats bones");

    }
}
