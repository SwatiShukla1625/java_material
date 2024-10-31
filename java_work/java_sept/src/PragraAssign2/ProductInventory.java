package PragraAssign2;

import java.util.Scanner;

public class ProductInventory {
    private String[] products = {"laptop","T.V","smartphones","smartwatch","tablets","headphones"};
    private int[] prices = {900,1500,700,500,400,200};

    public void displayProducts(){
        System.out.println("products inventory");
        for(int i=0;i< products.length;i++){
            System.out.println("the product with price : " + products[i] + " " + prices[i]);
        }
    }
    public void searchProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the product you want to search");
        String name = sc.nextLine();

        boolean found = false;
        for(int i=0; i< products.length; i++){
            if(products[i].equalsIgnoreCase(name)){
                System.out.println(products[i] +  prices[i]);
                found = true;
            }
        }
    }

    public static void main(String[] args) {
        ProductInventory iv = new ProductInventory();
        iv.displayProducts();
        iv.searchProduct();
    }
}
