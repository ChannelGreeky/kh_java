package com.kh.member.controller;

import java.util.Scanner;

import com.kh.member.vo.Gold;
import com.kh.member.vo.Grade;
import com.kh.member.vo.Platinum;
import com.kh.member.vo.Silver;
import com.kh.member.vo.Vip;
import com.kh.member.vo.Vvip;

public class PointMgrImpl implements PointMgr {

	Scanner sc = new Scanner(System.in);
	private Grade[] member = new Grade[30];
	private int index = 0;

	public PointMgrImpl() {
	}

	public void start() {
		while (true) {
			int select;
			System.out.println("======== ȸ�� ���� ���α׷� ver 2.0 ========");
			System.out.println("1. ȸ������ �Է�");
			System.out.println("2. ȸ������ ��ü���");
			System.out.println("3. ȸ������ �˻����");
			System.out.println("4. ȸ������ ����");
			System.out.println("5. ȸ������ ����");
			System.out.println("0. ����");
			System.out.print("����:");
			select = sc.nextInt();

			switch (select) {
			case 1:
				memberInsertData();
				break;
			case 2:
				memberAllPrintData();
				break;
			case 3:
				memberSearchPrintData();
				break;
			case 4:
				memberModifyData();
				break;
			case 5:
				memberDeleteData();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}

	@Override
	public void memberInsertData() {
		// TODO Auto-generated method stub
		System.out.println("------[" + index + "]�� �л����� �Է� ------");
		System.out.print("-�̸� �Է�:");
		String _name = sc.next();

		System.out.print("-��� �Է�(1.Silver/2.Gold/3.Platinum/4.Vip/5.VVip):");
		int _grade = sc.nextInt();

		System.out.print("-���� �Է�:");
		int _point = sc.nextInt();

		switch (_grade) {
		case 1:
			member[index++] = new Silver(_name, "Silver", _point);
			break;
		case 2:
			member[index++] = new Gold(_name, "Gold", _point);
			break;
		case 3:
			member[index++] = new Platinum(_name, "Platinum", _point);
			break;
		case 4:
			member[index++] = new Vip(_name, "Vip", _point);
			break;
		case 5:
			member[index++] = new Vvip(_name, "Vvip", _point);
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}

		System.out.println("-------------�����Է� �Ϸ�-------------");
		if (index > member.length) {
			System.out.println("�� �̻� �Է��� �� �����ϴ�.");
		}
	}

	@Override
	public void memberModifyData() {
		// TODO Auto-generated method stub
		
		System.out.print("������ �̸� �Է� : ");
		String _name = sc.next();
		int searchIndex = searchMember(_name);
		System.out.println("�˻� ȸ�� ����:"+member[searchIndex].getName()+"/"
				+member[searchIndex].getGrade()+"/"
				+member[searchIndex].getPoint());
		
		System.out.println("1. ȸ���̸� ����");
		System.out.println("2. ȸ����� ����");
		System.out.println("3. ȸ������ ����");
		System.out.print("���� : ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("������ �̸�:"); 
			member[searchIndex].setName(sc.next()); 
			System.out.println("====���� �Ϸ�===="); 
			break;
		case 2:
			System.out.println("������ ���(1.Silver/2.Gold/3.Platinum/4.Vip/5.Vvip):"); 
			select = sc.nextInt();
			switch(select) {
			case 1:
				member[searchIndex] = new Silver(member[searchIndex].getName(), "Silver", member[searchIndex].getPoint());
				System.out.println("====���� �Ϸ�====");
				break;
			case 2:
				member[searchIndex] = new Gold(member[searchIndex].getName(), "Gold", member[searchIndex].getPoint());
				System.out.println("====���� �Ϸ�====");
				break;
			case 3:
				member[searchIndex] = new Platinum(member[searchIndex].getName(), "Platinum", member[searchIndex].getPoint());
				System.out.println("====���� �Ϸ�====");
				break;
			case 4:
				member[searchIndex] = new Vip(member[searchIndex].getName(), "Vip", member[searchIndex].getPoint());
				System.out.println("====���� �Ϸ�====");
				break;
			case 5:
				member[searchIndex] = new Vvip(member[searchIndex].getName(), "Vvip", member[searchIndex].getPoint());
				System.out.println("====���� �Ϸ�====");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		case 3:
			System.out.println("������ ����:"); 
			member[searchIndex].setPoint(sc.nextInt()); 
			System.out.println("====���� �Ϸ�====");
			break;
		}
	}

	@Override
	public void memberAllPrintData() {
		// TODO Auto-generated method stub
		System.out.println("========= ��ü ȸ�� ���� ��� =========");
		for (int i = 0; i < index; i++) {
			System.out.println("["+i+"]�� ȸ��");
			System.out.println("�̸�:" + member[i].getName());
			System.out.println("���:" + member[i].getGrade());
			System.out.println("����Ʈ:" + member[i].getPoint());
			System.out.println("��������Ʈ:" + member[i].getInterest());
		}
	}

	public void memberSearchPrintData() {
		// TODO Auto-generated method stub
		System.out.print("�˻��� �̸� �Է� : ");
		String _name = sc.next();
		int searchIndex = searchMember(_name);
		if (searchIndex != -1) {
			System.out.println("========= �˻� ȸ�� ���� ��� =========");
			System.out.println("�̸�:" + member[searchIndex].getName());
			System.out.println("���:" + member[searchIndex].getGrade());
			System.out.println("����Ʈ:" + member[searchIndex].getPoint());
			System.out.println("��������Ʈ:" + member[searchIndex].getInterest());
		}
	}

	@Override
	public void memberDeleteData() {
		// TODO Auto-generated method stub
		// ���� �� �ڿ��� �����δ�ܼ� �߰� ����� ä���
		System.out.print("������ �̸� �Է� : ");
		String _name = sc.next();
		int searchIndex = searchMember(_name);
		System.out.println("�˻� ȸ�� ����:"+member[searchIndex].getName()+"/"
							+member[searchIndex].getGrade()+"/"
							+member[searchIndex].getPoint());
		System.out.print("������ �����Ͻðڽ��ϱ�?(y,n)");
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			member[searchIndex] = null;
			for(int i = searchIndex; i<index; i++) {
				member[i] = member[i+1];	
				index--;
				System.out.println("====���� �Ϸ�====");
			}
		}
		else {
			System.out.println("====���� ���====");
		}
	}

	@Override
	public int searchMember(String name) {
		// TODO Auto-generated method stub
		int searchIndex;
		for (int i = 0; i < index; i++) {
			if (name.equals(member[i].getName())) {
				searchIndex=i;
				return searchIndex;
			}
		}
		System.out.println("ã�� �� �����ϴ�.");
		return -1;
	}
}
