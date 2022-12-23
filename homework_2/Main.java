package homework_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Колпаков Дмитрий", 20, 5.0));
        students.add(new Student("Сергеева Марина", 18, 4.7));
        students.add(new Student("Иванов Иван", 17, 3.5));

        StudentGroup group = new StudentGroup(students);
        for (Student student : group) {
            System.out.println(student);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        GroupListIterator it = new GroupListIterator(group);
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.previous());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ReverseIterator revIt = new ReverseIterator(group);
        for (Student student : revIt) {
            System.out.println(student);
        }
        
    }
}
