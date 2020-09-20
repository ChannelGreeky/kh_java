package com.kh.method;

import java.util.Scanner;

public class Method3 {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력:");
		char ch = sc.next().charAt(0);
		
		System.out.println("======변환======");
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
			System.out.println("잘못된 문자 입력");
			ch = '^';
			return ch;
		}		
	}
}
