package myWork.studentFullName;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("rahul");
        student.setMiddleName("kumar");
        student.setLastName("sharma");

      //  System.out.println("The first name of the student is : " + student.getFirstName());
      //  System.out.println("The middle name of the student is : " + student.getMiddleName());
       // System.out.println("the last name of the student is : " + student.getLastName());
        System.out.println("The full name of the student is : " + student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName());


    }
}
