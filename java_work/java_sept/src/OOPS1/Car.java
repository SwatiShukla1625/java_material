package OOPS1;

public class Car extends Vehicle {
    int door;

    public Car(String brand, int speed, int door) {
        super(brand, speed);
        this.door= door;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("number of doors in the car are : " + door);
    }
}