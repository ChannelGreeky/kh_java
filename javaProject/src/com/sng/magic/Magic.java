package com.sng.magic;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("☆★☆★☆★☆★☆★☆신기한 카드마술★☆★☆★☆★☆★☆★☆★");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("===============카드선택===============");
		String[][] magic_trump = new String[][] {
			{"♠A","♠3","♠6","♠7","♠9","♠Q","♠K"},
			{"♣2","♣4","♣5","♣8","♣9","♣10","♣J"},
			{"♥A","♥2","♥4","♥5","♥10","♥J","♥K"}
		};
		
//		new Shuffle().shuffle(magic_trump);
		
		new Print().print(magic_trump);
		
		System.out.println("마음속으로 이 위 21개 카드중 한가지를 선택하세요.");
		System.out.println("지금부터 제가 알아맞춰 보겠습니다.");
		
		System.out.print("\n선택하셨으면 Y나 y를 눌러주세요.");
		char answer = sc.next().charAt(0);
		if(answer == 'Y' || answer == 'y') {
			
			magic_trump = new Check().check(magic_trump);
			new Print().print(magic_trump);
			
			magic_trump = new Check().check(magic_trump);
			new Print().print(magic_trump);
			
			magic_trump = new Check().check(magic_trump);

			System.out.println("The card you choose is...");
			System.out.println("☆★☆★☆　　　　"+magic_trump[1][3]+"　　　　☆★☆★☆");
		}

		else System.out.println("그렇다면 어쩔수 없네요.. 프로그램을 종료합니다.");
	}
}
