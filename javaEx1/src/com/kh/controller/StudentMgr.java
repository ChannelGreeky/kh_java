package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Scanner sc = new Scanner(System.in);
	Student s;

	public void start() {
		while (true) {
			System.out.println("====�л����� ���� ���α׷�====");
			System.out.println("1. �л����� �Է�");
			System.out.println("2. �л����� ���");
			System.out.println("3. �л����� ����");
			System.out.println("4. �л����� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				studentInsert();
				break;
			case 2:
				studentPrint();
				break;
			case 3:
				studentUpdate();
				break;
			case 4:
				studentDelete();
				break;
			case 0:
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է�");
			}
		}
	}

	public void studentPrint() {
		if (this.s == null) {
			System.out.println("��µ� ������ �����ϴ�.");
		} else {
			System.out.println("[�̸�]:" + this.s.getName());
			System.out.println("[�й�]:" + this.s.getId());
			System.out.println("[����]:" + this.s.getAge());
			System.out.println("[�ڵ�����ȣ]:" + this.s.getPhone());
			System.out.println("[����]:" + this.s.getGender());
		}
	}

	public void studentInsert() {
		if (this.s == null) {
			this.s = new Student();

			System.out.print("[�̸� �Է�]:");
			this.s.setName(sc.next());
			
			System.out.print("[�й� �Է�]:");
			this.s.setId(sc.next());
			
			System.out.print("[���� �Է�]:");
			this.s.setAge(sc.nextInt());
			
			System.out.print("[�ڵ�����ȣ �Է�]:");
			this.s.setPhone(sc.next());
			
			System.out.print("[���� �Է�]:");
			this.s.setGender(sc.next());

			System.out.println("=====�Է¿Ϸ�=====");
			System.out.println();
		} else {
			System.out.println("�̹� �Էµ� ������ �ֽ��ϴ�.");
			System.out.println();
		}
	}

	public void studentUpdate() {
		if (this.s == null) {
			System.out.println("������ ������ �����ϴ�.");
			System.out.println();
		} else {
			System.out.println("===������ ���� ����===");
			System.out.println("1. �̸� ����");
			System.out.println("2. �й� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. �ڵ�����ȣ ����");
			System.out.println("5. ���� ����");
			System.out.println("0. ���");
			System.out.print("���� : ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("���� �̸�:" + this.s.getName());
				System.out.print("[������ �̸� �Է�]:");
				this.s.setName(sc.next());
				System.out.println("=====�����Ϸ�=====");
				System.out.println();
				break;
			case 2:
				System.out.println("���� �й�:" + this.s.getId());
				System.out.print("[������ �й� �Է�]:");
				this.s.setId(sc.next());
				System.out.println("=====�����Ϸ�=====");
				System.out.println();
				break;
			case 3:
				System.out.println("���� ����:" + this.s.getAge());
				System.out.print("[������ ���� �Է�]:");
				this.s.setAge(sc.nextInt());
				System.out.println("=====�����Ϸ�=====");
				System.out.println();
				break;
			case 4:
				System.out.println("���� �ڵ�����ȣ:" + this.s.getPhone());
				System.out.print("[������ �ڵ�����ȣ �Է�]:");
				this.s.setPhone(sc.next());
				System.out.println("=====�����Ϸ�=====");
				System.out.println();
				break;
			case 5:
				System.out.println("���� ����:" + this.s.getGender());
				System.out.print("[������ ���� �Է�]:");
				this.s.setGender(sc.next());
				System.out.println("=====�����Ϸ�=====");
				System.out.println();
				break;
			case 0:
				System.out.println("��ҵǾ����ϴ�.");
				System.out.println();
				return;
			default:
				System.out.println("�߸��� �Է�");
			}
		}
	}

	public void studentDelete() {
		if (this.s == null) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			System.out.println("������ �����Ͻðڽ��ϱ�? �����Ͻø� ������ �� �����ϴ�.");
			System.out.println("�����Ͻ÷��� y�Ǵ� Y�� ���ư��÷��� n �Ǵ� N�� �����ּ���.");
			char answer = sc.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("���������Ϸ�");
				System.out.println();
				this.s = null;
			} else {
				System.out.println("��ҵǾ����ϴ�.");
				System.out.println();

				return;
			}
		}
	}
}
