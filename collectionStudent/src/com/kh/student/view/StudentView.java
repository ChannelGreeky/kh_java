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
			System.out.println(" = = = = = 학사관리 프로그램 = = = = = ");
			System.out.println("1. 학생 전체 정보 출력");
			System.out.println("2. 학생 정보 조회(학번선택)");
			System.out.println("3. 학생 정보 입력");
			System.out.println("4. 학생 정보 변경");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택(0~5):");

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
				System.out.println("프로그램을 종료합니다.감사합니다.");
				return;
			}
		}
	}

	private void selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Student> list = sCon.selectAll();

		if (list.isEmpty()) {
			System.err.println("출력할 정보가 없습니다.");
		} else {
			System.out.println("----------------");
			for (Student vo : list) {
				// System.out.println(list.get(i).getClassNumber() + "/" + list.get(i).getName()
				// + "/"
				// + list.get(i).getAge() + "/" + list.get(i).getAddress() + "/" +
				// list.get(i).getGrade());
				System.out.println(vo); // toString함수 호출
			}
			System.out.println("----------------");
		}
	}

	private void selectOne() {
		// TODO Auto-generated method stub
		System.out.print("조회할 학생 학번 입력:");
		int classNumber = sc.nextInt();
		Student vo = sCon.selectOne(classNumber);

		if (vo == null) {
			System.err.println("해당 학생이 존재하지 않습니다.");
		} else {
			System.out.println("----------------");
			System.out.println(vo); // toString함수 호출
			System.out.println("----------------");
		}
	}

	private void insertStudent() {
		// TODO Auto-generated method stub
		Student vo = new Student();
		while (true) {
			System.out.print("학생 학번 입력:");
			vo.setClassNumber(sc.nextInt());
			if (!sCon.check(vo.getClassNumber())) {
				break;
			} else {
				System.err.println("학번은 중복될 수 없습니다.");
				System.err.println("이미 존재하는 학번 입니다.");
			}
		}
		System.out.print("학생 이름 입력:");
		vo.setName(sc.next());
		System.out.print("학생 나이 입력:");
		vo.setAge(sc.nextInt());
		System.out.print("학생 주소 입력:");
		vo.setAddress(sc.next());
		System.out.print("학생 학점 입력:");
		vo.setGrade(sc.nextDouble());

		if (sCon.insertStudent(vo)) {
			System.out.println("학생 정보 입력이 완료되었습니다.");
		} else {
			System.err.println("학생 정보 입력에 실패 하였습니다.");
			System.err.println("다시 시도해주세요.");
		}
	}

	private void updateStudent() {
		// TODO Auto-generated method stub
		Student vo = new Student();
		int select;
		System.out.println("----------------");
		System.out.print("수정할 학생 학번 입력:");
		int classNumber = sc.nextInt();

		if (sCon.check(classNumber)) {
			System.out.println("수정할 정보 선택");
			System.out.println("[1.학번]\t[2.이름]\t[3.나이]\t");
			System.out.println("[4.주소]\t[5.학점]\t[0.취소]\t");
			System.out.print("선택:");
			select = sc.nextInt();
			switch (select) {
			case 1:
				while (true) {
					System.out.print("[수정할 학번(학번 중복 금지)]:");
					vo.setClassNumber(sc.nextInt());
					if (!sCon.check(vo.getClassNumber())) {
						break;
					} else {
						System.err.println("학번은 중복될 수 없습니다.");
						System.err.println("이미 존재하는 학번 입니다.");
					}
				}
				break;
			case 2:
				System.out.print("[수정할 이름]:");
				vo.setName(sc.next());
				break;
			case 3:
				System.out.print("[수정할 나이]:");
				vo.setAge(sc.nextInt());
				break;
			case 4:
				System.out.print("[수정할 주소]:");
				vo.setAddress(sc.next());
				break;
			case 5:
				System.out.print("[수정할 학점]:");
				vo.setGrade(sc.nextDouble());
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력");
				return;
			}

			if (sCon.updateStudent(classNumber, vo, select)) {
				System.out.println("학생 정보 수정이 완료되었습니다.");
			} else {
				System.err.println("학생 정보 수정에 실패 하였습니다.");
				System.err.println("다시 시도해주세요.");
			}
		} else {
			System.err.println("해당 정보의 학생이 존재하지 않습니다.");
		}

	}

	private void deleteStudent() {
		// TODO Auto-generated method stub
		int select;
		System.out.println("----------------");
		System.out.println("[삭제 메뉴]");
		System.out.println("1. 학생 정보 전체 삭제");
		System.out.println("2. 학생 정보 전체 삭제");
		System.out.print("선택:");
		select = sc.nextInt();

		switch (select) {
		case 1: 
			System.out.println("정말로 전체 학생정보를 삭제하시겠습니까?\n삭제된 정보는 되돌릴 수 없습니다.(Y,N)");
			char answer = sc.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				sCon.deleteStudent();
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("삭제 취소 메인메뉴로 돌아갑니다.");
				return;
			}
			break;
		case 2: 
			System.out.print("삭제할 학생 학번 입력:");
			int classNumber = sc.nextInt();

			if (sCon.check(classNumber)) {
				if (sCon.deleteStudent(classNumber)) {
					System.out.println("학생 정보 삭제가 완료되었습니다.");
				} else {
					System.err.println("학생 정보 삭제에 실패 하였습니다.");
					System.err.println("다시 시도해주세요.");
				}
			} else {
				System.err.println("해당 학생이 존재하지 않습니다.");
			}
			break;
		default: System.out.println("잘못된 입력. 삭제를 취소합니다."); return;
		}
	
	}

}
