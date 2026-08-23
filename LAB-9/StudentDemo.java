import java.util.Scanner;

class Student {

    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    Student(int id_no, int no_of_subjects_registered,
            String[] subject_code, int[] subject_credits,
            char[] grade_obtained) {

        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
    }

    void calculateSPI() {

        int totalCredits = 0;
        int weightedSum = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {

            int gradePoint = mapGradeToPoint(grade_obtained[i]);

            weightedSum += gradePoint * subject_credits[i];
            totalCredits += subject_credits[i];
        }

        spi = (double) weightedSum / totalCredits;
    }

    int mapGradeToPoint(char grade) {

        int gradePoint = 0;

        switch (Character.toUpperCase(grade)) {

            case 'A':
                gradePoint = 10;
                break;

            case 'B':
                gradePoint = 8;
                break;

            case 'C':
                gradePoint = 6;
                break;

            case 'D':
                gradePoint = 4;
                break;

            case 'E':
                gradePoint = 2;
                break;

            case 'F':
                gradePoint = 0;
                break;

            default:
                gradePoint = 0;
        }

        return gradePoint;
    }

    void display() {

        System.out.println("Student ID: " + id_no);
        System.out.println(
            "Subjects Registered: " + no_of_subjects_registered
        );
        System.out.println("SPI: " + spi);
        System.out.println("---------------------------");
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println(
                "\nEnter details for Student " + (i + 1)
            );

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter number of subjects registered: ");
            int subjects = sc.nextInt();

            sc.nextLine();

            String[] codes = new String[subjects];
            int[] credits = new int[subjects];
            char[] grades = new char[subjects];

            for (int j = 0; j < subjects; j++) {

                System.out.print(
                    "Enter subject code for subject " + (j + 1) + ": "
                );
                codes[j] = sc.nextLine();

                System.out.print(
                    "Enter credits for subject " + (j + 1) + ": "
                );
                credits[j] = sc.nextInt();

                System.out.print(
                    "Enter grade obtained (A-F) for subject "
                    + (j + 1) + ": "
                );
                grades[j] = sc.next().charAt(0);

                sc.nextLine();
            }

            students[i] = new Student(
                id, subjects, codes, credits, grades
            );

            students[i].calculateSPI();
        }

        System.out.println("\n--- Student Results ---");

        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
