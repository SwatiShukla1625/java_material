package Encapsulation.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails("Ajay" , 35, 10000);
        System.out.println("the name of the employee is : " + e.getName());
        System.out.println("the age of the employee is : " + e.getAge());
        System.out.println("the salary of the employee is : " + e.getSalary());

        e.setSalary(-4000);
        e.setSalary(9000);
        System.out.println("the updated salary of the employee is : " + e.getSalary());
    }
}
