package com.kh.student.view;

import java.util.ArrayList;
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
			System.out.println("1. �л� ��ü ���� ���");
			System.out.println("2. �л� ���� ��ȸ(�й�����)");
			System.out.println("3. �л� ���� �Է�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("����(0~5):");

			select = sc.nextInt();

			switch (select) {
			case 1:
				selectAll();
				break;
			case 2:
				selectOne();
				break;
			case 3:
				insertStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.�����մϴ�.");
				return;
			}
		}
	}

	private void selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Student> list = sCon.selectAll();

		if (list.isEmpty()) {
			System.err.println("����� ������ �����ϴ�.");
		} else {
			System.out.println("----------------");
			for (Student vo : list) {
				// System.out.println(list.get(i).getClassNumber() + "/" + list.get(i).getName()
				// + "/"
				// + list.get(i).getAge() + "/" + list.get(i).getAddress() + "/" +
				// list.get(i).getGrade());
				System.out.println(vo); // toString�Լ� ȣ��
			}
			System.out.println("----------------");
		}
	}

	private void selectOne() {
		// TODO Auto-generated method stub
		System.out.print("��ȸ�� �л� �й� �Է�:");
		int classNumber = sc.nextInt();
		Student vo = sCon.selectOne(classNumber);

		if (vo == null) {
			System.err.println("�ش� �л��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("----------------");
			System.out.println(vo); // toString�Լ� ȣ��
			System.out.println("----------------");
		}
	}

	private void insertStudent() {
		// TODO Auto-generated method stub
		Student vo = new Student();
		while (true) {
			System.out.print("�л� �й� �Է�:");
			vo.setClassNumber(sc.nextInt());
			if (!sCon.check(vo.getClassNumber())) {
				break;
			} else {
				System.err.println("�й��� �ߺ��� �� �����ϴ�.");
				System.err.println("�̹� �����ϴ� �й� �Դϴ�.");
			}
		}
		System.out.print("�л� �̸� �Է�:");
		vo.setName(sc.next());
		System.out.print("�л� ���� �Է�:");
		vo.setAge(sc.nextInt());
		System.out.print("�л� �ּ� �Է�:");
		vo.setAddress(sc.next());
		System.out.print("�л� ���� �Է�:");
		vo.setGrade(sc.nextDouble());

		if (sCon.insertStudent(vo)) {
			System.out.println("�л� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.err.println("�л� ���� �Է¿� ���� �Ͽ����ϴ�.");
			System.err.println("�ٽ� �õ����ּ���.");
		}
	}

	private void updateStudent() {
		// TODO Auto-generated method stub
		Student vo = new Student();
		int select;
		System.out.println("----------------");
		System.out.print("������ �л� �й� �Է�:");
		int classNumber = sc.nextInt();

		if (sCon.check(classNumber)) {
			System.out.println("������ ���� ����");
			System.out.println("[1.�й�]\t[2.�̸�]\t[3.����]\t");
			System.out.println("[4.�ּ�]\t[5.����]\t[0.���]\t");
			System.out.print("����:");
			select = sc.nextInt();
			switch (select) {
			case 1:
				while (true) {
					System.out.print("[������ �й�(�й� �ߺ� ����)]:");
					vo.setClassNumber(sc.nextInt());
					if (!sCon.check(vo.getClassNumber())) {
						break;
					} else {
						System.err.println("�й��� �ߺ��� �� �����ϴ�.");
						System.err.println("�̹� �����ϴ� �й� �Դϴ�.");
					}
				}
				break;
			case 2:
				System.out.print("[������ �̸�]:");
				vo.setName(sc.next());
				break;
			case 3:
				System.out.print("[������ ����]:");
				vo.setAge(sc.nextInt());
				break;
			case 4:
				System.out.print("[������ �ּ�]:");
				vo.setAddress(sc.next());
				break;
			case 5:
				System.out.print("[������ ����]:");
				vo.setGrade(sc.nextDouble());
				break;
			case 0:
				return;
			default:
				System.out.println("�߸��� �Է�");
				return;
			}

			if (sCon.updateStudent(classNumber, vo, select)) {
				System.out.println("�л� ���� ������ �Ϸ�Ǿ����ϴ�.");
			} else {
				System.err.println("�л� ���� ������ ���� �Ͽ����ϴ�.");
				System.err.println("�ٽ� �õ����ּ���.");
			}
		} else {
			System.err.println("�ش� ������ �л��� �������� �ʽ��ϴ�.");
		}

	}

	private void deleteStudent() {
		// TODO Auto-generated method stub
		int select;
		System.out.println("----------------");
		System.out.println("[���� �޴�]");
		System.out.println("1. �л� ���� ��ü ����");
		System.out.println("2. �л� ���� ��ü ����");
		System.out.print("����:");
		select = sc.nextInt();

		switch (select) {
		case 1: 
			System.out.println("������ ��ü �л������� �����Ͻðڽ��ϱ�?\n������ ������ �ǵ��� �� �����ϴ�.(Y,N)");
			char answer = sc.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				sCon.deleteStudent();
				System.out.println("�����Ǿ����ϴ�.");
			} else {
				System.out.println("���� ��� ���θ޴��� ���ư��ϴ�.");
				return;
			}
			break;
		case 2: 
			System.out.print("������ �л� �й� �Է�:");
			int classNumber = sc.nextInt();

			if (sCon.check(classNumber)) {
				if (sCon.deleteStudent(classNumber)) {
					System.out.println("�л� ���� ������ �Ϸ�Ǿ����ϴ�.");
				} else {
					System.err.println("�л� ���� ������ ���� �Ͽ����ϴ�.");
					System.err.println("�ٽ� �õ����ּ���.");
				}
			} else {
				System.err.println("�ش� �л��� �������� �ʽ��ϴ�.");
			}
			break;
		default: System.out.println("�߸��� �Է�. ������ ����մϴ�."); return;
		}
	
	}

}
