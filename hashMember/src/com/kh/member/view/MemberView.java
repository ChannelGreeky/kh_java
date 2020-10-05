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
			System.out.println(" = = = = = ȸ������ ���α׷� = = = = = ");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ���� ��ȸ(��ü)");
			System.out.println("3. ȸ�� ���� ��ȸ(ȸ����ȣ����)");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("����(0~5):");

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
				System.out.println("���α׷��� �����մϴ�.�����մϴ�.");
				return;
			}
		}
	}

	private void insertMember() {
		// TODO Auto-generated method stub
		Member vo = new Member();

		System.out.println(" = = = = = ȸ������ �� = = = = = ");
		while (true) {
			System.out.print("ȸ�� ID:");
			vo.setId(sc.next());
			if (mCon.memberCheck(vo.getId())) {
				break;
			} else {
				System.err.println("�̹� �����ϴ� ID�Դϴ�.");
			}
		}
		System.out.print("ȸ�� �̸�:");
		vo.setName(sc.next());
		System.out.print("ȸ�� ����:");
		vo.setJopGrade(sc.next());
		System.out.print("ȸ�� ����:");
		vo.setAge(sc.nextInt());
		System.out.print("ȸ�� �ּ�:");
		vo.setAddress(sc.next());
		
		if(mCon.insertMember(vo)) {
			System.out.println("ȸ������ ����");
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
			System.out.print("ȸ�� ID:");
			String id = sc.next();
			if (mCon.memberCheck(id)) {
				System.err.println("�������� �ʴ� ȸ���Դϴ�.");
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
