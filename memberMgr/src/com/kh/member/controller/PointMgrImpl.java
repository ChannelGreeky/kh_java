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
			System.out.println("======== 회원 관리 프로그램 ver 2.0 ========");
			System.out.println("1. 회원정보 입력");
			System.out.println("2. 회원정보 전체출력");
			System.out.println("3. 회원정보 검색출력");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원정보 삭제");
			System.out.println("0. 종료");
			System.out.print("선택:");
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
				System.out.println("프로그램을 종료합니다 감사합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	@Override
	public void memberInsertData() {
		// TODO Auto-generated method stub
		System.out.println("------[" + index + "]번 학생정보 입력 ------");
		System.out.print("-이름 입력:");
		String _name = sc.next();

		System.out.print("-등급 입력(1.Silver/2.Gold/3.Platinum/4.Vip/5.VVip):");
		int _grade = sc.nextInt();

		System.out.print("-점수 입력:");
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
			System.out.println("잘못된 입력입니다.");
			break;
		}

		System.out.println("-------------정보입력 완료-------------");
		if (index > member.length) {
			System.out.println("더 이상 입력할 수 없습니다.");
		}
	}

	@Override
	public void memberModifyData() {
		// TODO Auto-generated method stub
		
		System.out.print("수정할 이름 입력 : ");
		String _name = sc.next();
		int searchIndex = searchMember(_name);
		System.out.println("검색 회원 정보:"+member[searchIndex].getName()+"/"
				+member[searchIndex].getGrade()+"/"
				+member[searchIndex].getPoint());
		
		System.out.println("1. 회원이름 수정");
		System.out.println("2. 회원등급 수정");
		System.out.println("3. 회원점수 수정");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("수정할 이름:"); 
			member[searchIndex].setName(sc.next()); 
			System.out.println("====수정 완료===="); 
			break;
		case 2:
			System.out.println("수정할 등급(1.Silver/2.Gold/3.Platinum/4.Vip/5.Vvip):"); 
			select = sc.nextInt();
			switch(select) {
			case 1:
				member[searchIndex] = new Silver(member[searchIndex].getName(), "Silver", member[searchIndex].getPoint());
				System.out.println("====수정 완료====");
				break;
			case 2:
				member[searchIndex] = new Gold(member[searchIndex].getName(), "Gold", member[searchIndex].getPoint());
				System.out.println("====수정 완료====");
				break;
			case 3:
				member[searchIndex] = new Platinum(member[searchIndex].getName(), "Platinum", member[searchIndex].getPoint());
				System.out.println("====수정 완료====");
				break;
			case 4:
				member[searchIndex] = new Vip(member[searchIndex].getName(), "Vip", member[searchIndex].getPoint());
				System.out.println("====수정 완료====");
				break;
			case 5:
				member[searchIndex] = new Vvip(member[searchIndex].getName(), "Vvip", member[searchIndex].getPoint());
				System.out.println("====수정 완료====");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		case 3:
			System.out.println("수정할 점수:"); 
			member[searchIndex].setPoint(sc.nextInt()); 
			System.out.println("====수정 완료====");
			break;
		}
	}

	@Override
	public void memberAllPrintData() {
		// TODO Auto-generated method stub
		System.out.println("========= 전체 회원 정보 출력 =========");
		for (int i = 0; i < index; i++) {
			System.out.println("["+i+"]번 회원");
			System.out.println("이름:" + member[i].getName());
			System.out.println("등급:" + member[i].getGrade());
			System.out.println("포인트:" + member[i].getPoint());
			System.out.println("이자포인트:" + member[i].getInterest());
		}
	}

	public void memberSearchPrintData() {
		// TODO Auto-generated method stub
		System.out.print("검색할 이름 입력 : ");
		String _name = sc.next();
		int searchIndex = searchMember(_name);
		if (searchIndex != -1) {
			System.out.println("========= 검색 회원 정보 출력 =========");
			System.out.println("이름:" + member[searchIndex].getName());
			System.out.println("등급:" + member[searchIndex].getGrade());
			System.out.println("포인트:" + member[searchIndex].getPoint());
			System.out.println("이자포인트:" + member[searchIndex].getInterest());
		}
	}

	@Override
	public void memberDeleteData() {
		// TODO Auto-generated method stub
		// 삭제 후 뒤에거 앞으로댕겨서 중간 빈공간 채우기
		System.out.print("삭제할 이름 입력 : ");
		String _name = sc.next();
		int searchIndex = searchMember(_name);
		System.out.println("검색 회원 정보:"+member[searchIndex].getName()+"/"
							+member[searchIndex].getGrade()+"/"
							+member[searchIndex].getPoint());
		System.out.print("정말로 삭제하시겠습니까?(y,n)");
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			member[searchIndex] = null;
			for(int i = searchIndex; i<index; i++) {
				member[i] = member[i+1];	
				index--;
				System.out.println("====삭제 완료====");
			}
		}
		else {
			System.out.println("====삭제 취소====");
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
		System.out.println("찾을 수 없습니다.");
		return -1;
	}
}
