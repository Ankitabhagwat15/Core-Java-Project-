package com.opt;

public class Operators {
	public static void main(String[] args) {
		
		int a = 20;
		int b = 5;
		
		
		// 1. Arithmetic operator 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println( a/b);
		System.out.println(a%b); // modulus : remainder 
	
	System.out.println("**********************************************************");
	// 2. relational operators
	
	int  x = 5; 
	int y = 10;
	System.out.println(x == y);
	System.out.println(x != y);
	System.out.println(x > y);
	System.out.println(x < y);
	System.out.println(x >= y);
	System.out.println(x <= y);
	System.out.println("*************************************************");
	// 3. logical operator(opt)
	
	int p = 12;
	int q = 15;
	int r = 20;
	System.out.println((r > p) && (r < q));
	
	// And opt return false if any of the statement is false 
	
	System.out.println((r > p) || (r < q));
	
// or opt return true if any of the statement is true	
	
	System.out.println(!(r < q));
	
	System.out.println("*****************************************");
	
	// Assignment operators
	
	int m = 40;
	int n = m;
	
	System.out.println(n);
	
	n += 5;
	System.out.println(n);
	
	n -= 3;
	System.out.println(n);
	
	System.out.println("**************************************");
	
	// unary operators 
	
	int age = -19;
	System.out.println(-(age));
	
	int z = 5;
	System.out.println(++z); // pre- increment 
	
	int c = 10;
	
	System.out.println(c++); // post - increment 
	System.out.println(c);
	
	
	System.out.println(c--); // post decrement 
	System.out.println(c); // actual value 
	
	System.out.println(--c); // pre decrement 
	
	boolean flag = false ;
	System.out.println(! flag);
	
	System.out.println("**********************************");
	// ternary operators 

	int marks = 40;
	String result = (marks > 90) ? "grade A" : 
		(marks > 80) ? "grade B" :
			(marks > 70) ? "grade C" : 
				(marks > 60) ? "grade D" : 
					(marks > 50) ? "grade E" : "Fail"; 
	
	System.out.println(result);
	
	}

}
