package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Scanner sc = new Scanner(System.in);
	int count=0;
	int length=3;
	Student[] std = new Student[length];

	// 클래스를 시작하기 위한 메소드
	public void start() {
		while (true) {
			int select;
			System.out.println("======== 학생 관리 프로그램 ver 2.0 ========");
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
		for(int i=0; i<std.length; i++) {
			if (this.std[i] == null) {
				this.std[i] = new Student();
				System.out.println("------["+i+"]번 학생정보 입력 ------");
				System.out.print("-이름 입력:");
				this.std[i].setName(this.sc.next());
				
				System.out.print("-학번 입력:");
				this.std[i].setId(this.sc.next());
				
				System.out.print("-나이 입력:");
				this.std[i].setAge(this.sc.nextInt());
				
				System.out.print("-핸드폰번호 입력:");
				this.std[i].setPhone(this.sc.next());
				
				System.out.print("-성별 입력:");
				this.std[i].setGender(this.sc.next());
				
				System.out.println("-------------정보입력 완료-------------");
				
				count++;
				
				break;
			} else {
				System.out.println("더 이상 입력할 수 없습니다.");
			}
		}
	}

	public void studentPrint() {
		if (count==0) {
			System.out.println("출력할 정보가 없습니다.");
		} else {
			System.out.println("출력할 학생번호 선택(1,2,3 전부 출력하려면 0을 입력하세요.):");
			int select=sc.nextInt();
			switch(select) {
			case 1:
				if(std[0] ==null)
				{
					System.out.println("[1]번 학생 정보 없음");
				}
				else {
					System.out.println("=========[1]번 학생=========");
					System.out.println("1.이름 :" + this.std[0].getName());
					System.out.println("2.학번 :" + this.std[0].getId());
					System.out.println("3.나이 :" + this.std[0].getAge());
					System.out.println("4.핸드폰번호 :" + this.std[0].getPhone());
					System.out.println("5성별 :" + this.std[0].getGender());
				}
			case 2:
				if(std[1] ==null)
				{
					System.out.println("[2]번 학생 정보 없음");
				}
				else {
					System.out.println("=========[2]번 학생=========");
					System.out.println("1.이름 :" + this.std[1].getName());
					System.out.println("2.학번 :" + this.std[1].getId());
					System.out.println("3.나이 :" + this.std[1].getAge());
					System.out.println("4.핸드폰번호 :" + this.std[1].getPhone());
					System.out.println("5성별 :" + this.std[1].getGender());
				}
			case 3:
				if(std[2] ==null)
				{
					System.out.println("[3]번 학생 정보 없음");
				}
				else {
					System.out.println("=========[3]번 학생=========");
					System.out.println("1.이름 :" + this.std[2].getName());
					System.out.println("2.학번 :" + this.std[2].getId());
					System.out.println("3.나이 :" + this.std[2].getAge());
					System.out.println("4.핸드폰번호 :" + this.std[2].getPhone());
					System.out.println("5성별 :" + this.std[2].getGender());
				}
			case 0:
				for(int i=0;i<std.length;i++) {
					if(std[i] ==null)
					{
						System.out.println("=========["+i+"]번 학생 정보 없음=========");
					}
					else {
						System.out.println("=========["+i+"]번 학생=========");
						System.out.println("1.이름 :" + this.std[i].getName());
						System.out.println("2.학번 :" + this.std[i].getId());
						System.out.println("3.나이 :" + this.std[i].getAge());
						System.out.println("4.핸드폰번호 :" + this.std[i].getPhone());
						System.out.println("5성별 :" + this.std[i].getGender());
					}
				}
			}
		}
	}

	// 학생정보를 삭제하기 위한 메소드
	public void studentDelete() {
		if (count==0) {
			System.out.println("삭제할 정보가 없습니다.");
		} else {
			System.out.println("삭제할 학생번호 선택(1,2,3 전부 삭제하려면 0을 입력하세요.):");
			int select=sc.nextInt();
			switch(select) {
			case 1:
				if(std[0] ==null)
				{
					System.out.println("[1]번 학생 정보 없음");
					return;
				} else {
					System.out.println("[1]번 학생 정보 삭제완료");
					std[0]=null;
					count--;
				}
			case 2:
				if(std[1] ==null)
				{
					System.out.println("[2]번 학생 정보 없음");
					return;
				} else {
					System.out.println("[2]번 학생 정보 삭제완료");
					std[1]=null;
					count--;
				}
			case 3:
				if(std[2] ==null)
				{
					System.out.println("[3]번 학생 정보 없음");
					return;
				} else {
					System.out.println("[3]번 학생 정보 삭제완료");
					std[2]=null;
					count--;
				}
			case 0:
				for(int i=0;i<std.length;i++) {
					if(std[i]!=null)
					{
						System.out.println("["+i+"]번 학생 정보 삭제완료");
					}
				}
			}
		}
	}
}
