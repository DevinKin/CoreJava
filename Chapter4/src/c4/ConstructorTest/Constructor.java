package c4.ConstructorTest;

import java.util.Random;

public class Constructor {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff)
            System.out.println(e);
    }
}

class Employee
{
    private static int nextId;

    private int id;
    private String name="";
    private double salary;

    //static initialization block
    static {
        Random generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object overloaded constructors
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary;
    }
}