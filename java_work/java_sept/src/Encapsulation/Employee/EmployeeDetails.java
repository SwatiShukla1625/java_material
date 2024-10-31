package Encapsulation.Employee;

public class EmployeeDetails {
     private String name;
     private int age;
     private double salary;

     public EmployeeDetails(String name, int age, double salary){
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>=0){
            this.salary =salary;
        }
        else{
            System.out.println("salary cannot be less than 0");
        }

    }
}
