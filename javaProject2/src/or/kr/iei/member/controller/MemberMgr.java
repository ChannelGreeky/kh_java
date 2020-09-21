package or.kr.iei.member.controller;

import java.util.Scanner;

import or.kr.iei.member.vo.Member;

public class MemberMgr {
	Member m;
	Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("====ȸ������ �ý���====");
			System.out.println("1. ȸ������ �Է�");
			System.out.println("2. ȸ������ ���");
			System.out.println("3. ȸ������ ����");
			System.out.println("0. ����");
			System.out.print("�Է�:");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	public void memberInsert() {
		if (m == null) {
			m = new Member();

			System.out.print("ȸ�� �̸�:");
			m.setName(sc.next());
			System.out.print("ȸ�� ����:");
			m.setAge(sc.nextInt());
			System.out.print("ȸ�� �ּ�:");
			m.setAddress(sc.next());
			System.out.print("ȸ�� �ڵ��� ��ȣ:");
			m.setPhone(sc.next());
			System.out.print("ȸ�� ����:");
			m.setGender(sc.next());

			System.out.println("====���� �Է� �Ϸ�====");
		} else {
			System.out.println("�̹� �Էµ� ������ �ֽ��ϴ�.");
		}
	}

	public void memberPrint() {
		if (m == null) {
			System.out.println("�Էµ� ȸ���� �����ϴ�.");
		} else {
			System.out.println("ȸ�� �̸�:" + m.getName());
			System.out.println("ȸ�� ����:" + m.getAge());
			System.out.println("ȸ�� �ּ�:" + m.getAddress());
			System.out.println("ȸ�� �ڵ��� ��ȣ:" + m.getPhone());
			System.out.println("ȸ�� ����:" + m.getGender());
		}
	}

	public void memberDelete() {
		if (m == null) {
			System.out.println("������ ȸ�������� �����ϴ�.");
		} else {
			System.out.println("���� �Ϸ�");
			m = null;
		}
	}
}
