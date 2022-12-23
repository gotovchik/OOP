package homework_2;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int index = -1;
    private StudentGroup studentGroup;

    public GroupListIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.getSize() - 1;
    }

    @Override
    public Student next() {
        return studentGroup.get(++index);
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Student previous() {
        if (this.hasPrevious()) {
            return studentGroup.get(--index);
        } else
            return null;
    }

    @Override
    public int nextIndex() {
        return ++index;
    }

    @Override
    public int previousIndex() {
        return --index;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub

    }

}
