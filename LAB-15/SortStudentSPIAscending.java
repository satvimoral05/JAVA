import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        System.out.println(
            studentID + "\t" +
            studentName + "\t" +
            studentRollNo + "\t" +
            studentSPI
        );
    }
}

public class SortStudentSPIAscending {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Jay", 12, 8.52));
        list.add(new Student(102, "Ankit", 5, 7.89));
        list.add(new Student(103, "Riya", 18, 9.12));
        list.add(new Student(104, "Milan", 9, 6.75));

        System.out.println("Before Sorting:");

        for (Student s : list) {
            s.display();
        }

        Collections.sort(list, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {

                if (s1.studentSPI > s2.studentSPI)
                    return 1;
                else if (s1.studentSPI < s2.studentSPI)
                    return -1;
                else
                    return 0;
            }
        });

        System.out.println("\nAfter Sorting as per SPI (Low to High):");

        for (Student s : list) {
            s.display();
        }
    }
}
