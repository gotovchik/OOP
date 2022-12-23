package homework_2;

public class Student {
    private String name;
    private int age;
    private double gpt;

    public Student(String name, int age, double gpt) {
        this.name = name;
        this.age = age;
        this.gpt = gpt;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gpt=" + gpt + "]";
    }

}
