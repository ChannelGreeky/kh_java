package com.kh.switchex;

import java.util.Scanner;

public class SwitchEx2 {
	public void calc() {
		Scanner sc = new Scanner(System.in);
		char operator;
		int a, b;
		
		System.out.println("===���� ���α׷�===");
		
		System.out.print("������ �Է�(+, -, *, /) : ");
		operator = sc.next().charAt(0);
		
		System.out.print("ù ��° ���� �Է� : ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		b = sc.nextInt();
		
		System.out.println("======���======");
		
		switch(operator) {
			case '+': System.out.println(a+" + "+b+" = "+(a+b));
				break;
			case '-': System.out.println(a+" - "+b+" = "+(a-b));
				break;
			case '*': System.out.println(a+" * "+b+" = "+(a*b));
				break;
			case '/': System.out.println(a+" / "+b+" = "+(a/b));
				break;
			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.���⸦ �����մϴ�.");
		}
	}
}
