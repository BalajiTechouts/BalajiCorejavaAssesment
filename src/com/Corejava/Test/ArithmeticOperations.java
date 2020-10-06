package com.Corejava.Test;

public class ArithmeticOperations {


	public void add(int a, int b) {
		int add=a+b;
		System.out.println("add method");
		System.out.println("the add is"+add);
		avg(add);


	}
	public void avg(int add) {
		int avg=add/2;
		System.out.println("avg method");
		System.out.println("the average is"+avg);
		display(avg,add);

	}
	public void display(int avg,int add) {
		System.out.println("display method values");
		System.out.println("the sum is "+add);
		System.out.println("the avg is"+avg);
	}

}