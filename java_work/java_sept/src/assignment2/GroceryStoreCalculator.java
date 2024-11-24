package assignment2;

import java.util.Scanner;

public class GroceryStoreCalculator {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
        double[] pricesPerKg = {2.5, 1.2, 3, 5.5, 8.5};
        getTotal(fruits,pricesPerKg);
    }

    public static void getTotal(String[] fruits, double[] pricesPerKg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the fruit");
        String fruit = sc.nextLine();
        System.out.println("enter the quantity in kg");
        double quantity = sc.nextDouble();

        boolean found = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(fruit)) {
                double totalPrice = quantity * pricesPerKg[i];

                System.out.println("the price of the fruit " + fruits[i] + "is :" + totalPrice);
                found = true;

            }

        }
        if(!found){
            System.out.println("this fruit is not available");
        }
    }
}