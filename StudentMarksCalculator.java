package com.opt;

public class StudentMarksCalculator {
	public static void main(String[] args) {
		double math = 78;
		double science = 85;
		double english = 67;
		
		System.out.println("Total marks = "+(math+ science+ english));
		double totalMarks = math+ science + english ;
		double average = totalMarks/3;
		
		System.out.println("Total Marks"+ totalMarks);
		System.out.println("Average "+ average);
		
	}

}
