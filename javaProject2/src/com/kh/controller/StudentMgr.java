package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Scanner sc = new Scanner(System.in);
	int count=0;
	int length=3;
	Student[] std = new Student[length];

	// Ŭ������ �����ϱ� ���� �޼ҵ�
	public void start() {
		while (true) {
			int select;
			System.out.println("======== �л� ���� ���α׷� ver 2.0 ========");
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
		for(int i=0; i<std.length; i++) {
			if (this.std[i] == null) {
				this.std[i] = new Student();
				System.out.println("------["+i+"]�� �л����� �Է� ------");
				System.out.print("-�̸� �Է�:");
				this.std[i].setName(this.sc.next());
				
				System.out.print("-�й� �Է�:");
				this.std[i].setId(this.sc.next());
				
				System.out.print("-���� �Է�:");
				this.std[i].setAge(this.sc.nextInt());
				
				System.out.print("-�ڵ�����ȣ �Է�:");
				this.std[i].setPhone(this.sc.next());
				
				System.out.print("-���� �Է�:");
				this.std[i].setGender(this.sc.next());
				
				System.out.println("-------------�����Է� �Ϸ�-------------");
				
				count++;
				
				break;
			} else {
				System.out.println("�� �̻� �Է��� �� �����ϴ�.");
			}
		}
	}

	public void studentPrint() {
		if (count==0) {
			System.out.println("����� ������ �����ϴ�.");
		} else {
			System.out.println("����� �л���ȣ ����(1,2,3 ���� ����Ϸ��� 0�� �Է��ϼ���.):");
			int select=sc.nextInt();
			switch(select) {
			case 1:
				if(std[0] ==null)
				{
					System.out.println("[1]�� �л� ���� ����");
				}
				else {
					System.out.println("=========[1]�� �л�=========");
					System.out.println("1.�̸� :" + this.std[0].getName());
					System.out.println("2.�й� :" + this.std[0].getId());
					System.out.println("3.���� :" + this.std[0].getAge());
					System.out.println("4.�ڵ�����ȣ :" + this.std[0].getPhone());
					System.out.println("5���� :" + this.std[0].getGender());
				}
			case 2:
				if(std[1] ==null)
				{
					System.out.println("[2]�� �л� ���� ����");
				}
				else {
					System.out.println("=========[2]�� �л�=========");
					System.out.println("1.�̸� :" + this.std[1].getName());
					System.out.println("2.�й� :" + this.std[1].getId());
					System.out.println("3.���� :" + this.std[1].getAge());
					System.out.println("4.�ڵ�����ȣ :" + this.std[1].getPhone());
					System.out.println("5���� :" + this.std[1].getGender());
				}
			case 3:
				if(std[2] ==null)
				{
					System.out.println("[3]�� �л� ���� ����");
				}
				else {
					System.out.println("=========[3]�� �л�=========");
					System.out.println("1.�̸� :" + this.std[2].getName());
					System.out.println("2.�й� :" + this.std[2].getId());
					System.out.println("3.���� :" + this.std[2].getAge());
					System.out.println("4.�ڵ�����ȣ :" + this.std[2].getPhone());
					System.out.println("5���� :" + this.std[2].getGender());
				}
			case 0:
				for(int i=0;i<std.length;i++) {
					if(std[i] ==null)
					{
						System.out.println("=========["+i+"]�� �л� ���� ����=========");
					}
					else {
						System.out.println("=========["+i+"]�� �л�=========");
						System.out.println("1.�̸� :" + this.std[i].getName());
						System.out.println("2.�й� :" + this.std[i].getId());
						System.out.println("3.���� :" + this.std[i].getAge());
						System.out.println("4.�ڵ�����ȣ :" + this.std[i].getPhone());
						System.out.println("5���� :" + this.std[i].getGender());
					}
				}
			}
		}
	}

	// �л������� �����ϱ� ���� �޼ҵ�
	public void studentDelete() {
		if (count==0) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			System.out.println("������ �л���ȣ ����(1,2,3 ���� �����Ϸ��� 0�� �Է��ϼ���.):");
			int select=sc.nextInt();
			switch(select) {
			case 1:
				if(std[0] ==null)
				{
					System.out.println("[1]�� �л� ���� ����");
					return;
				} else {
					System.out.println("[1]�� �л� ���� �����Ϸ�");
					std[0]=null;
					count--;
				}
			case 2:
				if(std[1] ==null)
				{
					System.out.println("[2]�� �л� ���� ����");
					return;
				} else {
					System.out.println("[2]�� �л� ���� �����Ϸ�");
					std[1]=null;
					count--;
				}
			case 3:
				if(std[2] ==null)
				{
					System.out.println("[3]�� �л� ���� ����");
					return;
				} else {
					System.out.println("[3]�� �л� ���� �����Ϸ�");
					std[2]=null;
					count--;
				}
			case 0:
				for(int i=0;i<std.length;i++) {
					if(std[i]!=null)
					{
						System.out.println("["+i+"]�� �л� ���� �����Ϸ�");
					}
				}
			}
		}
	}
}
