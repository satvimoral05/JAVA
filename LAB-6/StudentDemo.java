class Student {

    String name;
    int roll_no;
    double SPI;
    String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public double getSPI() {
        return SPI;
    }

    public void setSPI(double SPI) {
        this.SPI = SPI;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("Jay");
        s1.setRollNo(101);
        s1.setSPI(8.5);
        s1.setCourse("MCA");

        s2.setName("Riya");
        s2.setRollNo(102);
        s2.setSPI(9.0);
        s2.setCourse("MCA");

        s3.setName("Amit");
        s3.setRollNo(103);
        s3.setSPI(7.8);
        s3.setCourse("MCA");

        System.out.println(
            "Student 1: " + s1.getName()
            + ", Roll: " + s1.getRollNo()
            + ", SPI: " + s1.getSPI()
            + ", Course: " + s1.getCourse()
        );

        System.out.println(
            "Student 2: " + s2.getName()
            + ", Roll: " + s2.getRollNo()
            + ", SPI: " + s2.getSPI()
            + ", Course: " + s2.getCourse()
        );

        System.out.println(
            "Student 3: " + s3.getName()
            + ", Roll: " + s3.getRollNo()
            + ", SPI: " + s3.getSPI()
            + ", Course: " + s3.getCourse()
        );
    }
}
