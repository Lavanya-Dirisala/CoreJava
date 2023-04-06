package com.Java.Practice;

interface Cal {
	int sum(int a, int b);
}

public class LambdaVarKeywork {

	public static void main(String[] args) {
		//The var is a keyword in Java that is used to declare a local variable
		// it detects automatically the datatype of a variable based on the surrounding context.
		Cal cal = (var a,var b) -> a + b;
		int result = cal.sum(109, 20);
		System.out.println(result);
		
		//var with all the parameters. No skipping allowed.
		/*
		 * Cal cal = (var a,b) -> a +b; int result = cal.sum(109, 20);
		 * System.out.println(result);
		 */
		//var cannot be mixed with Non-Var
		/*
		 * Cal cal = (var a, int b) -> a + b; int result = cal.sum(109, 20);
		 * System.out.println(result);
		 */
	}
}