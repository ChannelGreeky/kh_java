package com.kh.switchex;

import java.util.Scanner;

public class SwitchPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		String input;
		System.out.print("�����Է�:");
		input = sc.next();
		
		switch(input) {
			case "���": System.out.println("1000��");
				break;
			case "�ٳ���": System.out.println("3000��");
				break;
			case "������": System.out.println("2000��");
				break;
			case "Ű��": System.out.println("5000��");
				break;
			default: System.out.println("������ �����ϴ�.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		System.out.println("*******�ʱ�޴�*******");
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("0.����");
		System.out.println("********************");
		System.out.print("�޴���ȣ �Է�:");
		input = sc.nextInt();

		switch(input) {
			case 1: System.out.println("�Է¸޴�����");
				break;
			case 2: System.out.println("�����޴�����");
				break;
			case 3: System.out.println("��ȸ�޴�����");
				break;
			case 4: System.out.println("�����޴�����");
				break;
			case 0: System.out.println("���α׷��� �����մϴ�.");
				break;
			default: System.out.println("�߸� �����̽��ϴ�. ���α׷��� �����մϴ�.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		System.out.println("*********�޴�*********");
		System.out.println("1.������-----------1000");
		System.out.println("2.���------------2000");
		System.out.println("3.����------------1000");
		System.out.println("4.����------------2000");
		System.out.println("5.Ƣ��------------3000");
		System.out.println("5.��Ƣ��-----------8000");
		System.out.println("********************");
		System.out.print("�޴���ȣ �Է�:");
		input = sc.nextInt();

		switch(input) {
			case 1: System.out.println("�����̴� 1000���Դϴ�.");
				break;
			case 2: System.out.println("���� 2000���Դϴ�.");
				break;
			case 3: System.out.println("������ 1000���Դϴ�.");
				break;
			case 4: System.out.println("����� 2000���Դϴ�.");
				break;
			case 5: System.out.println("Ƣ��� 3000���Դϴ�.");
				break;
			case 6: System.out.println("��Ƣ���� 8000���Դϴ�.");
				break;
			default: System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ������ �����մϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		String main, sub;
		char main_menu;
		int sub_menu;
		int sum = 0;
		
		System.out.println("********�ָ޴�********");
		System.out.println("a.�Ұ�����--------5000");
		System.out.println("b.�������----------4000");
		System.out.println("c.ġŲ����----------4500");
		System.out.println("d.�ѿ����---------10000");
		System.out.println("e.�����-----------7000");
		System.out.println("********************");
		System.out.println("******���̵�޴�******");
		System.out.println("1.�ݶ�------------1500");
		System.out.println("2.���̴�-----------1500");
		System.out.println("3.��ũ����ũ--------2500");
		System.out.println("4.�����-----------3000");
		System.out.println("********************");
		
		System.out.print("�ָ޴���ȣ �Է�(a,b,c,d,e):");
		main_menu = sc.next().charAt(0);
		switch(main_menu) {
			case 'a': 
				sum += 5000;
				main = "�Ұ�����";
				break;
			case 'b': 
				sum += 4000;
				main = "�������";
				break;
			case 'c': 
				sum += 4500;
				main = "ġŲ����";
				break;
			case 'd': 
				sum += 10000;
				main = "�ѿ����";
				break;
			case 'e': 
				sum += 7000;
				main = "�����";
				break;
			default: 
				System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ������ �����մϴ�.");
				main = "X";
				
		}
		
		if (main != "X") {
			System.out.print("���̵�޴���ȣ �Է�(1,2,3,4):");
			sub_menu = sc.nextInt();
			switch(sub_menu) {
				case 1: 
					sum += 1500;
					sub = "�ݶ�";
					break;
				case 2: 
					sum += 1500;
					sub = "���̴�";
					break;
				case 3: 
					sum += 2500;
					sub = "��ũ����ũ";
					break;
				case 4: 
					sum += 3000;
					sub = "�����";
					break;
				default: 
					System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ������ �����մϴ�.");
					sub = "X";
			}
		}
		else sub="X";
		
		if(main != "X" && sub != "X") {
			System.out.println(main+","+sub+"�� �� "+sum+"���Դϴ�.");
		}
	}
	
	public void practice5() {
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
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("�����Է� (A,B,C,D,F):");
		grade = sc.next().charAt(0);
		
		switch(grade) {
			case 'A': System.out.println("�����ϼ̽��ϴ�. ���б��� 100%�����ص帮�ڽ��ϴ�.");
				break;
			case 'B': System.out.println("�ణ �ƽ��׿� ���б� 50% �����Դϴ�.");
				break;
			case 'C': System.out.println("�̹��б� ���б��� ���׿�.. ��������.");
				break;
			case 'D': System.out.println("���бݺ��ٴ� �а�� ���ϼ̳׿�");
				break;
			case 'F': System.out.println("�̹��б� ���б����� �а� �����̽��ϴ�. 3GO�Ͻ� ����");
				break;
			default: System.out.println("�߸��� ����!!");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		char operator;
		int a, b;
		
		System.out.println("===���� ���α׷�===");
		
		System.out.print("������ �Է�(+, -, *, /) : ");
		operator = sc.next().charAt(0);
		
		System.out.print("ù ��° ���� �Է� : ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		b = sc.nextInt();
		
		System.out.println("======���======");
		
		System.out.printf("%d %c %d = ", a, operator, b);
		switch(operator) {
			case '+': System.out.println(a+b);
				break;
			case '-': System.out.println(a-b);
				break;
			case '*': System.out.println(a*b);
				break;
			case '/': System.out.println(a/(double)b);
				break;
			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.���⸦ �����մϴ�.");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
			
		int input;
		System.out.print("�����Է�(0~100):");
		input = sc.nextInt();
		if (0 <= input && input >= 100) {
			switch(input/10) {
			case 10: System.out.println(input+"�� ==> A���");
				break;
			case 9: System.out.println(input+"�� ==> A���");
				break;
			case 8: System.out.println(input+"�� ==> B���");
				break;
			case 7: System.out.println(input+"�� ==> C���");
				break;
			case 6: System.out.println(input+"�� ==> D���");
				break;
			default: System.out.println(input+"�� ==> F���");
			}
		}
		else System.out.println("�߸��� �Է�(0~100���� �Է�)");

	}
}
