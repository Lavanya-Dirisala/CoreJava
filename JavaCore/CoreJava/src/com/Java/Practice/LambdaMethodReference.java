package com.Java.Practice;

interface Calculator{
	void add(int a, int b);
}
class Calu{
	//Static method
	public static void addNumbers(int a,int b) {
		System.out.print("A + B " + a+b);
	}
	//Non static method
	public void multiplyNumbers(int a,int b) {
		System.out.print("A * B " + a*b);
	}
}
public class LambdaMethodReference {

	public static void main(String[] args) {
		//1.static method referencing
		//Calculator c= Calu::addNumbers;
		//c.add(10, 20);
		
		//2.Non static method referencing
		Calu cal=new Calu();
		Calculator ch= cal::multiplyNumbers;
		ch.add(10,20);
	}

}
