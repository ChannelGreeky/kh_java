package com.kh.switchex;

import java.util.Scanner;

public class SwitchEX {
	public void start() {
		Scanner sc = new Scanner(System.in);
			
		int input;
		System.out.print("점수입력:");
		input = sc.nextInt();
		
		switch(input/10) {
			case 10: System.out.println("A등급");
				break;
			case 9: System.out.println("A등급");
				break;
			case 8: System.out.println("B등급");
				break;
			case 7: System.out.println("C등급");
				break;
			case 6: System.out.println("D등급");
				break;
			default: System.out.println("F등급");
		}
	}
	
	public void month() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("일수를 알고싶은 달을 입력하시오:");
		input = sc.nextInt();
		
		switch(input) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8: 
			case 10:
			case 12: System.out.println(input+"월달은 31일까지 있습니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println(input+"월달은 30일까지 있습니다.");
				break;
			case 2: System.out.println("2월달은 28일까지 있습니다.");
				break;
			default: System.out.println("잘못 입력하셨습니다.");
		}
	}
}
