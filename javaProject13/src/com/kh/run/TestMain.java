package com.kh.run;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tmp,tmp2;
		
		System.out.print("첫번째 입력 :");
		tmp = sc.next();
		
		System.out.print("두번째 입력 :");
		sc.nextLine(); // 버퍼 비우기
		tmp2 = sc.nextLine();
		
		System.out.println("입력결과 출력:"+tmp);
		System.out.println("입력결과 출력:"+tmp2);
	}
}
