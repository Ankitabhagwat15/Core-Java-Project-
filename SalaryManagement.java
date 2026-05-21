package Practical;

public class SalaryManagement {
	static double  calculateHRA(double salary) {
		return salary * 10/100;
		
	}
	
	
	static double calculateDA(double salary) {
		return salary * 20/100;
		
		
	}
	
	static double calculateTax(double grossSalary) {
		
		return grossSalary *5/100;
	
	}
	
	static double calculateNetSalary(double salary) {
		
		double hra = calculateHRA(salary);
		double da = calculateDA(salary);
		double grossSalary = salary + hra + da ;
		double tax = calculateTax(grossSalary);
		return grossSalary - tax;
		
		
	}
	

}
