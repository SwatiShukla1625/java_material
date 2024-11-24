package myWork.studentFullName;

public class Student {
    private String firstName;
    private  String lastName;
    private  String middleName;
    private  String fullName;

    public void setFirstName(String firstName) {
        if (firstName.length() >= 2 && firstName.length() <= 25) {
            this.firstName = firstName.substring(0).toUpperCase().concat(firstName.substring(1).toLowerCase());
        }
        System.out.println("the first name of the person is : " + firstName);
    }
    public void setLastName(String lastName){
        if(lastName.length()>=2 && lastName.length()<=25){
            this.lastName = lastName.substring(0,1).toUpperCase().concat(lastName.substring(1).toLowerCase());
        }
        System.out.println("the last name of the person is : " + lastName);
    }
    public void setMiddleName(String middleName){
        if(middleName.length()>=2 && middleName.length()<=25){
            this.middleName = middleName.substring(0,1).toUpperCase().concat(middleName.substring(1).toLowerCase());
        }
        System.out.println("the middle name of the person is : " + middleName);
    }
    private String prepareFullName(){
        this.fullName = this.firstName + " " + this.middleName + " " + this.lastName;
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}

