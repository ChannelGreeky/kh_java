package com.kh.switchex;

import java.util.Scanner;

public class SwitchPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		String input;
		System.out.print("과일입력:");
		input = sc.next();
		
		switch(input) {
			case "사과": System.out.println("1000원");
				break;
			case "바나나": System.out.println("3000원");
				break;
			case "복숭아": System.out.println("2000원");
				break;
			case "키위": System.out.println("5000원");
				break;
			default: System.out.println("상점에 없습니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		System.out.println("*******초기메뉴*******");
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("0.종료");
		System.out.println("********************");
		System.out.print("메뉴번호 입력:");
		input = sc.nextInt();

		switch(input) {
			case 1: System.out.println("입력메뉴선택");
				break;
			case 2: System.out.println("수정메뉴선택");
				break;
			case 3: System.out.println("조회메뉴선택");
				break;
			case 4: System.out.println("삭제메뉴선택");
				break;
			case 0: System.out.println("프로그램을 종료합니다.");
				break;
			default: System.out.println("잘못 누르셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		System.out.println("*********메뉴*********");
		System.out.println("1.떡볶이-----------1000");
		System.out.println("2.김밥------------2000");
		System.out.println("3.오뎅------------1000");
		System.out.println("4.순대------------2000");
		System.out.println("5.튀김------------3000");
		System.out.println("5.떡튀순-----------8000");
		System.out.println("********************");
		System.out.print("메뉴번호 입력:");
		input = sc.nextInt();

		switch(input) {
			case 1: System.out.println("떡볶이는 1000원입니다.");
				break;
			case 2: System.out.println("김밥는 2000원입니다.");
				break;
			case 3: System.out.println("오뎅는 1000원입니다.");
				break;
			case 4: System.out.println("순대는 2000원입니다.");
				break;
			case 5: System.out.println("튀김는 3000원입니다.");
				break;
			case 6: System.out.println("떡튀슨는 8000원입니다.");
				break;
			default: System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		String main, sub;
		char main_menu;
		int sub_menu;
		int sum = 0;
		
		System.out.println("********주메뉴********");
		System.out.println("a.불고기버거--------5000");
		System.out.println("b.새우버거----------4000");
		System.out.println("c.치킨버거----------4500");
		System.out.println("d.한우버거---------10000");
		System.out.println("e.디버거-----------7000");
		System.out.println("********************");
		System.out.println("******사이드메뉴******");
		System.out.println("1.콜라------------1500");
		System.out.println("2.사이다-----------1500");
		System.out.println("3.밀크쉐이크--------2500");
		System.out.println("4.레드불-----------3000");
		System.out.println("********************");
		
		System.out.print("주메뉴번호 입력(a,b,c,d,e):");
		main_menu = sc.next().charAt(0);
		switch(main_menu) {
			case 'a': 
				sum += 5000;
				main = "불고기버거";
				break;
			case 'b': 
				sum += 4000;
				main = "새우버거";
				break;
			case 'c': 
				sum += 4500;
				main = "치킨버거";
				break;
			case 'd': 
				sum += 10000;
				main = "한우버거";
				break;
			case 'e': 
				sum += 7000;
				main = "디버거";
				break;
			default: 
				System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
				main = "X";
				
		}
		
		if (main != "X") {
			System.out.print("사이드메뉴번호 입력(1,2,3,4):");
			sub_menu = sc.nextInt();
			switch(sub_menu) {
				case 1: 
					sum += 1500;
					sub = "콜라";
					break;
				case 2: 
					sum += 1500;
					sub = "사이다";
					break;
				case 3: 
					sum += 2500;
					sub = "밀크쉐이크";
					break;
				case 4: 
					sum += 3000;
					sub = "레드불";
					break;
				default: 
					System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
					sub = "X";
			}
		}
		else sub="X";
		
		if(main != "X" && sub != "X") {
			System.out.println(main+","+sub+"은 총 "+sum+"원입니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("일수를 알고싶은 달을 입력하시오:");
		input = sc.nextInt();
		
		switch(input) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8: 
			case 10:
			case 12: System.out.println(input+"월달은 31일까지 있습니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println(input+"월달은 30일까지 있습니다.");
				break;
			case 2: System.out.println("2월달은 28일까지 있습니다.");
				break;
			default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("학점입력 (A,B,C,D,F):");
		grade = sc.next().charAt(0);
		
		switch(grade) {
			case 'A': System.out.println("수고하셨습니다. 장학금을 100%지급해드리겠습니다.");
				break;
			case 'B': System.out.println("약간 아쉽네요 장학금 50% 지원입니다.");
				break;
			case 'C': System.out.println("이번학기 장학금은 없네요.. 힘내세요.");
				break;
			case 'D': System.out.println("장학금보다는 학고는 면하셨네요");
				break;
			case 'F': System.out.println("이번학기 장학금으로 학고를 맞으셨습니다. 3GO일시 재적");
				break;
			default: System.out.println("잘못된 학점!!");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		char operator;
		int a, b;
		
		System.out.println("===계산기 프로그램===");
		
		System.out.print("연산자 입력(+, -, *, /) : ");
		operator = sc.next().charAt(0);
		
		System.out.print("첫 번째 숫자 입력 : ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		b = sc.nextInt();
		
		System.out.println("======결과======");
		
		System.out.printf("%d %c %d = ", a, operator, b);
		switch(operator) {
			case '+': System.out.println(a+b);
				break;
			case '-': System.out.println(a-b);
				break;
			case '*': System.out.println(a*b);
				break;
			case '/': System.out.println(a/(double)b);
				break;
			default: System.out.println("연산자를 잘못 입력하셨습니다.계산기를 종료합니다.");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
			
		int input;
		System.out.print("점수입력(0~100):");
		input = sc.nextInt();
		if (0 <= input && input >= 100) {
			switch(input/10) {
			case 10: System.out.println(input+"점 ==> A등급");
				break;
			case 9: System.out.println(input+"점 ==> A등급");
				break;
			case 8: System.out.println(input+"점 ==> B등급");
				break;
			case 7: System.out.println(input+"점 ==> C등급");
				break;
			case 6: System.out.println(input+"점 ==> D등급");
				break;
			default: System.out.println(input+"점 ==> F등급");
			}
		}
		else System.out.println("잘못된 입력(0~100사이 입력)");

	}
}
