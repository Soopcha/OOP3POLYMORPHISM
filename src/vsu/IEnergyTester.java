package vsu;

public interface IEnergyTester {
    public static final String MY_MESSEGE = "go go";//можно добавить константу
    // public static final писать не обязательно тк в интерфейсе все поля такие

    boolean validate(Integer value);

    public static void doSomething(){

    }
    //public можно не писать тк и так все паблик

    default void doSuperJob(){// дефолтные методы будут просто наследоваться ниже по иерархии
        System.out.println("i do super job");
        //можем вызвать этот мметод из экземплярной переменной
    }
}
