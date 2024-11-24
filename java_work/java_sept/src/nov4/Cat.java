package nov4;

public class Cat extends Animal implements Eatable{


    @Override
    public void sound() {
        System.out.println("the cat does meow meow");

    }

    @Override
    public void eat() {
        System.out.println("cat eats mouse");

    }
}
