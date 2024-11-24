package assignment2;

import java.util.Scanner;

public class ClassAttendence {
    public static void main(String[] args) {
        String[] names = {"Aman", "Ajay", "Vishal", "Suman", "Arun", "Kamal"};
        studentAttendedClass(names);

    }

    public static void studentAttendedClass(String[] names) {
        System.out.println("Enter the name of the student");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Yes, the student " + names[i] + " attended the class ");
            }
        }
        if (!found) {
            System.out.println("the student has not attended the class");
        }
    }

}
