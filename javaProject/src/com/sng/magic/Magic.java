package com.sng.magic;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
		System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡٽű��� ī�帶���ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
		System.out.println("===============ī�弱��===============");
		String[][] magic_trump = new String[][] {
			{"��A","��3","��6","��7","��9","��Q","��K"},
			{"��2","��4","��5","��8","��9","��10","��J"},
			{"��A","��2","��4","��5","��10","��J","��K"}
		};
		
//		new Shuffle().shuffle(magic_trump);
		
		new Print().print(magic_trump);
		
		System.out.println("���������� �� �� 21�� ī���� �Ѱ����� �����ϼ���.");
		System.out.println("���ݺ��� ���� �˾Ƹ��� ���ڽ��ϴ�.");
		
		System.out.print("\n�����ϼ����� Y�� y�� �����ּ���.");
		char answer = sc.next().charAt(0);
		if(answer == 'Y' || answer == 'y') {
			
			magic_trump = new Check().check(magic_trump);
			new Print().print(magic_trump);
			
			magic_trump = new Check().check(magic_trump);
			new Print().print(magic_trump);
			
			magic_trump = new Check().check(magic_trump);

			System.out.println("The card you choose is...");
			System.out.println("�١ڡ١ڡ١�������"+magic_trump[1][3]+"���������١ڡ١ڡ�");
		}

		else System.out.println("�׷��ٸ� ��¿�� ���׿�.. ���α׷��� �����մϴ�.");
	}
}
