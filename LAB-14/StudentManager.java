import java.io.*;
import java.util.*;

class Student implements Serializable {
    int roll;
    String name;
    float marks;

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return roll + "," + name + "," + marks;
    }
}

public class StudentManager {

    public static void writeStudent(Student s) {
        try {
            FileOutputStream fos =
                new FileOutputStream("students.txt", true);

            String data = s.toString() + "\n";

            fos.write(data.getBytes());
            fos.close();

            System.out.println("Student saved successfully!");

        } catch (Exception e) {
            System.out.println("Error writing student: " + e);
        }
    }

    public static void readStudents() {
        try {
            FileInputStream fis =
                new FileInputStream("students.txt");

            int i;

            System.out.println("Student Records:");

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();

        } catch (Exception e) {
            System.out.println("Error reading students: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Manager Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks: ");
                float marks = sc.nextFloat();

                Student s = new Student(roll, name, marks);

                writeStudent(s);

            } else if (choice == 2) {

                readStudents();

            }

        } while (choice != 3);

        sc.close();

        System.out.println("Program Ended.");
    }
}
