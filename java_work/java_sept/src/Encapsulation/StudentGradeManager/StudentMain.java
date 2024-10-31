package Encapsulation.StudentGradeManager;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 89,101);
        s1.getDetails();

        s1.setGrade(92);
        s1.setName("shayam");
        s1.setRollNumber(102);

        System.out.println("the name of the student is " + s1.getName());
        System.out.println("the roll number of the student is " + s1.getRollNumber());
        System.out.println("the grade of the student is " + s1.getGrade());
    }
}
