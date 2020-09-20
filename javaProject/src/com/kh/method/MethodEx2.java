package com.kh.method;

public class MethodEx2 {
	public void start() {
		
		int a=10, b=3;
		
		System.out.println(sum(a, b));
		System.out.println(sub(a, b));
		System.out.println(mul(a, b));
		System.out.println(div(a, b));
	}
	
	public int sum(int a, int b) {
		int sum;
		sum = a + b;
		
		return sum;
	}
	
	public int sub(int a, int b) {
		int sub;
		sub = a - b;
		
		return sub;
	}
	
	public int mul(int a, int b) {
		int mul;
		mul = a * b;
		
		return mul;
	}
	
	public double div(int a, int b) {
		double div;
		div = a / (double)b;
		
		return div;
	}
}
