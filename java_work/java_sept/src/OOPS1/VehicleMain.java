package OOPS1;

public class VehicleMain {
    public static void main(String[] args) {
        Car c = new Car("Toyota" , 80 , 4);
        Bike b = new Bike("Indian",85,"Cruiser");
        c.displayInfo();
        b.displayInfo();
    }
}
