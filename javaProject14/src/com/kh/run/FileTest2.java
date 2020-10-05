package com.kh.run;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {
	Scanner sc = new Scanner(System.in);
	
	public void charInputStream() {
		System.out.println("������ ���ڸ� �о���� ���� ��Ʈ�� �ڵ�");
		System.out.println("�ε��� ���ϸ� : ");
		String fileName = sc.next();
		
		sc.nextLine(); //���� ����
		
		BufferedReader bfr = null;
		
		try {
			bfr = new BufferedReader(new FileReader(fileName));
			String line = ""; //�� ���ξ� �о���� ���� ����
			while(true) {
				line = bfr.readLine();
				if(line == null) break;
				System.out.println(line);	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
