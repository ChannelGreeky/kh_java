package com.kh.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataSort {

	public void start() {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int select;
		while (true) {
			System.out.println(" = = = = = 몹쓸 김부장이 원한 프로그램 ver 1.0 = = = = =");
			System.out.println("1. 숫자 데이터 입력");
			System.out.println("2. 숫자 데이터 출력");
			System.out.println("3. 숫자 데이터 정렬");
			System.out.print("선택:");
			select = sc.nextInt();

			switch (select) {
			case 1:
				while (true) {
					try {
						System.out.print("정수 입력(아무 문자(숫자제외) 입력시 종료) : ");
						al.add(sc.nextInt());
					} catch (InputMismatchException e) {
						// TODO: handle exception
						sc.next();
						break;
					}
				}
				break;
			case 2:
				for (Object i : al) {
					System.out.print((int) i + " ");
				}
				break;
			case 3:
				Collections.sort(al);
				System.out.println(" = = = = = 정렬 완료 = = = = = ");
				break;
			default:
				System.out.println("1~3숫자만 입력하세요.");
				break;
			}
		}
	}
}
