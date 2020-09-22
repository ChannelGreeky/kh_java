package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Scanner sc = new Scanner(System.in);
	Student s;

	public void start() {
		while (true) {
			System.out.println("====학생정보 관리 프로그램====");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");

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
				System.out.println("프로그램이 종료됩니다.");
				return;
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	public void studentPrint() {
		if (this.s == null) {
			System.out.println("출력될 정보가 없습니다.");
		} else {
			System.out.println("[이름]:" + this.s.getName());
			System.out.println("[학번]:" + this.s.getId());
			System.out.println("[나이]:" + this.s.getAge());
			System.out.println("[핸드폰번호]:" + this.s.getPhone());
			System.out.println("[성별]:" + this.s.getGender());
		}
	}

	public void studentInsert() {
		if (this.s == null) {
			this.s = new Student();

			System.out.print("[이름 입력]:");
			this.s.setName(sc.next());
			
			System.out.print("[학번 입력]:");
			this.s.setId(sc.next());
			
			System.out.print("[나이 입력]:");
			this.s.setAge(sc.nextInt());
			
			System.out.print("[핸드폰번호 입력]:");
			this.s.setPhone(sc.next());
			
			System.out.print("[성별 입력]:");
			this.s.setGender(sc.next());

			System.out.println("=====입력완료=====");
			System.out.println();
		} else {
			System.out.println("이미 입력된 정보가 있습니다.");
			System.out.println();
		}
	}

	public void studentUpdate() {
		if (this.s == null) {
			System.out.println("수정할 정보가 없습니다.");
			System.out.println();
		} else {
			System.out.println("===수정할 정보 선택===");
			System.out.println("1. 이름 수정");
			System.out.println("2. 학번 수정");
			System.out.println("3. 나이 수정");
			System.out.println("4. 핸드폰번호 수정");
			System.out.println("5. 성별 수정");
			System.out.println("0. 취소");
			System.out.print("선택 : ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("현재 이름:" + this.s.getName());
				System.out.print("[수정할 이름 입력]:");
				this.s.setName(sc.next());
				System.out.println("=====수정완료=====");
				System.out.println();
				break;
			case 2:
				System.out.println("현재 학번:" + this.s.getId());
				System.out.print("[수정할 학번 입력]:");
				this.s.setId(sc.next());
				System.out.println("=====수정완료=====");
				System.out.println();
				break;
			case 3:
				System.out.println("현재 나이:" + this.s.getAge());
				System.out.print("[수정할 나이 입력]:");
				this.s.setAge(sc.nextInt());
				System.out.println("=====수정완료=====");
				System.out.println();
				break;
			case 4:
				System.out.println("현재 핸드폰번호:" + this.s.getPhone());
				System.out.print("[수정할 핸드폰번호 입력]:");
				this.s.setPhone(sc.next());
				System.out.println("=====수정완료=====");
				System.out.println();
				break;
			case 5:
				System.out.println("현재 성별:" + this.s.getGender());
				System.out.print("[수정할 성별 입력]:");
				this.s.setGender(sc.next());
				System.out.println("=====수정완료=====");
				System.out.println();
				break;
			case 0:
				System.out.println("취소되었습니다.");
				System.out.println();
				return;
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	public void studentDelete() {
		if (this.s == null) {
			System.out.println("삭제할 정보가 없습니다.");
		} else {
			System.out.println("정말로 삭제하시겠습니까? 삭제하시면 복구할 수 없습니다.");
			System.out.println("삭제하시려면 y또는 Y를 돌아가시려면 n 또는 N을 눌러주세요.");
			char answer = sc.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("정보삭제완료");
				System.out.println();
				this.s = null;
			} else {
				System.out.println("취소되었습니다.");
				System.out.println();

				return;
			}
		}
	}
}
