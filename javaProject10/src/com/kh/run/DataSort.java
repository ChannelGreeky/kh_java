package com.kh.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataSort {

	public void start() {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int select;
		while (true) {
			System.out.println(" = = = = = ���� ������� ���� ���α׷� ver 1.0 = = = = =");
			System.out.println("1. ���� ������ �Է�");
			System.out.println("2. ���� ������ ���");
			System.out.println("3. ���� ������ ����");
			System.out.print("����:");
			select = sc.nextInt();

			switch (select) {
			case 1:
				while (true) {
					try {
						System.out.print("���� �Է�(�ƹ� ����(��������) �Է½� ����) : ");
						al.add(sc.nextInt());
					} catch (InputMismatchException e) {
						// TODO: handle exception
						sc.next();
						break;
					}
				}
				break;
			case 2:
				for (Object i : al) {
					System.out.print((int) i + " ");
				}
				break;
			case 3:
				Collections.sort(al);
				System.out.println(" = = = = = ���� �Ϸ� = = = = = ");
				break;
			default:
				System.out.println("1~3���ڸ� �Է��ϼ���.");
				break;
			}
		}
	}
}
