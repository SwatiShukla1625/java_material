package nov17;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(101,"Brampton","Ontario");
        System.out.println("=======================Address  Detail=======================");
        System.out.println(address);
        System.out.println(address.hashCode());

        Date dob = new Date();
        Employee employee = new Employee(25,"Rahul", dob,address);
        System.out.println("=======================Employee  Detail=======================");
        System.out.println(employee);
        System.out.println(employee.hashCode());


        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
        }

        //Updating dob
        Date d1 = employee.getDob();
        d1.setTime(new Date().getTime());

        //updating address
        Address address1 = employee.getAddress();
        address1.setCity("Guelph");

        System.out.println("=======================Updated Address  Detail=======================");
        System.out.println(address1);//copied address
        System.out.println(address1.hashCode());

        System.out.println("=======================No affect on Address  Detail=======================");
        System.out.println(employee);
        System.out.println(employee.hashCode());

    }
}
