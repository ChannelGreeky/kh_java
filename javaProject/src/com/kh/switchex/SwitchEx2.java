package com.kh.switchex;

import java.util.Scanner;

public class SwitchEx2 {
	public void calc() {
		Scanner sc = new Scanner(System.in);
		char operator;
		int a, b;
		
		System.out.println("===계산기 프로그램===");
		
		System.out.print("연산자 입력(+, -, *, /) : ");
		operator = sc.next().charAt(0);
		
		System.out.print("첫 번째 숫자 입력 : ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		b = sc.nextInt();
		
		System.out.println("======결과======");
		
		switch(operator) {
			case '+': System.out.println(a+" + "+b+" = "+(a+b));
				break;
			case '-': System.out.println(a+" - "+b+" = "+(a-b));
				break;
			case '*': System.out.println(a+" * "+b+" = "+(a*b));
				break;
			case '/': System.out.println(a+" / "+b+" = "+(a/b));
				break;
			default: System.out.println("연산자를 잘못 입력하셨습니다.계산기를 종료합니다.");
		}
	}
}
