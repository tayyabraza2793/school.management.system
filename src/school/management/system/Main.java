package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Sasha = new Teacher(1,"Sasha",500);
        Teacher Dasha = new Teacher(1,"Dasha",500);
        Teacher Masha = new Teacher(1,"Masha",500);

        List<Teacher> teacherList = new ArrayList();
        teacherList.add(Sasha);
        teacherList.add(Dasha);
        teacherList.add(Masha);

        Student John = new Student(1,"John",5);
        Student Max = new Student(1,"Max",6);
        Student Alex = new Student(1,"Alex",7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(John);
        studentList.add(Max);
        studentList.add(Alex);

        School school21 = new School(teacherList, studentList);
        John.payFees(5000);
        Max.payFees(6000);
        System.out.println("School No21 earned $"+school21.getTotalMoneyEarned());

        Sasha.recievedSalary(Sasha.getSalary());
        System.out.println("School No21 sent salaray to "+Sasha.getName()
                +" and now has $"+school21.getTotalMoneyEarned());
        Dasha.recievedSalary(Sasha.getSalary());
        System.out.println("School No21 sent salaray to "+Dasha.getName()
                +" and now has $"+school21.getTotalMoneyEarned());
        System.out.println(John);
        System.out.println(Sasha);

    }
}
