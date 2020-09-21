package or.kr.iei.member.controller;

import java.util.Scanner;

import or.kr.iei.member.vo.Member;

public class MemberMgr {
	Member m;
	Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("====회원관리 시스템====");
			System.out.println("1. 회원정보 입력");
			System.out.println("2. 회원정보 출력");
			System.out.println("3. 회원정보 삭제");
			System.out.println("0. 종료");
			System.out.print("입력:");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				memberInsert();
				break;
			case 2:
				memberPrint();
				break;
			case 3:
				memberDelete();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void memberInsert() {
		if (m == null) {
			m = new Member();

			System.out.print("회원 이름:");
			m.setName(sc.next());
			System.out.print("회원 나이:");
			m.setAge(sc.nextInt());
			System.out.print("회원 주소:");
			m.setAddress(sc.next());
			System.out.print("회원 핸드폰 번호:");
			m.setPhone(sc.next());
			System.out.print("회원 성별:");
			m.setGender(sc.next());

			System.out.println("====정보 입력 완료====");
		} else {
			System.out.println("이미 입력된 정보가 있습니다.");
		}
	}

	public void memberPrint() {
		if (m == null) {
			System.out.println("입력된 회원이 없습니다.");
		} else {
			System.out.println("회원 이름:" + m.getName());
			System.out.println("회원 나이:" + m.getAge());
			System.out.println("회원 주소:" + m.getAddress());
			System.out.println("회원 핸드폰 번호:" + m.getPhone());
			System.out.println("회원 성별:" + m.getGender());
		}
	}

	public void memberDelete() {
		if (m == null) {
			System.out.println("삭제할 회원정보가 없습니다.");
		} else {
			System.out.println("삭제 완료");
			m = null;
		}
	}
}
