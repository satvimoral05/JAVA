import java.io.*;
import java.util.*;

class Student {
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
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("demo.txt", true)
            ); // append mode

            bw.write(s.toString());
            bw.newLine();
            bw.close();

            System.out.println("Student saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing student: " + e.getMessage());
        }
    }

    public static void readStudents() {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("demo.txt")
            );

            String line;

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading students: " + e.getMessage());
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

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    float marks = sc.nextFloat();

                    Student s = new Student(roll, name, marks);
                    writeStudent(s);
                    break;

                case 2:
                    readStudents();
                    break;

                case 3:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
