package com.kh.run;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tmp,tmp2;
		
		System.out.print("ù��° �Է� :");
		tmp = sc.next();
		
		System.out.print("�ι�° �Է� :");
		sc.nextLine(); // ���� ����
		tmp2 = sc.nextLine();
		
		System.out.println("�Է°�� ���:"+tmp);
		System.out.println("�Է°�� ���:"+tmp2);
	}
}
