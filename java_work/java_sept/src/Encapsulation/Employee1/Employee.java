package Encapsulation.Employee1;

public class Employee {
  private  double salary;

  public Employee(double salary){
      this.salary = salary;
  }

  public  double calculateSalary(){
      System.out.println("the person gets the complete salary  no matter how many hours or days he/she spends");
      return salary;

  }


}
