package vsu;

public class Employer extends Person{
    private Integer salary;//зп
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
}




