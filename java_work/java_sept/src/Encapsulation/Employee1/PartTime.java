package Encapsulation.Employee1;

public class PartTime extends Employee{
   private int days;
   private double salary;

    public PartTime(int days,double salary){
        super(salary);
        this.days = days;
    }

    @Override
    public double calculateSalary() {
        System.out.println("salary depends on number of days");
        return days*salary;

    }
}
