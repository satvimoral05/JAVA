// Write a Java program to create a class called Employee
// with a name, job title, and salary attributes,
// and methods to calculate and update salary.

class Employee {

    String name;
    String jobTitle;
    double salary;

    // Setter to assign employee details
    void setEmployee(String name, String jobTitle, double salary) {

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to display employee details
    void getEmployee() {

        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    // Method to increase salary
    void updateSalary(double amount) {

        salary += amount;

        System.out.println(
            "Salary updated by " + amount
        );
    }

    // Method to calculate new salary with bonus
    double calculateSalary(double bonus) {

        return salary + bonus;
    }
}

public class SalaryDemo {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmployee(
            "vi",
            "Software Developer",
            45000
        );

        e.getEmployee();

        e.updateSalary(5000);

        System.out.println(
            "After Update Salary: " + e.salary
        );

        // Calculate salary with bonus
        double newSalary = e.calculateSalary(3000);

        System.out.println(
            "Salary after adding bonus: " + newSalary
        );
    }
}
