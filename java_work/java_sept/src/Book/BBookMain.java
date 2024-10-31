package Book;

public class BBookMain {
    public static void main(String[] args) {
        Fiction f1 = new Fiction("ABC", "fiction","hello");
        NonFiction f2 = new NonFiction(100,"XYZ","non fiction");
        f1.printDetails();
        f2.printNonFiction();
    }
}
