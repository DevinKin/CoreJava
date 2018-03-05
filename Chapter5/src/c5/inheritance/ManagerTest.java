package c5.inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        // construct a Manager object
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        // fill the staff array with Mangaer andd Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,10,13);
        staff[2] = new Employee("Tommy Tester",40000,1990,3,15);

        for(Employee e : staff)
            System.out.println(e);

    }
}
