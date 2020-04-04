package ADF1Set11;

import java.util.Scanner;

public class TestSalary {
    public static void main(String[] args) {
        SalaryPolicy p1 = new EmployeeFullTime();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input base salary of full time:");
        p1.getBaseSalary() = input1.nextFloat();
        System.out.println("Salary of EmployeeFullTime is: " + p1.getSalary());

        SalaryPolicy p2 = new EmployeePartTime();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input base salary of part time");
        p2.getBaseSalary() = input2.nextFloat();
        System.out.println("Salary of EmployeePartTime is: " + p2.getSalary());
        input1.close();
        input2.close();
    }
}
