package com.kh.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pwd = "1234";
		String tmp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�");
		
		tmp =sc.next();
		
		if (pwd.equals(tmp)) {
			System.out.println("��й�ȣ�� �����ϴ�.");
		} else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
		}
	}
}
