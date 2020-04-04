package ADF1Set11;

abstract public class SalaryPolicy {
    private float baseSalary;

    public float getBaseSalary() {
        return baseSalary;
    }

    abstract public float getSalary();
}
