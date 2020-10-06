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
			System.out.println("==========메뉴==========");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. Save");
			System.out.println("4. Load");
			System.out.print("선택(종료0):");
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
					System.err.println("잘못된 입력");
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.err.println("잘못된 입력");
				sc.nextLine();
			}
		}
	}

	private void insertData() {
		// TODO Auto-generated method stub
		Student s = new Student();// 임시로 저장될 공간

		System.out.print("이름 입력:");
		s.setName(sc.next());
		System.out.print("나이 입력:");
		s.setAge(sc.nextInt());
		System.out.print("주소 입력:");
		s.setAddr(sc.next());

		list.add(s);
		System.out.println("입력 완료");
	}

	private void printData() {
		// TODO Auto-generated method stub
		for (Student s : list) {
			System.out.println(s);
		}
	}

	private void saveData() {
		// TODO Auto-generated method stub
		// 단순 통로(Stream)를 선언 한것
		//FileOutputStream fos = null;
		// 객체가 이동할수 있도록 하는 보조 스트림(보조스트림은 혼자 만들어질 수 없다 주 스트림을 통해서만 생성 가능)
		ObjectOutputStream oos = null;
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
			
			oos.writeObject(list);
			System.out.println("저장 완료");
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
		// 단순 통로(Stream)를 선언 한것
		//FileOutputStream fos = null;
		// 객체가 이동할수 있도록 하는 보조 스트림
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("student.dat"));
			list = (ArrayList<Student>)ois.readObject();
			System.out.println("불러오기 완료");
		} catch (FileNotFoundException e){
			System.err.println("저장된 데이터가 없습니다.");
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
