package com.kh.run;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorException {
	public void start() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			char operator;

			System.out.println("===���� ���α׷�===");


			try {
				System.out.print("������ �Է�(+, -, *, /) : ");
				operator = sc.next().charAt(0);

				System.out.print("ù��° �� �Է�:");
				int su1 = sc.nextInt();
				System.out.print("�ι�° �� �Է�:");
				int su2 = sc.nextInt();
				
				int result=0;
				switch (operator) {
				case '+':
					result = su1 + su2;
					break;
				case '-':
					result = su1 - su2;
					break;
				case '*':
					result = su1 * su2;
					break;
				case '/':
					result = su1 / su2;
					break;
				}
				System.out.println("��� : " + result);

			} catch (InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("�����ڵ�:" + e.getMessage());
				sc.next();
				// TODO: handle exception
				
			} catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.out.println("�����ڵ�:" + e.getMessage());
			}

			System.out.println("�̿����ּż� �����մϴ�.");
		}
	}
}
