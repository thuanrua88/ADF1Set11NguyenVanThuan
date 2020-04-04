package ADF1Set11;

public class EmployeeFullTime extends SalaryPolicy {
    private float rate = (float) 4.0;
    @Override
    public float getSalary(){
        return  rate * getBaseSalary();
    }
}
