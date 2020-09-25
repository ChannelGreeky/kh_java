package com.kh.run;

import java.util.Scanner;

public class CalculatorImpl implements Calculator{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String result="";
		
		System.out.print("첫번째 수 입력:");
		String su1 = sc.next();
		System.out.print("두번째 수 입력:");
		String su2 = sc.next();
		
		System.out.print("연산자(+,-,*,/) 입력:");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+': result=add(su1, su2); break;
		case '-': result=subtract(su1, su2); break;
		case '*': result=multiply(su1, su2); break;
		case '/': result=divide(su1, su2); break;
		default:System.out.println("잘못된 입력입니다."); break;
		}
		if(result != "") {
			System.out.println(su1+op+su2+"="+result);
		}
		else {
			System.out.println("잘못된 입력으로 인한 프로그램 종료.");
		}
	}
	
	@Override
	public String add(String su1, String su2) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(su1);
		int b = Integer.parseInt(su2);
		
		String addString = String.valueOf(a+b);
		return addString;
	}

	@Override
	public String subtract(String su1, String su2) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(su1);
		int b = Integer.parseInt(su2);
		
		String subString = String.valueOf(a-b);
		return subString;
	}

	@Override
	public String multiply(String su1, String su2) {
		int a = Integer.parseInt(su1);
		int b = Integer.parseInt(su2);
		
		String mulString = String.valueOf(a*b);
		return mulString;
	}

	@Override
	public String divide(String su1, String su2) {
		double a = Double.parseDouble(su1);
		double b = Double.parseDouble(su2);
		
		String divString = String.valueOf(a/b);
		return divString;
	}
}
