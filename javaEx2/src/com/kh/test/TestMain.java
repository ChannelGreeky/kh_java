package com.kh.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pwd = "1234";
		String tmp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력");
		
		tmp =sc.next();
		
		if (pwd.equals(tmp)) {
			System.out.println("비밀번호가 같습니다.");
		} else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
}
