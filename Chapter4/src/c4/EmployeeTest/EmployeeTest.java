package c4.EmployeeTest;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with these Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987,12,15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989,1,5);
        staff[2] = new Employee("Tony Tester", 40000, 1970,2,15);

        // raise every's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all EMployee objects
        for (Employee e : staff)
            System.out.println(e);

    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return ("name=" + name + ",salary=" + salary + ",hireDay=" + hireDay);
    }
}
