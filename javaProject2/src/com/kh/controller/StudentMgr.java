package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Scanner sc = new Scanner(System.in);
	Student s;

	// 클래스를 시작하기 위한 메소드
	public void start() {
		while (true) {
			int select;
			System.out.println("======== 학생 관리 프로그램 ver 1.0 ========");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 학생정보 삭제");
			System.out.println("0. 종료");
			System.out.print("선택:");
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
				System.out.println("프로그램을 종료합니다 감사합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	// 학생정보를 입력하기 위한 메소드
	public void studentInsert() {
		if (s == null) {
			s = new Student();
			System.out.println("------------------------------");
			System.out.println("-이름 입력:");
			s.setName(sc.next());
			System.out.println("-학번 입력:");
			s.setId(sc.next());
			System.out.println("-나이 입력:");
			s.setAge(sc.nextInt());
			System.out.println("-핸드폰번호 입력:");
			s.setPhone(sc.next());
			System.out.println("-성별 입력:");
			s.setGender(sc.next());
			
			System.out.println("-------------정보입력 완료-------------");
		} else {
			System.out.println("더 이상 입력할 수 없습니다.");
		}

	}

	public void studentPrint() {
		if (s == null) {
			System.out.println("출력할 정보가 없습니다.");
		} else {
			System.out.print("1.이름 :" + s.getName());
			System.out.print("2.학번 :" + s.getId());
			System.out.print("3.나이 :" + s.getAge());
			System.out.println("4.핸드폰번호 :" + s.getPhone());
			System.out.println("5성별 :" + s.getGender());
		}
	}

	// 학생정보를 삭제하기 위한 메소드
	public void studentDelete() {
		if (s == null) {
			System.out.println("삭제할 정보가 없습니다.");
		} else {
			s = null;
		}
	}

}
