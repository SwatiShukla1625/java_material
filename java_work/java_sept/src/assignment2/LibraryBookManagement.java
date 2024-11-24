package assignment2;

import java.util.Scanner;

public class LibraryBookManagement {
    public static void main(String[] args) {
        String[] books = {"Book A", "Book B", "Book C","Book D","Book E","Book F"};
        updateBookTitle(books);
        searchBook(books);
    }

    public static void searchBook(String[] books){
        System.out.println("Enter the name of the book you want to search");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        boolean found = false;
        for(String book : books){
            if(book.equalsIgnoreCase(title)){
                System.out.println("Book found : " + title);
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Book is not found");
        }
    }
    public static void updateBookTitle(String[] books){
        System.out.println("Enter the name of the book you want to update");
        Scanner sc = new Scanner(System.in);
        String oldTitle = sc.nextLine();
        System.out.println("Enter the new book title you want to update in your records");
        String newTitle = sc.nextLine();

        boolean updated = false;
        for(int i=0; i< books.length;i++){
            if(books[i].equalsIgnoreCase(oldTitle)){
                updated = true;
                System.out.println("Updated in the records");
            }
        }
        if(!updated){
            System.out.println("Book not found");
        }

    }

}
