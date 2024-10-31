package ConstructorInheritence;

public class Car extends Vehicle{
    String color;
    String brand;

   public Car(String color, String brand){
       super(color);
       this.brand = brand;
   }

   public void displayCarResult(){
       System.out.println("the brand of the car is toyota");
   }
}
