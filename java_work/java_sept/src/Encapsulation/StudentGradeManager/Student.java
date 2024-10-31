package Encapsulation.StudentGradeManager;

public class Student {
    private String name;
    private int grade;
    private int rollNumber;

    public Student(String name, int grade, int rollNumber) {
        this.grade = grade;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 90 && grade <= 100) {
            System.out.println("student got fisrt position");
        } else if (grade >= 70 && grade <= 89) {
            System.out.println("student got second position");
        } else if (grade >= 50 && grade <= 79) {
            System.out.println("student got third position");
        } else {
            System.out.println("student fails");
        }
    }
        public void getDetails () {
            System.out.println("name" + name);
            System.out.println("roll number" + rollNumber);
            System.out.println("grade" + grade);
        }
    }
