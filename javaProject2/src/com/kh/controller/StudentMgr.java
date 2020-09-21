package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Scanner sc = new Scanner(System.in);
	Student s;

	// Ŭ������ �����ϱ� ���� �޼ҵ�
	public void start() {
		while (true) {
			int select;
			System.out.println("======== �л� ���� ���α׷� ver 1.0 ========");
			System.out.println("1. �л����� �Է�");
			System.out.println("2. �л����� ���");
			System.out.println("3. �л����� ����");
			System.out.println("0. ����");
			System.out.print("����:");
			select = sc.nextInt();

			switch (select) {
			case 1:
				studentInsert();
				break;
			case 2:
				studentPrint();
				break;
			case 3:
				studentDelete();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}

	// �л������� �Է��ϱ� ���� �޼ҵ�
	public void studentInsert() {
		if (s == null) {
			s = new Student();
			System.out.println("------------------------------");
			System.out.println("-�̸� �Է�:");
			s.setName(sc.next());
			System.out.println("-�й� �Է�:");
			s.setId(sc.next());
			System.out.println("-���� �Է�:");
			s.setAge(sc.nextInt());
			System.out.println("-�ڵ�����ȣ �Է�:");
			s.setPhone(sc.next());
			System.out.println("-���� �Է�:");
			s.setGender(sc.next());
			
			System.out.println("-------------�����Է� �Ϸ�-------------");
		} else {
			System.out.println("�� �̻� �Է��� �� �����ϴ�.");
		}

	}

	public void studentPrint() {
		if (s == null) {
			System.out.println("����� ������ �����ϴ�.");
		} else {
			System.out.print("1.�̸� :" + s.getName());
			System.out.print("2.�й� :" + s.getId());
			System.out.print("3.���� :" + s.getAge());
			System.out.println("4.�ڵ�����ȣ :" + s.getPhone());
			System.out.println("5���� :" + s.getGender());
		}
	}

	// �л������� �����ϱ� ���� �޼ҵ�
	public void studentDelete() {
		if (s == null) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			s = null;
		}
	}

}
