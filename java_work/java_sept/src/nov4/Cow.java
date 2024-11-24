package nov4;

public class Cow extends Animal implements Eatable{

    @Override
    public void sound() {
        System.out.println("sound of cow is different from dog and cat");

    }

    @Override
    public void eat() {
        System.out.println("the cow eats grass");

    }
}
