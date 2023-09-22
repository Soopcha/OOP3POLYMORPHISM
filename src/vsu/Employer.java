package vsu;

public class Employer extends Person implements IEnergyTester{
    private Integer salary;//зп
    private static final Integer sinSalary = 50;//со статиком только константа, тк хрен поймешь кто её поменял
    public Employer(String name,Integer salary){
        super(name);
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    @Override
    public void prettyPrint(){
        super.prettyPrint();
        System.out.println("My salary is "+ salary);
    }

    public static void doSomething(){// вообще статик методы лучше писать в отдельном классе
    //тут не можем юзать экземплярные мтоды
    // а в экземплярных методах можно юзать static методы
    }

    @Override
    public boolean validate(Integer value) {
        return value > 100;
    }
}




