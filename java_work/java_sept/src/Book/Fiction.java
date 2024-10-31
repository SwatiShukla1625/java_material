package Book;

public class Fiction  extends  BBook {
    String author;



    public Fiction(String author, String title, String genre){
        super(title, genre);
        this.author = author;
    }

    public void printDetails(){
        System.out.println("this is a Fiction book");
    }
}
