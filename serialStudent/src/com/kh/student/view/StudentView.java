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
			System.out.println(" = = = = = 학사관리 프로그램 = = = = = ");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. Save");
			System.out.println("5. Load");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택(0~5):");
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
					System.out.println("프로그램을 종료합니다.감사합니다.");
					return;
				default:System.err.println("잘못된 입력");
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.err.println("잘못된 입력");
			}
		}
	}

	private void insertData() {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		System.out.print("이름 입력:");
		s.setName(sc.next());
		System.out.print("나이 입력:");
		s.setAge(sc.nextInt());
		System.out.print("주소 입력:");
		s.setAddr(sc.next());
		
		sCon.insertData(s);
		
		System.out.println("입력 완료");
	}

	private void printData() {
		// TODO Auto-generated method stub
		if(!sCon.printData()) {
			System.out.println("출력할 정보가 없습니다.");
		}
	}

	private void deleteData() {
		// TODO Auto-generated method stub
		System.out.println("정말로 삭제하시겠습니까?(y, n)");
		try {
			char choice = sc.next().charAt(0);
			if(choice == 'y' || choice == 'Y') {
				System.out.print("삭제할 학생의 이름 입력:");
				String name = sc.next();
				if (sCon.deleteData(name)) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제실패 해당 이름의 학생이 존재하지 않습니다.");
				}
			} else if (choice == 'n' || choice == 'N'){
				System.out.println("삭제 취소. 메인 메뉴로 돌아갑니다.");
				return;
			} else {
				System.err.println("잘못된 입력. 메인 메뉴로 돌아갑니다.");
				return;
			}
		} catch (Exception e) {
			// TODO: handle exception
			sc.next();
			System.err.println("잘못된 입력. 메인 메뉴로 돌아갑니다.");
			return;
		}
	}

	private void saveData() {
		// TODO Auto-generated method stub
		if (sCon.saveData()) {
			System.out.println("저장완료");
		} else {
			System.err.println("저장실패");			
		}
		
	}

	private void loadData() {
		// TODO Auto-generated method stub
		if (sCon.loadData()) {
			System.out.println("불러오기 완료");
		} else {
			System.err.println("불러오기 실패");			
		}
	}

}
