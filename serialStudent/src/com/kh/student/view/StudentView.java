package com.kh.student.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	Scanner sc = new Scanner(System.in);
	private StudentController sCon = new StudentController();

	public void mainMenu() {
		int select;

		while (true) {
			System.out.println(" = = = = = �л���� ���α׷� = = = = = ");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ���");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. Save");
			System.out.println("5. Load");
			System.out.println("0. ���α׷� ����");
			System.out.print("����(0~5):");
			try {
				select = sc.nextInt();

				switch (select) {
				case 1:
					insertData();
					break;
				case 2:
					printData();
					break;
				case 3:
					deleteData();
					break;
				case 4:
					saveData();
					break;
				case 5:
					loadData();
					break;
				case 0:
					System.out.println("���α׷��� �����մϴ�.�����մϴ�.");
					return;
				default:System.err.println("�߸��� �Է�");
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.err.println("�߸��� �Է�");
			}
		}
	}

	private void insertData() {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		System.out.print("�̸� �Է�:");
		s.setName(sc.next());
		System.out.print("���� �Է�:");
		s.setAge(sc.nextInt());
		System.out.print("�ּ� �Է�:");
		s.setAddr(sc.next());
		
		sCon.insertData(s);
		
		System.out.println("�Է� �Ϸ�");
	}

	private void printData() {
		// TODO Auto-generated method stub
		if(!sCon.printData()) {
			System.out.println("����� ������ �����ϴ�.");
		}
	}

	private void deleteData() {
		// TODO Auto-generated method stub
		System.out.println("������ �����Ͻðڽ��ϱ�?(y, n)");
		try {
			char choice = sc.next().charAt(0);
			if(choice == 'y' || choice == 'Y') {
				System.out.print("������ �л��� �̸� �Է�:");
				String name = sc.next();
				if (sCon.deleteData(name)) {
					System.out.println("���� �Ϸ�");
				} else {
					System.out.println("�������� �ش� �̸��� �л��� �������� �ʽ��ϴ�.");
				}
			} else if (choice == 'n' || choice == 'N'){
				System.out.println("���� ���. ���� �޴��� ���ư��ϴ�.");
				return;
			} else {
				System.err.println("�߸��� �Է�. ���� �޴��� ���ư��ϴ�.");
				return;
			}
		} catch (Exception e) {
			// TODO: handle exception
			sc.next();
			System.err.println("�߸��� �Է�. ���� �޴��� ���ư��ϴ�.");
			return;
		}
	}

	private void saveData() {
		// TODO Auto-generated method stub
		if (sCon.saveData()) {
			System.out.println("����Ϸ�");
		} else {
			System.err.println("�������");			
		}
		
	}

	private void loadData() {
		// TODO Auto-generated method stub
		if (sCon.loadData()) {
			System.out.println("�ҷ����� �Ϸ�");
		} else {
			System.err.println("�ҷ����� ����");			
		}
	}

}
