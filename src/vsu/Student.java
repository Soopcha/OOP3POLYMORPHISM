package vsu;

public class Student extends Person{
    private String responsibilities;

    public Student(String name,String responsibilities) {
        super(name);
        this.responsibilities = responsibilities;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override  // переопределили метод из базового класса в дочернем классе
    // (перекрытие метода) @Override не обязательно писать, но для удобства
    public void prettyPrint(){
        super.prettyPrint();
        System.out.println("We are student, my responsibilities is "+ responsibilities);
    }
}
