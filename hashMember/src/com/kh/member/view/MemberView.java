package com.kh.member.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;

public class MemberView {
	Scanner sc = new Scanner(System.in);

	private MemberController mCon = new MemberController();

	public void start() {
		int select;

		while (true) {
			System.out.println(" = = = = = 회원관리 프로그램 = = = = = ");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 정보 조회(전체)");
			System.out.println("3. 회원 정보 조회(회원번호선택)");
			System.out.println("4. 회원 정보 변경");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택(0~5):");

			select = sc.nextInt();

			switch (select) {
			case 1:
				insertMember();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				selectOne();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.감사합니다.");
				return;
			}
		}
	}

	private void insertMember() {
		// TODO Auto-generated method stub
		Member vo = new Member();

		System.out.println(" = = = = = 회원가입 폼 = = = = = ");
		while (true) {
			System.out.print("회원 ID:");
			vo.setId(sc.next());
			if (mCon.memberCheck(vo.getId())) {
				break;
			} else {
				System.err.println("이미 존재하는 ID입니다.");
			}
		}
		System.out.print("회원 이름:");
		vo.setName(sc.next());
		System.out.print("회원 직급:");
		vo.setJopGrade(sc.next());
		System.out.print("회원 나이:");
		vo.setAge(sc.nextInt());
		System.out.print("회원 주소:");
		vo.setAddress(sc.next());
		
		if(mCon.insertMember(vo)) {
			System.out.println("회원가입 성공");
		}
	}

	private void selectAll() {
		// TODO Auto-generated method stub
		
		HashMap hm = mCon.selectAll();
		Set<String> s = hm.keySet();

		Iterator<String> iter = s.iterator();

		while (iter.hasNext()) {
			System.out.println(hm.get(iter.next()));
		}

	}

	private void selectOne() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.print("회원 ID:");
			String id = sc.next();
			if (mCon.memberCheck(id)) {
				System.err.println("존재하지 않는 회원입니다.");
				break;
			} else {
				Member m = mCon.selectOne(id);
				System.out.println(m);
				break;
			}
		}
	}

	private void updateMember() {
		// TODO Auto-generated method stub

	}

	private void deleteMember() {
		// TODO Auto-generated method stub

	}
}
