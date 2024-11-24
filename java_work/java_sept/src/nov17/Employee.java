package nov17;



import java.util.Date;

public final class Employee {
    private final int  age;
    private final String name;
    private final Date dob;
    private final Address address;


    public Employee(int age, String name, Date dob,Address address) {
        this.age = age;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }



    public int getAge() {
        return age;
    }

    public Date getDob() {
        return   new Date(this.dob.getTime());
    }

    public String getName() {
        return name;
    }
    public Address getAddress(){
        return new Address(address.getHouseNo(),address.getCity(),address.getState());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
