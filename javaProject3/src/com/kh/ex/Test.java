package com.kh.ex;

public class Test {
	public void print(int data) {
		System.out.println("입력한 정수 출력 :"+data);
	}
	//Method Overloading
	public void print(double data) {
		System.out.println("입력한 실수 출력 :"+data);
	}
	//Method Overloading
	public void print(String data) {
		System.out.println("입력한 문자열 출력 :"+data);
	}
	//Method Overloading
	public void print(char data) {
		System.out.println("입력한 문자 출력 :"+data);
	}
}
