package Practical;

public class SalaryTest {
	public static void main(String[] args) {
		
		double salary = 50000;
		double hra = SalaryManagement.calculateHRA(salary);
		double da = SalaryManagement.calculateDA(salary);
		double grossSalary = salary + hra + da;
		double tax = SalaryManagement.calculateTax(grossSalary);
		double netSalary = SalaryManagement.calculateNetSalary(salary);
		
		System.out.println("Basic salary -" + salary);
		System.out.println("HRA -" + hra);
        System.out.println("DA -" + da);
        System.out.println("Tax -" + tax);
        System.out.println("Net Salary -" + netSalary);
		
		
	}

}
