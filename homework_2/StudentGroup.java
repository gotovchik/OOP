package homework_2;

import java.util.List;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int getSize() {
        return this.students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

}
