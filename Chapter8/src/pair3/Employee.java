package pair3;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;
    private double salary;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}
