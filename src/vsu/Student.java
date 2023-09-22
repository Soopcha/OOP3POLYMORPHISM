package vsu;

public class Student extends Person implements IResponsibilityChacker{
    private String responsibilities;

    public Student(String name,String responsibilities) {
        super(name);
        this.responsibilities = responsibilities;
    }
    /* так можно методом статик выборочно пускать в контруктор:
    private Student(String name,String responsibilities) {
        super(name);
        this.responsibilities = responsibilities;
    }
    public static Student createStudent(String name,String responsibilities){
        if (responsibilities=="пить пиво"){
            return null;
        }
        return new Student(name,responsibilities); //те создаём только не пьющих студентов
    }

     */
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

    @Override
    public boolean check(String responsibilities) {
        return responsibilities != "пить пиво";
    }
}
