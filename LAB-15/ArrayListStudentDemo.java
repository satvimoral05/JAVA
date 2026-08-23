import java.util.ArrayList;

class Student {
    int studentID;
    String studentName;
    int studentRollNo;
    double studentSPI;

    Student(int studentID, String studentName, int studentRollNo, double studentSPI) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentSPI = studentSPI;
    }

    void display() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll No: " + studentRollNo);
        System.out.println("Student SPI: " + studentSPI);
        System.out.println("------------------------------");
    }
}

public class ArrayListStudentDemo {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Jay", 12, 8.52));
        list.add(new Student(102, "Ankit", 5, 7.89));
        list.add(new Student(103, "Riya", 18, 9.12));

        System.out.println("----- Student Details -----");

        for (Student s : list) {
            s.display();
        }
    }
}
