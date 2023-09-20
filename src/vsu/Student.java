package vsu;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
