package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void recievedSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's Name is : "+name+" have got salary $" + salaryEarned;
    }
}
