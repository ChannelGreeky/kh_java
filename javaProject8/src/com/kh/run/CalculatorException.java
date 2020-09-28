package com.kh.run;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorException {
	public void start() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			char operator;

			System.out.println("===계산기 프로그램===");


			try {
				System.out.print("연산자 입력(+, -, *, /) : ");
				operator = sc.next().charAt(0);

				System.out.print("첫번째 수 입력:");
				int su1 = sc.nextInt();
				System.out.print("두번째 수 입력:");
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
				System.out.println("결과 : " + result);

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("에러코드:" + e.getMessage());
				sc.next();
				// TODO: handle exception
				
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println("에러코드:" + e.getMessage());
			}

			System.out.println("이용해주셔서 감사합니다.");
		}
	}
}
