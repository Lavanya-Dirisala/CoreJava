package com.Java.Practice;

interface LambdaExpressionsInterface {
	// void travel(String source, String dest);
	double travel(String source, String dest);
}

public class lambdaExpressions {
	public static void main(String[] args) {
		// parementerized lambda
		LambdaExpressionsInterface exp = (source, end) -> {
			System.out.println("my Source " + source + " my destination " + end);
			return 30.8;
		};
		// return type with lambda
		double d = exp.travel("Bhimavaram", "Hyderabad");
		System.out.println("Fare is " + d);

	}
}