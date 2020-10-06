package com.kh.run;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Serial {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> list = new ArrayList<Student>();

	public Serial() {
		File file = new File("./student.dat");
		
		if(file.exists()) {
			loadData();	
		}
	}
	public void objectIo() {
		while (true) {
			System.out.println("==========�޴�==========");
			System.out.println("1. �л����� �Է�");
			System.out.println("2. �л����� ���");
			System.out.println("3. Save");
			System.out.println("4. Load");
			System.out.print("����(����0):");
			try {
				int select = sc.nextInt();
	
				switch (select) {
				case 1:
					insertData();
					break;
				case 2:
					printData();
					break;
				case 3:
					saveData();
					break;
				case 4:
					loadData();
					break;
				case 0:
					return;
				default:
					System.err.println("�߸��� �Է�");
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.err.println("�߸��� �Է�");
				sc.nextLine();
			}
		}
	}

	private void insertData() {
		// TODO Auto-generated method stub
		Student s = new Student();// �ӽ÷� ����� ����

		System.out.print("�̸� �Է�:");
		s.setName(sc.next());
		System.out.print("���� �Է�:");
		s.setAge(sc.nextInt());
		System.out.print("�ּ� �Է�:");
		s.setAddr(sc.next());

		list.add(s);
		System.out.println("�Է� �Ϸ�");
	}

	private void printData() {
		// TODO Auto-generated method stub
		for (Student s : list) {
			System.out.println(s);
		}
	}

	private void saveData() {
		// TODO Auto-generated method stub
		// �ܼ� ���(Stream)�� ���� �Ѱ�
		//FileOutputStream fos = null;
		// ��ü�� �̵��Ҽ� �ֵ��� �ϴ� ���� ��Ʈ��(������Ʈ���� ȥ�� ������� �� ���� �� ��Ʈ���� ���ؼ��� ���� ����)
		ObjectOutputStream oos = null;
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
			
			oos.writeObject(list);
			System.out.println("���� �Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private void loadData() {
		// TODO Auto-generated method stub
		// �ܼ� ���(Stream)�� ���� �Ѱ�
		//FileOutputStream fos = null;
		// ��ü�� �̵��Ҽ� �ֵ��� �ϴ� ���� ��Ʈ��
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("student.dat"));
			list = (ArrayList<Student>)ois.readObject();
			System.out.println("�ҷ����� �Ϸ�");
		} catch (FileNotFoundException e){
			System.err.println("����� �����Ͱ� �����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
