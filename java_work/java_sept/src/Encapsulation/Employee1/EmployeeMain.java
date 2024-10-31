package Encapsulation.Employee1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(1000);
        Employee emp1 = new PartTime(20, 650);
        Employee emp2 = new FullTimeEmployee(40, 800);


        System.out.println("the salary of emp is : " + emp.calculateSalary());
        System.out.println("the salary of emp1 is : " + emp1.calculateSalary());
        System.out.println("the salary of emp2 is : " + emp2.calculateSalary());



    }
}
