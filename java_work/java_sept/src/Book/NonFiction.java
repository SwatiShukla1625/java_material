package Book;

public class NonFiction extends BBook{
    double price;



    public NonFiction(double price, String title, String genre){
        super(title,genre);
        this.price = price;
    }

    public void printNonFiction(){
        System.out.println("this is a non fiction book");
    }
}
