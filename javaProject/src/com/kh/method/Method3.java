package com.kh.method;

import java.util.Scanner;

public class Method3 {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�:");
		char ch = sc.next().charAt(0);
		
		System.out.println("======��ȯ======");
		System.out.print(ch+" --> ");
		ch = charChange(ch);
		System.out.println(ch);
	}
	
	public char charChange(char ch) {
		
		if(65 <= ch && ch <= 90) {
			return (char) (ch+32);
		}
		else if(97 <= ch && ch <= 122) {
			return (char) (ch-32);
		}
		else {
			System.out.println("�߸��� ���� �Է�");
			ch = '^';
			return ch;
		}		
	}
}
