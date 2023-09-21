package vsu;

import java.util.List;

public class Application {
    public static void main(String[] args) {


        Person person = new Person("Jon");
        Student student = new Student("Ronald", "Work in mac");
        person.prettyPrint();
        student.prettyPrint();
        System.out.println();

        Person somePerson = new Student("Genrich","to learn");
        somePerson.prettyPrint();//будет выполнен метод того класса, чей экземпляр тут лежит
        // те выполнится метод prettyPrint() Student
        // это и есть полиморфизм
        System.out.println();

        Employer employer = new Employer("Ivan",123);
        List<Person> people = List.of(student,employer);/*List.of - это статический метод в Java, введенный в Java 9,
        который используется для создания неизменяемого списка (List). Этот метод позволяет вам создавать компактные
        и неизменяемые списки, которые нельзя изменить после их создания. Он предоставляет удобный способ инициализации
        списков с фиксированным набором элементов. */
        for (Person p:people
             ) {
            p.prettyPrint();
        }
    }
}
