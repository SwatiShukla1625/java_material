package Encapsulation.Employee1;

public class FullTimeEmployee extends Employee{
  private  int hours;
  private double salary;



    public FullTimeEmployee(int hours, double salary){
        super(salary);
        this.hours = hours;
    }
    @Override
    public  double calculateSalary() {
        System.out.println("the salary of the person depends on the no of hours");
        return salary*hours;
    }

}
