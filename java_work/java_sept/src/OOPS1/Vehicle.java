package OOPS1;

public class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed){
        this.brand= brand;
        this.speed = speed ;
    }

    public void displayInfo(){
        System.out.println("the brand of the car is : " + brand);
        System.out.println("the speed of the bike is :" + speed);
    }
}
