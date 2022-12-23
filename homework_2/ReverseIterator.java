package homework_2;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student>, Iterable<Student> {
    private StudentGroup studentGroup;
    private int index;

    public ReverseIterator(StudentGroup studentGroup) { // конструктор с конца итерируемого объекта
        this.studentGroup = studentGroup;
        this.index = studentGroup.getSize() - 1;
    }

    public ReverseIterator(StudentGroup studentGroup, int index) { // конструктор с заданным индексом
        this.studentGroup = studentGroup;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return studentGroup.get(index--);
    }

    @Override
    public Iterator<Student> iterator() {
        return this;
    }

    
}
