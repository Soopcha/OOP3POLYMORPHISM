package vsu;

import java.time.Instant;

public final class EmployerHelper { //утилити клас, который имеет только статический метод
    private EmployerHelper(){

    }
    public static void doSomething(){
        System.out.println(Instant.now());
    }
}
