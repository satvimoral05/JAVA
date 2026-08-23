import java.util.ArrayList;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working...");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    ArrayList<Employee> employees = new ArrayList<>();

    HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(
            "HR Manager is managing employees..."
        );
    }

    void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Added employee: " + e.name);
    }

    void showEmployees() {

        System.out.println("Employees managed by HR:");

        for (Employee e : employees) {
            System.out.println("- " + e.name);
        }
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        HRManager hr = new HRManager("Ravi", 50000);

        Employee e1 = new Employee("Jay", 30000);
        Employee e2 = new Employee("Raj", 32000);

        hr.addEmployee(e1);
        hr.addEmployee(e2);

        hr.showEmployees();
    }
}
