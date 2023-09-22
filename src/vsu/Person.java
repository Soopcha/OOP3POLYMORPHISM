package vsu;

import java.time.Instant;

public class Person {
    //public abstract class Person {   - это был бы абстрактным классом, и
    // конечно бы лучше его таким и сделать
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void prettyPrint(){
        System.out.println("Person name is "+ name);
    }
    //public abstract void prettyPrint();  - это был бы абстрактным методом
    public static void printCurrentDate(){
        System.out.println(Instant.now());
    }

    static {// статик конструктор(тоже типо анонимный )
        //тут можно инициализировать статик классы поля
    }

    {
        //анонимный конструктор
    }
}

