package ADF1Set11;

public class EmployeePartTime extends SalaryPolicy {
    private float rate = (float) 2.5;
    @Override
    public float getSalary(){
        return  rate * getBaseSalary();
    }
}
