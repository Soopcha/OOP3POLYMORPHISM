package vsu;

public class Terminator implements IResponsibilityChacker, IEnergyTester {
    private String responsibilities;

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public Terminator(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    @Override
    public boolean check(String responsibilities) {
        return responsibilities ==" to save Sarah Connor";
    }

    @Override
    public boolean validate(Integer value) {
        return value >1000; // больше 1000 => все норм иначе к розетке
    }
}
