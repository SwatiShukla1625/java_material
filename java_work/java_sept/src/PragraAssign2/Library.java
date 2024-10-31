package PragraAssign2;

import java.util.Scanner;

public class Library {
    String[] books = {"A","B","C","D","E","F"};

    public void searchProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the product you want to search");
        String name = sc.nextLine();

        boolean found = false;
        for(int i=0; i< books.length;i++){
            if(books[i].equalsIgnoreCase(name)){
                System.out.println("the product you want is : " + name);
                found = true;
            }
        }
    }

    public static void main(String[] args) {
        Library lb = new Library();
        lb.searchProduct();
    }

}
