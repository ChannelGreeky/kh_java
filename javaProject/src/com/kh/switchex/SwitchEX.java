package com.kh.switchex;

import java.util.Scanner;

public class SwitchEX {
	public void start() {
		Scanner sc = new Scanner(System.in);
			
		int input;
		System.out.print("�����Է�:");
		input = sc.nextInt();
		
		switch(input/10) {
			case 10: System.out.println("A���");
				break;
			case 9: System.out.println("A���");
				break;
			case 8: System.out.println("B���");
				break;
			case 7: System.out.println("C���");
				break;
			case 6: System.out.println("D���");
				break;
			default: System.out.println("F���");
		}
	}
	
	public void month() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("�ϼ��� �˰���� ���� �Է��Ͻÿ�:");
		input = sc.nextInt();
		
		switch(input) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8: 
			case 10:
			case 12: System.out.println(input+"������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println(input+"������ 30�ϱ��� �ֽ��ϴ�.");
				break;
			case 2: System.out.println("2������ 28�ϱ��� �ֽ��ϴ�.");
				break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
