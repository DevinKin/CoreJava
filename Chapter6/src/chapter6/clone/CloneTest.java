package chapter6.clone;

public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("john Q. Public", 5000);
            original.setHireDate(2000,1,1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDate(2002,12,31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
